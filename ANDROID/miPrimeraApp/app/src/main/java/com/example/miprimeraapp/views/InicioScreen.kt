package com.example.miprimeraapp.views

import android.util.Log
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.miprimeraapp.R
import com.example.miprimeraapp.models.Auto
import com.example.miprimeraapp.viewModel.VehiculoViewModel

class InicioScreen(private val navController: NavHostController? = null, private val vehiculoViewModel: VehiculoViewModel) {

    val state = vehiculoViewModel.state

    @Composable
    fun inicio(){

        LaunchedEffect(Unit) {vehiculoViewModel.obtenerVehiculos() }


        var expandirMenu by remember { mutableStateOf(false) }
        var expandirMenuDerecha by remember { mutableStateOf(false) }


        BackHandler {  }



        Scaffold(
            topBar = {
                TopAppBar(
                    modifier = Modifier.windowInsetsPadding(WindowInsets.statusBars),
                    title = { Text("Autos") },
                    navigationIcon = {
                        IconButton(onClick = {expandirMenu = true}) {
                            Icon(Icons.Filled.Menu, contentDescription = "Menu")
                        }
                        DropdownMenu(expanded = expandirMenu,
                                    onDismissRequest = {expandirMenu = false}) {
                            DropdownMenuItem(onClick = {
                                navController?.navigate("productos")
                                expandirMenu = false
                            }) {
                                Text(text = "Gestionar productos")
                            }

                            DropdownMenuItem(onClick = {
                                navController?.navigate("camara")
                                expandirMenu = false
                            }) {
                                Text(text = "Camara")
                            }

                            DropdownMenuItem(onClick = {
                                navController?.navigate("vibrar")
                                expandirMenu = false
                            }) {
                                Text(text = "Vibracion")
                            }

                            DropdownMenuItem(onClick = {
                                navController?.navigate("agregarVehiculo")
                                expandirMenu = false
                            }) {
                                Text(text = "Agregar vehiculo")
                            }
                        }
                    },
                    actions = {
                        IconButton(onClick = { expandirMenuDerecha = true} ) {
                            Icon(Icons.Filled.MoreVert, contentDescription = "Menu derecha")
                        }
                        DropdownMenu(expanded = expandirMenuDerecha,
                                    onDismissRequest = {expandirMenuDerecha = false}
                            ) {
                            DropdownMenuItem(onClick = {
                                Log.d("TAAAAG","AZUL")
                                Log.i("TAAAAG","VERDE")
                                Log.v("TAAAAG","BLANCO")
                                Log.e("TAAAAG","ROJO")

                            }) {
                                Text(text = "OPCION 1")
                            }
                        }
                    }
                )
            }
        ){innerPadding ->
            Column(modifier = Modifier.padding(innerPadding)) {
                //Text(text = "Hoooooooolaaa!")
                LazyColumn {
                    items(state.vehiculos) {a ->
                        Card(
                            modifier = Modifier.fillMaxWidth().padding(8.dp),
                            elevation = 4.dp
                        ){
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(8.dp)
                            ){
                               AsyncImage(
                                   model = a.imagenUrl,
                                   contentDescription = "Imagen de vehiculos",
                                   modifier = Modifier.height(60.dp),
                                   error = painterResource(R.drawable.honda)

                               )

                                Spacer(modifier = Modifier.width(16.dp))

                                Column (modifier = Modifier.weight(1f)){
                                    Text(text = "Marca: ${a.marca}")
                                    Text(text = "Color: ${a.color}")
                                    Text(text = "Cilindrada: ${a.cilindrada}")
                                }

                                Row{
                                    IconButton(onClick = {}) {
                                        Icon(Icons.Default.Edit,
                                            contentDescription = "Editar")
                                    }
                                    IconButton(onClick = {}) {
                                        Icon(Icons.Default.Delete,
                                            contentDescription = "Eliminar")
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }












    }
}


@Preview
@Composable
fun verInicio(){
    //InicioScreen().inicio()
}
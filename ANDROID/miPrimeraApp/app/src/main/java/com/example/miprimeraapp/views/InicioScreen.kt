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
import com.example.miprimeraapp.R
import com.example.miprimeraapp.models.Auto

class InicioScreen(private val navController: NavHostController? = null) {
    @Composable
    fun inicio(){
        var expandirMenu by remember { mutableStateOf(false) }
        var expandirMenuDerecha by remember { mutableStateOf(false) }

        var autos = listOf<Auto>(
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),
            Auto("Honda","Rojo", R.drawable.honda),




        )
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
                    items(autos) {a ->
                        Card(
                            modifier = Modifier.fillMaxWidth().padding(8.dp),
                            elevation = 4.dp
                        ){
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(8.dp)
                            ){
                                Image(
                                    painter = painterResource(id=a.imagen),
                                    contentDescription = "Imagen auto",
                                    modifier = Modifier.height(60.dp)
                                )
                                Spacer(modifier = Modifier.width(16.dp))

                                Column (modifier = Modifier.weight(1f)){
                                    Text(text = "Marca: ${a.marca}")
                                    Text(text = "Color: ${a.color}")
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
    InicioScreen().inicio()
}
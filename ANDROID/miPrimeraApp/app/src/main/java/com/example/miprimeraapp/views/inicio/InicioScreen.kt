package com.example.miprimeraapp.views.inicio

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

class InicioScreen(private val navController: NavHostController? = null) {
    @Composable
    fun inicio(){
        var expandirMenu by remember { mutableStateOf(false) }
        var expandirMenuDerecha by remember { mutableStateOf(false) }

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
                            DropdownMenuItem(onClick = {expandirMenu = false}) {
                                Text(text = "Opcion 1")
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

            }
        }












    }
}


@Preview
@Composable
fun verInicio(){
    InicioScreen().inicio()
}
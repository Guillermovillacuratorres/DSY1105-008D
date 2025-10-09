package com.example.miprimeraapp.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.miprimeraapp.R
import com.example.miprimeraapp.helper.showAlert
import com.example.miprimeraapp.viewModel.LoginViewModel



class LoginScreen(private val navController: NavHostController? = null) {

    @Composable
    fun login(){
        //var correo by remember { mutableStateOf("") }
        //var contrasena by remember { mutableStateOf("") }

        val viewModel = viewModel<LoginViewModel>()
        val correo = viewModel.loginViewModel.correo
        val contrasena = viewModel.loginViewModel.contrasena

        val nav = viewModel.deberiamosNavegar

        if(nav == true){
            navController?.navigate("inicio")
            viewModel.cambiarEstadoNavegacion()
        }


        if(viewModel.mostrarAlerta == true){
            showAlert(
                titulo = viewModel.tituloAlerta,
                mensaje = viewModel.mensajeALerta,
                onDismiss = {viewModel.descartarAlerta()},
                onConfirm = {viewModel.descartarAlerta()},
                textoBtnConfirmar = viewModel.textoBotonAlerta
            )
        }






        Column (
            modifier = Modifier.fillMaxSize().padding(32.dp),
            verticalArrangement = Arrangement.Center
        )
        {
            Text(
                text = "Iniciar sesión",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(32.dp).fillMaxWidth(),
                textAlign = TextAlign.Center
            )

            Image(
                painter = painterResource(id = R.drawable.honda),
                contentDescription = "Auto"
            )

            TextField(
                value = correo,
                onValueChange = {viewModel.cambioCorreo(it)},
                label = {Text("Correo")},
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            TextField(
                value = contrasena,
                onValueChange = {viewModel.cambioContrasena(it)},
                label = {Text("Contraseña")},
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {viewModel.auth()},
                modifier = Modifier.fillMaxWidth()
            )
            {
                Text("Acceder")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun verLogin(){
    LoginScreen().login()
}
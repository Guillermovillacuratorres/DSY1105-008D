package com.example.miprimeraapp.helper


import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun showAlert(
    titulo:String,
    mensaje: String,
    textoBtnConfirmar:String,
    onConfirm: () -> Unit,
    onDismiss: () -> Unit
){
    AlertDialog(
        title = { Text(titulo) },
        text = {Text(mensaje)},
        onDismissRequest = onDismiss,
        confirmButton = {
            Button(onClick = onConfirm) {
                Text(text = textoBtnConfirmar)
            }
        }
    )
}
package com.example.miprimeraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.room.Room
import com.example.miprimeraapp.navigation.AppNavigation
import com.example.miprimeraapp.storage.AppDatabase
import com.example.miprimeraapp.storage.ProductoRepository
import com.example.miprimeraapp.storage.ProductViewModelFactory
import com.example.miprimeraapp.viewModel.ProductoViewModel
import com.example.miprimeraapp.ui.theme.MiPrimeraAppTheme
class MainActivity : ComponentActivity() {

    private val viewModel: ProductoViewModel by viewModels {
        ProductViewModelFactory(
            ProductoRepository(
                Room.databaseBuilder(
                    applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                    .productDao()
            )
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiPrimeraAppTheme {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation(viewModel)
                }
            }
        }
    }
}

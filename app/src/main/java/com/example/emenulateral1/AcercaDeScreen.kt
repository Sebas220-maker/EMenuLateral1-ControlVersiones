package com.example.emenulateral1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AcercaDeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Acerca de",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "E-MENÚ LATERAL 1",
            style = MaterialTheme.typography.titleLarge
        )

        Text(text = "Estudiante: Sebastián Alvarado")
        Text(text = "Grupo: Escribe aquí tu grupo")
        Text(text = "Versión: 1.0")

        Text(
            text = "Aplicación de ejemplo que implementa navegación lateral con Jetpack Compose y Material 3.",
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = "Práctica de control de versiones con Git y GitHub."
        )
    }
}
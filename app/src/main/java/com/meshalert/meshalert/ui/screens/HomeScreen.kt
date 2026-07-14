package com.meshalert.meshalert.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "MeshAlert",
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                navController.navigate("sos")
            }
        ) {
            Text("Send SOS")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.navigate("safe")
            }
        ) {
            Text("I'm Safe")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.navigate("broadcast")
            }
        ) {
            Text("Broadcast Alert")
        }
    }
}
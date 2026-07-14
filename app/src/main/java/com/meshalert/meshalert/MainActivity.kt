package com.meshalert.meshalert

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.meshalert.meshalert.ui.navigation.AppNavigation
import com.meshalert.meshalert.ui.theme.MeshAlertTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MeshAlertTheme {
                AppNavigation()
            }
        }
    }
}
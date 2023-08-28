package com.plcoding.manualdependencyinjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.hilt.navigation.compose.hiltViewModel
import com.plcoding.manualdependencyinjection.presentation.MainViewModel
import com.plcoding.manualdependencyinjection.ui.theme.ManualDependencyInjectionTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManualDependencyInjectionTheme {
                val viewModel = hiltViewModel<MainViewModel>()
                Button(onClick = {
                    viewModel.login()
                }) {
                    Text(text = "Login")
                }
            }
        }
    }
}
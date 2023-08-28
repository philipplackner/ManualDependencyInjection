package com.plcoding.manualdependencyinjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.plcoding.manualdependencyinjection.presentation.MainViewModel
import com.plcoding.manualdependencyinjection.presentation.viewModelFactory
import com.plcoding.manualdependencyinjection.ui.theme.ManualDependencyInjectionTheme
import dagger.hilt.android.AndroidEntryPoint

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManualDependencyInjectionTheme {
                val viewModel = viewModel<MainViewModel>(
                    factory = viewModelFactory {
                        MainViewModel(MyApp.appModule.authRepository)
                    }
                )
                Button(onClick = {
                    viewModel.login()
                }) {
                    Text(text = "Login")
                }
            }
        }
    }
}
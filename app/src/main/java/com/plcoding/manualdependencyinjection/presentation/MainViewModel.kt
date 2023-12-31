package com.plcoding.manualdependencyinjection.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.plcoding.manualdependencyinjection.di.AppModule
import com.plcoding.manualdependencyinjection.domain.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel(
    private val authRepository: AuthRepository
): ViewModel() {

    fun login() {
        viewModelScope.launch {
            authRepository.login("test@test.com", "test123")
        }
    }
}
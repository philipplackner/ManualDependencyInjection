package com.plcoding.manualdependencyinjection.data

import com.plcoding.manualdependencyinjection.domain.AuthRepository

class AuthRepositoryImpl(
    private val api: AuthApi
): AuthRepository {

    override suspend fun login(email: String, password: String) {
        try {
            println("Logging in...")
        } catch(e: Exception) {
            e.printStackTrace()
        }
    }
}
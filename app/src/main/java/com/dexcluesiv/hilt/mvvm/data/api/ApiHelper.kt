package com.dexcluesiv.hilt.mvvm.data.api

import com.dexcluesiv.hilt.mvvm.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}
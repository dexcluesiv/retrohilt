package com.dexcluesiv.hilt.mvvm.data.api

import com.dexcluesiv.hilt.mvvm.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>

}
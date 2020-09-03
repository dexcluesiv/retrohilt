package com.dexcluesiv.hilt.mvvm.data.api

import com.dexcluesiv.hilt.mvvm.data.model.User
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): Response<List<User>> = apiService.getUsers()

}
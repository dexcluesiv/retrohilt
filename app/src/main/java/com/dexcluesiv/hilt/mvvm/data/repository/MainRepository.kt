package com.dexcluesiv.hilt.mvvm.data.repository

import com.dexcluesiv.hilt.mvvm.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()

}
package com.example.demoapp.services.networks

import com.example.demoapp.services.models.ProductListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("products")
    suspend fun getProducts(@Query("page") page: Int): Response<ProductListResponse>
}


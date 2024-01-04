package com.example.demoapp.services.repository

import com.example.demoapp.services.models.ProductListResponse
import com.example.demoapp.services.networks.ApiService
import retrofit2.Response

class ProductRepository(private val apiService: ApiService) {

    suspend fun getProducts(page: Int): Response<ProductListResponse> {
        return apiService.getProducts(page)
    }
}


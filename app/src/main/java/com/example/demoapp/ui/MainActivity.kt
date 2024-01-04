package com.example.demoapp.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demoapp.adapter.ProductAdapter
import com.example.demoapp.databinding.ActivityMainBinding
import com.example.demoapp.services.networks.ApiClient
import com.example.demoapp.services.repository.ProductRepository
import com.example.demoapp.veiwModel.ProductViewModel
import com.example.demoapp.veiwModel.ProductViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var productViewModel: ProductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val apiService = ApiClient.apiService
        val repository = ProductRepository(apiService)
        productViewModel = ViewModelProvider(this, ProductViewModelFactory(repository))
            .get(ProductViewModel::class.java)

        binding.recyclerView.layoutManager = GridLayoutManager(this,2)

        val adapter = ProductAdapter(emptyList())
        binding.recyclerView.adapter = adapter

        productViewModel.productList.observe(this, { products ->
            adapter.updateData(products)
            binding.progressbar.visibility=View.GONE
        })

        // Load initial data
        productViewModel.loadProducts(page = 1)


    }
}
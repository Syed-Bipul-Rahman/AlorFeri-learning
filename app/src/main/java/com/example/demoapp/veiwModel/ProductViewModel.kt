package com.example.demoapp.veiwModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.demoapp.services.models.Product
import com.example.demoapp.services.repository.ProductRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProductViewModel(private val repository: ProductRepository) : ViewModel() {

    private val _productList = MutableLiveData<List<Product>>()
    val productList: LiveData<List<Product>> get() = _productList

    init {
        // Initial data loading or other setup can be done here
        // For example, loadProducts()
    }

    fun loadProducts(page: Int) {
        CoroutineScope(Dispatchers.Main).launch {
            try {
                val result = repository.getProducts(page)
                if (result.isSuccessful) {
                    _productList.value = result.body()?.data ?: emptyList()
                } else {
                    // Handle error
                }
            } catch (e: Exception) {
                // Handle network or coroutine exceptions
            }
        }
    }
}

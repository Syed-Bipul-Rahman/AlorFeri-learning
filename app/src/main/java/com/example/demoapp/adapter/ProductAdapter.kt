package com.example.demoapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demoapp.R
import com.example.demoapp.services.models.Product
import com.squareup.picasso.Picasso

class ProductAdapter(private var productList: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = productList[position]

        // Bind data to views
        holder.productName.text = product.name
        holder.productPrice.text = "৳${product.price}"
        holder.productStockQuantity.text = "In Stock: ${product.stock_quantity}"

        val imageUrl = "https://demo.alorferi.com/" + product.url


        if (!product.url.isNullOrBlank()) {
            Picasso.get().load(imageUrl).into(holder.imageView)
        }

    }

    override fun getItemCount(): Int {
        return productList.size
    }

    fun updateData(newList: List<Product>) {
        productList = newList
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productName: TextView = itemView.findViewById(R.id.nameTextView)
        val productPrice: TextView = itemView.findViewById(R.id.priceTextView)
        val productStockQuantity: TextView = itemView.findViewById(R.id.stockTextView)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)

    }
}

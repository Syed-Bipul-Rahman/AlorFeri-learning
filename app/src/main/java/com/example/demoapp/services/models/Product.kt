package com.example.demoapp.services.models


data class Product(
    val id: String, val name: String, val price: Int, val stock_quantity: Int, val url: String?
)

data class ProductListResponse(
    val data: List<Product>, val links: Links, val meta: Meta
)

data class Links(
    val first: String, val last: String, val prev: String?, val next: String?
)

data class Meta(
    val current_page: Int,
    val from: Int,
    val last_page: Int,
    val links: List<PageLink>,
    val path: String,
    val per_page: Int,
    val to: Int,
    val total: Int
)

data class PageLink(
    val url: String?, val label: String, val active: Boolean
)


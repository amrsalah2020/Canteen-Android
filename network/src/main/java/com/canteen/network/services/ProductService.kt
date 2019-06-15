package com.canteen.network.services

import com.canteen.network.api.ProductFilterRequest
import com.canteen.network.api.ProductFilteredListResponse
import com.canteen.network.api.ProductResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by Amr Salah on 5/31/2019.
 */
interface ProductService {

    @POST("products/filteredList")
    suspend fun getProductsFilteredList(request: ProductFilterRequest): Response<ProductFilteredListResponse>

    @GET("products/getAll")
    suspend fun getAllProducts(): Response<List<ProductResponse>>

    @GET("favorites/getMyFavorites")
    suspend fun getFavoriteProducts(): Response<List<ProductResponse>>

}
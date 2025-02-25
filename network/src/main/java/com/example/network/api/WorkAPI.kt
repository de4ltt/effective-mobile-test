package com.example.network.api

import com.example.network.model.request.FavouriteRequest
import com.example.network.model.request.LoginCodeRequest
import com.example.network.model.request.UserLoginRequest
import com.example.network.model.response.LoginCodeResponse
import com.example.network.model.response.OfferResponse
import com.example.network.model.response.UserLoginResponse
import com.example.network.model.response.VacancyResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface WorkAPI {

    @POST("login")
    suspend fun login(@Body userLoginRequest: UserLoginRequest): Response<UserLoginResponse>

    @POST("login_code")
    suspend fun loginWithCode(@Body loginCodeRequest: LoginCodeRequest): Response<LoginCodeResponse>

    @GET("vacancies")
    suspend fun getVacancies(@Query("query") query: String): Response<List<VacancyResponse>>

    @GET("recommendations")
    suspend fun getOffers(): Response<List<OfferResponse>>

    @POST("favourite")
    suspend fun switchFavourite(@Body favouriteRequest: FavouriteRequest): Response<Nothing>

}
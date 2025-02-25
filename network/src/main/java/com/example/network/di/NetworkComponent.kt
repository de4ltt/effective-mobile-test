package com.example.network.di

import com.example.network.api.WorkAPI
import com.example.network.client.RetrofitClient
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface NetworkComponent {
    fun inject(retrofitClient: RetrofitClient)
    fun workAPI(): WorkAPI
}
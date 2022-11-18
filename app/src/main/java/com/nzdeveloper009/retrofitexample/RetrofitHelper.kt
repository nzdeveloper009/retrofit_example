package com.nzdeveloper009.retrofitexample

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private const val BASE_URL = "https://quotable.io"

    // use lazy to insure that only one instance of retrofit will be used - no duplication
    private val INSTANCE: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    // Here put your services interface if you have more
/*    val movieService: MovieService by lazy{
        retrofit.create(MoveService::class.java)
    }*/

    // another service
    val quoteService: QuotesAPI by lazy {
        INSTANCE.create(QuotesAPI::class.java)
    }
}
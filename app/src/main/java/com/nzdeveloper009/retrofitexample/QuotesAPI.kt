package com.nzdeveloper009.retrofitexample

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuotesAPI {

    // https://github.com/lukePeavey/quotable
    // https://quotable.io/quotes?page=1
    @GET("/quotes")
    suspend fun getQuotes(
        @Query("page") page: Int
    ): Response<QuoteList>

    // BASE_URL + "/quotes?page=1"

}
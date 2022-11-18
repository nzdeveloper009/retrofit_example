package com.nzdeveloper009.retrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val quotesAPI = RetrofitHelper.quoteService
        // check singleton object is created or not using debugger
        // it's assign same id
        val quotesAPI2 = RetrofitHelper.quoteService

        GlobalScope.launch { 
            val result = quotesAPI.getQuotes(1)
            val quoteList = result.body()
            quoteList?.results?.forEach{
                Log.d("NZDEVELOPER009", "Content: ${it.content}")
            }
        }
    }
}
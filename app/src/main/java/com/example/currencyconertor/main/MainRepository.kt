package com.example.currencyconertor.main

import com.example.currencyconertor.data.model.CurrencyResponse
import com.example.currencyconertor.util.Resource

interface MainRepository {

    suspend fun getRates (base: String) :Resource <CurrencyResponse>

}
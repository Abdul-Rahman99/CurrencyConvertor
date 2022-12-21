package com.example.currencyconertor.data.model


import com.example.currencyconertor.data.model.Rates

data class CurrencyResponse(
    val base: String,
    val date: String,
    val rates: Rates
)
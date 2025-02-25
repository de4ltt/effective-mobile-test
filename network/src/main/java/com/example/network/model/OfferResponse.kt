package com.example.network.model

data class OfferResponse(
    val id: String?,
    val title: String,
    val link: String,
    val button: ButtonResponse?
)
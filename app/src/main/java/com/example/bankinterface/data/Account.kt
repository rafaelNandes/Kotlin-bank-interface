package com.example.bankinterface.data

data class Account(
    val account: String,
    val agency: String,
    val balance: String,
    val limit: String,
    val client: Client,
    val card: Card
    )
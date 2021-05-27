package com.example.bankinterface.data.local

import com.example.bankinterface.data.Account
import com.example.bankinterface.data.Card
import com.example.bankinterface.data.Client

class LocalData {
    fun getLocalData() : Account {
        val client = Client("Rafael")
        val card = Card("0020")

        val account = Account(
            "01098654-9",
            "2031",
            "4.894,00",
            "9.456,00",
            client,
            card
        )
        return account
    }
}
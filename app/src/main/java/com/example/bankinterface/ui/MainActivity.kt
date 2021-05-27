package com.example.bankinterface.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.bankinterface.R
import com.example.bankinterface.data.Account

class MainActivity : AppCompatActivity() {

    //late inicialization
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        searchAccountClient()
    }

    //Create menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)
        return true
    }

    //Listen events in menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
                R.id.notification_item -> {Log.d("CLICK","Clicou no item de notificação")
                    true
                }
                else -> super.onOptionsItemSelected(item)
            }
    }

    //Search account and bind on View
    private fun searchAccountClient () {
        mainViewModel.searchAccountClient().observe(this, Observer { result ->
            findViewById<TextView>(R.id.textView_clientName).text = result.client.name
            findViewById<TextView>(R.id.textView_agency).text = result.agency
            findViewById<TextView>(R.id.textView_currentAccount).text = result.account
            findViewById<TextView>(R.id.textView_balanceValue).text = result.balance
            findViewById<TextView>(R.id.textView_balanceLimitValue).text = result.limit
            findViewById<TextView>(R.id.textView_cardFinalNumber).text = result.card.finalCardNumber
        })
    }
}


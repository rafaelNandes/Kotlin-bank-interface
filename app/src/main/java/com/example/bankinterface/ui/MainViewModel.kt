package com.example.bankinterface.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bankinterface.data.Account
import com.example.bankinterface.data.local.LocalData

class MainViewModel: ViewModel() {
    private val mutableLiveData: MutableLiveData<Account> = MutableLiveData()

    fun searchAccountClient() : LiveData<Account> {
        mutableLiveData.value = LocalData().getLocalData()
        return mutableLiveData
    }
}
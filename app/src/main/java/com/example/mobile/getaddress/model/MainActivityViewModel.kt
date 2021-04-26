package com.example.mobile.getaddress.model

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mobile.getaddress.api.WebService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel : ViewModel() {
    private val _address = MutableLiveData<MutableList<ResultData>>()
    private val service = WebService()
    val address: LiveData<MutableList<ResultData>> = _address


    fun searchAddress() {
        Log.d(
            "FGV",
            "Searching address"
        )

        viewModelScope.launch(Dispatchers.IO) {
            try {
                val res = service.getAddress()
                if (res.isSuccessful) {
                    withContext(Dispatchers.Main) {
                        _address.value = res.body()
                        Log.e("FGV", "Funcinou + ${res.body()}")
                    }
                } else {
                    Log.e("FGV", "Deu merda... \n ${res.code()}")
                }
            } catch (e: Exception) {
                Log.e("FGV", "Falhou: + ${e.stackTraceToString()}")
            }
        }
    }
}
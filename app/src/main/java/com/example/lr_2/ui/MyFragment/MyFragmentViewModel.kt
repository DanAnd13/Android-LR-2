package com.example.lr_2.ui.MyFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyFragmentViewModel: ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is My Fragment"
    }
    val text: LiveData<String> = _text
}
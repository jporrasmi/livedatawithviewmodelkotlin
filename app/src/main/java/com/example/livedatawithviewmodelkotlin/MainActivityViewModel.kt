package com.example.livedatawithviewmodelkotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }
    fun updateCount(){
       // ++count
        count.value = (count.value)?.plus(1)

    }
    //youtube.com/wath?=ARpn-FPNE4
    //room + viewModel+ livedata + recyclerView (MVVC) 11.26
}
package com.adrikhamid.a141_exercise1

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.adrikhamid.a141_exercise1.data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel {
    var namaUsr: String by mutableStateOf("")
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var emailUsr: String by mutableStateOf("")
        private set
    var jenisKl: String by mutableStateOf("")
        private set
    var statusUsr: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String, ml:String,jk:String, st:String){
        namaUsr = nm;
        noTlp = tlp;
        emailUsr = ml;
        jenisKl = jk;
        statusUsr = st;
    }

    fun setJenisK(pilihJK:String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }

    fun setStatusU(pilihST: String){
        _uiState.update { currentState -> currentState.copy(stat = pilihST) }
    }
}
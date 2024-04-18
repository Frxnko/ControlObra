package com.example.controlobra.domain.model

import com.example.controlobra.R

sealed class TitulosPartidasInfo(val img:Int, val name:Int){ // Vamos a pasar referencias
    object Cerco:TitulosPartidasInfo(R.drawable.ic_titulospartidas, R.string.cerco)
    object Torre:TitulosPartidasInfo(R.drawable.ic_titulospartidas, R.string.torre)
    object Spat:TitulosPartidasInfo(R.drawable.ic_titulospartidas, R.string.spat)
    object Iiee:TitulosPartidasInfo(R.drawable.ic_titulospartidas, R.string.iiee)
    object Losas:TitulosPartidasInfo(R.drawable.ic_titulospartidas, R.string.losas)
    object Varios:TitulosPartidasInfo(R.drawable.ic_titulospartidas, R.string.varios)
}
// esta informacion se debe recuperar. QUien la recupera es el viewModel
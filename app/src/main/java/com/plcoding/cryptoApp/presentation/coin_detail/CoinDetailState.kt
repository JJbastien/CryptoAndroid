package com.plcoding.cryptoApp.presentation.coin_detail

import com.plcoding.cryptoApp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)

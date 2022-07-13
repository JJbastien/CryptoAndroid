package com.plcoding.cryptoApp.domain.repository

import com.plcoding.cryptoApp.data.remote.dto.CoinDetailDto
import com.plcoding.cryptoApp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}
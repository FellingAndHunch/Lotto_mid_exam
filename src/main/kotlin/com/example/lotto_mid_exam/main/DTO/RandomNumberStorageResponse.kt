package com.example.lotto_mid_exam.main.DTO

data class RandomNumberStorageResponse(
    val round: Int,
    val numbers: List<Int>,
    val winnerNumbers: List<Int>,
    val isWinner: Boolean
)
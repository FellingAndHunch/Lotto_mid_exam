package com.example.lotto_mid_exam.main.controller

import com.example.lotto_mid_exam.main.DTO.RandomNumberStorageResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/random-number-storage")

//로또 API의 경우,
//가상스레드를 사용하는 것이 적합할 것 같습니다.

class RandomNumberStorageController {

    private val storage = mutableListOf<RandomNumberStorageResponse>()

    @PostMapping("/store")
    fun storeRandomNumbers(@RequestBody numbers: RandomNumberStorageResponse): ResponseEntity<String> {
        // 생성된 랜덤 번호를 저장하는 로직을 여기에 구현
        return ResponseEntity("Random Numbers Stored Successfully", HttpStatus.CREATED)
    }

    @GetMapping("/get")
    fun getRandomNumbers(): ResponseEntity<List<RandomNumberStorageResponse>> {
        // 저장된 랜덤 번호를 조회하는 로직을 여기에 구현
        return ResponseEntity(storage, HttpStatus.OK)
    }
}
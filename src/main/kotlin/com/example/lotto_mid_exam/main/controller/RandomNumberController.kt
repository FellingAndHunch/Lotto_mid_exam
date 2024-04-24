package com.example.lotto_mid_exam.main.controller


import com.example.lotto_mid_exam.main.DTO.RandomNumberRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/random-number")
class RandomNumberController {


    //로또 API의 경우,
    //가상스레드를 사용하는 것이 적합할 것 같습니다.
    @PostMapping("/generate")
    fun generateRandomNumbers(@RequestBody request: RandomNumberRequest): ResponseEntity<List<List<Int>>> {
        // 랜덤 번호 생성 로직을 여기에 구현
        return ResponseEntity<List<List<Int>>>(listOf(), HttpStatus.OK)
    }
}
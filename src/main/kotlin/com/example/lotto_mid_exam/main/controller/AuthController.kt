package com.example.lotto_mid_exam.main.controller


import com.example.lotto_mid_exam.main.DTO.AuthRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/auth")
class AuthController {

    @PostMapping("/login")
    fun login(@RequestBody request: AuthRequest): ResponseEntity<String> {
        // 로그인 로직을 여기에 구현
        return ResponseEntity("Login Successful", HttpStatus.OK)
    }

    @PostMapping("/create")
    fun createUser(@RequestBody request: AuthRequest): ResponseEntity<String> {
        // 회원가입 로직을 여기에 구현
        return ResponseEntity("User Created Successfully", HttpStatus.CREATED)
    }
}
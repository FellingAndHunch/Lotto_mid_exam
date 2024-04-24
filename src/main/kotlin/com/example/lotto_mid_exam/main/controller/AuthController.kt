package com.example.lotto_mid_exam.main.controller

import com.example.lotto_mid_exam.controller.dto.AuthRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/auth")
class AuthController {

    @PostMapping("/login")
    fun login(@RequestBody request: AuthRequest): ResponseEntity<String> {
        // 로그인 로직을 여기에 구현합니다.
        // request에 포함된 이메일과 비밀번호를 사용하여 로그인을 처리합니다.
        // 성공시에는 토큰을 발급하거나 세션을 생성하여 응답합니다.
        // 실패시에는 적절한 에러 메시지를 반환합니다.
        return ResponseEntity("Login Successful", HttpStatus.OK)
    }

    @PostMapping("/create")
    fun createUser(@RequestBody request: AuthRequest): ResponseEntity<String> {
        // 회원가입 로직을 여기에 구현합니다.
        // request에 포함된 정보를 사용하여 새로운 사용자를 생성합니다.
        // 사용자 생성 후 적절한 응답을 반환합니다.
        return ResponseEntity("User Created Successfully", HttpStatus.CREATED)
    }
}
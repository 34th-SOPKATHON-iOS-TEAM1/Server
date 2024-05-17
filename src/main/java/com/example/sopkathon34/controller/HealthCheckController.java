package com.example.sopkathon34.controller;

import com.example.sopkathon34.common.response.BaseResponse;
import com.example.sopkathon34.common.response.SuccessMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {
    @GetMapping
    public ResponseEntity<BaseResponse<Void>> healthCheck() {
        return ResponseEntity.ok(BaseResponse.success(SuccessMessage.HEALTH_CHECK_SUCCESS));
    }
}

package com.example.studyjwt.controller;

import com.example.studyjwt.Service.JoinService;
import com.example.studyjwt.controller.dto.JoinDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @PostMapping("/join")
    public String joinProcess(@RequestBody JoinDto joinDto) {

        joinService.joinProcess(joinDto);
        return "OK";
    }
}

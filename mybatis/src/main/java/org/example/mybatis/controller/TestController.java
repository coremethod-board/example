package org.example.mybatis.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.mybatis.mapper.TestMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestMapper testMapper;

    @GetMapping
    public ResponseEntity<List<String>> testController() {
        return new ResponseEntity<>(testMapper.findAll(), HttpStatus.OK);
    }

}

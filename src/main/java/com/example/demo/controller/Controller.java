package com.example.demo.controller;

import com.example.demo.MyService;
import io.micrometer.observation.annotation.Observed;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Observed
@RestController
public class Controller {
  @Autowired
  MyService myService;

  @GetMapping("/api")
  ResponseEntity<String> one() {
    return ResponseEntity.ok(myService.getText());
  }


}

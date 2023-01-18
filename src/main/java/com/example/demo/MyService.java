package com.example.demo;

import io.micrometer.observation.annotation.Observed;
import org.springframework.stereotype.Service;

@Service
@Observed
public class MyService {
  public String getText(){
    return "Тратата";
  }

}
package com.diet.project.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }

//    @GetMapping("/sample")
//    public SampleVO makeSample() {
//        SampleVO sampleVO = new SampleVO();
//
//        sampleVO.setS1("1");
//        sampleVO.setS2("2");
//
//        System.out.println(sampleVO);
//        return sampleVO;
//    }
}

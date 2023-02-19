package com.example.demo.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.ModelTest;

@RestController
public class TestComtroller {

    // 受け取りのお作法
    // アノテーション付与
    @PostMapping("/test")
    public ModelAndView test(@ModelAttribute ModelTest modelTest, ModelAndView mv) {

        StringBuilder testst = new StringBuilder();
        testst.append("name:" + modelTest.getName());
        testst.append("category:" + modelTest.getCategory());
        testst.append("amount:" + modelTest.getAmount());

        // テンプレートの名前指定
        mv.setViewName("result");
        mv.addObject("resultdata", testst.toString());
        return mv;
    }
}

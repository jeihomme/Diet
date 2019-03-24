package com.diet.project.demo.controller;

import com.diet.project.demo.dao.MemberMapper;
import com.diet.project.demo.domain.Member;
import com.diet.project.demo.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MemberController {

    @Resource(name = "com.diet.project.demo.service.MemberService")
    MemberService memberService;

    @RequestMapping(value = "/list")
    private String memberList(Model model) throws Exception {

        model.addAttribute("list", memberService.memberListService());
        System.out.println(memberService.memberListService());

        return "/list";
    }
}

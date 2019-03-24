package com.diet.project.demo.service;

import com.diet.project.demo.dao.MemberMapper;
import com.diet.project.demo.domain.Member;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("com.diet.project.demo.service.MemberService")
public class MemberService {

    @Resource(name = "com.diet.project.demo.dao.MemberMapper")
    MemberMapper memberMapper;

    public int memberCount() throws Exception {
        return memberMapper.memberCount();
    }

    public List<Member> memberListService() throws Exception{
        return memberMapper.memberList();
    }
}

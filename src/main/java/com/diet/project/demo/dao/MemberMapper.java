package com.diet.project.demo.dao;

import com.diet.project.demo.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("com.diet.project.demo.dao.MemberMapper")
public interface MemberMapper {

    public int memberCount() throws Exception;

    public List<Member> memberList() throws Exception;
}

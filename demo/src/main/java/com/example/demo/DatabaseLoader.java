package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// 確保導入 Member 類別
import com.example.demo.Model.Member;
import com.example.demo.Dao.MemberRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public void run(String... args) throws Exception {

        Member member = new Member("michael@gmail.com", "abc12345", "michael", "jordan");
        memberRepository.save(member);

    }
}
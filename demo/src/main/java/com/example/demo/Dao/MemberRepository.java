package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 確保導入 Member 類別
import com.example.demo.Model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
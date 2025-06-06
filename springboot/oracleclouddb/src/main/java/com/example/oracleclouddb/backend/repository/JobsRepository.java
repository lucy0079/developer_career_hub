package com.example.oracleclouddb.backend.repository;

import com.example.oracleclouddb.backend.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JOBS 테이블에 접근하는 Repository 인터페이스입니다.
 */
@Repository
public interface JobsRepository extends JpaRepository<Jobs, Long> {
    // 기본적인 findAll(), save(), delete() 등 메서드 자동 생성됨
}

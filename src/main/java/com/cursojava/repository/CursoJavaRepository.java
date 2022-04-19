package com.cursojava.repository;

import com.cursojava.domain.CursoJava;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoJavaRepository extends JpaRepository< CursoJava, Long > {
}

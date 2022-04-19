package com.cursojava.service;

import com.cursojava.domain.CursoJava;
import com.cursojava.repository.CursoJavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoJavaService {

    @Autowired
    CursoJavaRepository cursoJavaRepository;

    public void criarLead(CursoJava cursoJava){
        cursoJavaRepository.save(cursoJava);
    }

    public Iterable<CursoJava> exibirPageCurso(){
        return cursoJavaRepository.findAll();
    }
}

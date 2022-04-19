package com.cursojava.controller;

import com.cursojava.domain.CursoJava;
import com.cursojava.service.CursoJavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CursoJavaController {

    @Autowired
    CursoJavaService cursoJavaService;

    @GetMapping("/mT3ch-curso-java")
    public String index() {
        return "index";
    }

    @PostMapping("/mT3ch-curso-java")
    public String cadastrarCurso(CursoJava cursoJava) {
        cursoJavaService.criarLead(cursoJava);
        return "pages/cursoJava";
    }


    @GetMapping("/mT3ch-receber-curso-java")
    public ModelAndView receberCurso() {
        ModelAndView model = new ModelAndView("pages/cursoJava");
        Iterable<CursoJava> cursoJava = cursoJavaService.exibirPageCurso();
        model.addObject("cursoJava", cursoJava);
        return model;
    }
}

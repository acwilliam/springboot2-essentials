package com.acwilliam.springboot.controller;

import com.acwilliam.springboot.dominio.Anime;
import com.acwilliam.springboot.util.DateUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Log4j2
@RequestMapping("anime")
public class AnimeController {

    @Autowired
    private DateUtil dateUtil;

    @GetMapping(path = "list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDateBaseStyle(LocalDateTime.now()));
    return List.of(new Anime("DBZ"),new Anime("Naruto"), new Anime("Boruto"));
    }
}

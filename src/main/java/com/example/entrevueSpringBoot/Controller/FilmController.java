package com.example.entrevueSpringBoot.Controller;

import com.example.entrevueSpringBoot.Entity.Film;
import com.example.entrevueSpringBoot.Repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
//create rest api to access resources
@RestController()
public class FilmController {
    @Autowired
    private FilmRepository filmRepository;

    @GetMapping(path = "api/film/{id}")
    public Optional<Film> getFilmById(@PathVariable Long id){
        return filmRepository.findById(id);
    }

    @PostMapping(path="api/film")
    public Film addFilm(@RequestBody Film film){
        return filmRepository.save(film);
    }

}

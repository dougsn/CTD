package com.movie.movie.service;

import com.movie.movie.entity.Movie;
import com.movie.movie.repository.IMovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class MovieService {
    final static Logger log = Logger.getLogger(MovieService.class.getName());
    private final IMovieRepository movieRepository;

    @Value("${queue.movie.name}")
    private String queueMovie;
    @Autowired
    private RabbitTemplate rabbitTemplate;

//      rabbitTemplate.convertAndSend(queuePessoa,pessoa);
//        return "Enviando pessoa: " + pessoa;

    public List<Movie> findAll() {
        log.info("Buscando todos os filmes");
        List<Movie> movies;
        return movies = movieRepository.findAll();
    }

    public List<Movie> findAllListener() {

        List<Movie> movies;
        rabbitTemplate.convertAndSend(queueMovie, "Foi");
        return movies = movieRepository.findAll();
    }



    public List<Movie> findByGenero(String genero) {
        log.info("Buscando filmes pelo genero: " + genero);
        List<Movie> movie;
        movie = movieRepository.findByGenero(genero);
        if (movie != null){
            return movie;
        } else {
            log.info("Não foi possível buscar os filmes do genero: " + genero);
            return null;
        }
    }

    public Optional<Movie> findById(Long id) {
        Optional<Movie> movie;

        movie = movieRepository.findById(id);
        if(movie.isPresent()){
            log.info("Buscando o filme pelo ID: " + id);
            return movie;
        } else {
            log.info("Não foi possível buscar o filme de ID: " + id);
            return Optional.of(null);
        }
    }

    public Optional<Movie> addMovie(Movie movie) {
        if (movie == null) {
            log.info("Não foi possível adicionar este filme.");
            return Optional.of(null);
        } else {
            log.info("Adicionando um novo filme.");
            Movie newMovie = movieRepository.saveAndFlush(
                    new Movie(
                            null,
                            movie.getName(),
                            movie.getGenero(),
                            movie.getUrlStream()
                    )
            );
            return Optional.of(newMovie);
        }
    }

    public Optional<Movie> updateMovie (Movie movie) {
        if (movie == null) {
            log.info("Não foi possível atualizar este filme.");
            return Optional.of(null);
        } else {
            log.info("Atualizando um novo filme.");
            Movie movieUpdate = new Movie (
                    movie.getId(),
                    movie.getName(),
                    movie.getGenero(),
                    movie.getUrlStream()
            );
            return Optional.of(movieRepository.saveAndFlush(movieUpdate));
        }
    }


    public Boolean hardDeleteMovie(Long id) {
        if(movieRepository.findById(id).isPresent()){
            log.info("Deletando o filme de ID: " + id);
            movieRepository.deleteById(id);
            return true;
        }
        log.info("Não foi possível deletar o filme de ID: " + id);
        return false;
    }



}

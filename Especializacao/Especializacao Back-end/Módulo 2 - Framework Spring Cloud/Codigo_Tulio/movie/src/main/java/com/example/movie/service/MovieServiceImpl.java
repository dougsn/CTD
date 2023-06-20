package com.example.movie.service;

import com.example.movie.dto.MovieDTO;
import com.example.movie.entity.Movie;
import com.example.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository repository;

    @Override
    public void save(MovieDTO dto) {
        var entity = Movie.builder().id(dto.getId()).description(dto.getDescription()).genre(dto.getGenre()).build();
        repository.save(entity);
    }

    @Override
    public List<MovieDTO> findByGenre(String genre) {
        return repository.findByGenre(genre).stream().map(MovieDTO::new).collect(Collectors.toList());
    }
}

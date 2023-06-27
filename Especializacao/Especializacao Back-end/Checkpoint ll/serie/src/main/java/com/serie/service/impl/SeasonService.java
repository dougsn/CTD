//package com.serie.service.impl;
//
//import com.netflix.discovery.converters.Auto;
//import com.serie.entity.Chapter;
//import com.serie.entity.Season;
//import com.serie.repository.ISeasonRepository;
//import com.serie.service.ISerieService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class SeasonService implements ISerieService<Season> {
//
//    @Autowired
//    private ISeasonRepository repository;
//
//    @Override
//    public List<Season> findAll() {
//        return repository.findAll();
//    }
//
//
//
//    @Override
//    public Optional<Season> add(Season season) {
//        Season s = repository.saveAndFlush(new Season(null, season.getSeasonNumber(), season.getChapters()));
//        return Optional.of(s);
//    }
//
//
//}

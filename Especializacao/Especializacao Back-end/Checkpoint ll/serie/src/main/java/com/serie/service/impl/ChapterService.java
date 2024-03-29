//package com.serie.service.impl;
//
//import com.serie.entity.Chapter;
//import com.serie.repository.IChapterRepository;
//import com.serie.service.ISerieService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ChapterService implements ISerieService<Chapter> {
//
//    @Autowired
//    private IChapterRepository repository;
//
//    @Override
//    public List<Chapter> findAll() {
//        return repository.findAll();
//    }
//
//
//    @Override
//    public Optional<Chapter> add(Chapter chapter) {
//        Chapter c = repository.saveAndFlush(new Chapter(null, chapter.getName(), chapter.getNumber(), chapter.getUrlStream()));
//        return Optional.of(c);
//    }
//
//}

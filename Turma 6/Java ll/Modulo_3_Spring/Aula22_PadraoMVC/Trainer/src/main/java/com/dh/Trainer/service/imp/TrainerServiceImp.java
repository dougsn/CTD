package com.dh.Trainer.service.imp;

import com.dh.Trainer.model.Trainer;
import com.dh.Trainer.service.TrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImp implements TrainerService  {
    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(new Trainer("Marcos"), new Trainer("Ana"));
    }
}

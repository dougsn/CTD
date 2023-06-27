package com.serie.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


import java.util.List;

//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Season {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private Integer seasonNumber;
//    @OneToMany(mappedBy = "season")
    private List<Chapter> chapters;
//    @JsonBackReference
//    @ManyToOne
//    @JoinColumn(name = "serie_id")
//    private Serie serie;
}

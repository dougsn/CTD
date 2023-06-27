package com.serie.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


import java.util.List;

//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Chapter {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private Integer number;
    private String urlStream;
//    @JsonBackReference
//    @ManyToOne
//    @JoinColumn(name = "season_id")
//    private Season season;
}

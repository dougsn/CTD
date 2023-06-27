package com.serie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


import java.util.List;

//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Serie {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String genre;
//    @OneToMany(mappedBy = "serie")
    private List<Season> seasons;
}

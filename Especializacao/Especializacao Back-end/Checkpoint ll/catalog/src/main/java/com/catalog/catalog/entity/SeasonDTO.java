package com.catalog.catalog.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeasonDTO {
    private Long id;
    private Integer seasonNumber;
    private List<ChapterDTO> chapters;
}

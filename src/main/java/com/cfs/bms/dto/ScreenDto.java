package com.cfs.bms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScreenDto {

    private Long id;
    private String name;
    private Integer totalSeats;
    private TheaterDto theater;

   
}

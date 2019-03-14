package com.movie.example.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class MovieAndActorsDto {
	
	private Long id;
	private String title;
	private String genre;
	private int year;
	private String actors;
}

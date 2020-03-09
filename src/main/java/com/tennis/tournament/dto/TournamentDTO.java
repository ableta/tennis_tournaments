package com.tennis.tournament.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class TournamentDTO {
	
	private Long id;

	private String  tournamentName;
	
	private String tournamentLocation;
	
	private String tournamentSurface;

	private String tournamentPoints;
	
	private String tournamentType;

	
}

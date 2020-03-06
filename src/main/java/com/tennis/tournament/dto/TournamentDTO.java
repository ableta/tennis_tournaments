package com.tennis.tournament.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TournamentDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;

	private String  tournamentName;
	
	private String tournamentLocation;
	
	private String tournamentSurface;

	private String tournamentPoints;
	
	private String tournamentType;

	
}

package com.tennis.tournament.services;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tennis.tournament.dto.TournamentDTO;

public interface TournamentService {

	public List<TournamentDTO> listTournaments() throws JsonProcessingException;
	
 
	public void addTournament(TournamentDTO tournamentDTO) throws JsonProcessingException;
	
}

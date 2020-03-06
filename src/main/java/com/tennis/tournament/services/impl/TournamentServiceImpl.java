package com.tennis.tournament.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tennis.tournament.converters.TournamentDTOConverter;
import com.tennis.tournament.dto.TournamentDTO;
import com.tennis.tournament.entities.Tournament;
import com.tennis.tournament.repositories.TournamentRepository;
import com.tennis.tournament.services.TournamentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TournamentServiceImpl implements TournamentService {

	private final TournamentRepository tournamentRepository;
	
	public static final TournamentDTOConverter TOURNAMENT_DTO_CONVERTER = new TournamentDTOConverter();
	
	@Override
	public List<TournamentDTO> listTournaments() throws JsonProcessingException {
		
		List<Tournament> result = tournamentRepository.findAll();


//		logger.info(result);
		List<TournamentDTO> response = result.stream().map(index -> TOURNAMENT_DTO_CONVERTER.convertFromEntityToModel(index)).collect(Collectors.toList());
		
		
		
		return response;
	}



	
	
}

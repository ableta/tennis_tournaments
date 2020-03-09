package com.tennis.tournament.converters;

import com.tennis.tournament.dto.TournamentDTO;
import com.tennis.tournament.entities.Tournament;

public class TournamentDTOConverter implements ModelConverter<Tournament, TournamentDTO>{

	@Override
	public Tournament convertFromModelToEntity(TournamentDTO tournamentDTO) {

				return Tournament.builder()
		 				.tournamentLocation(tournamentDTO.getTournamentLocation())
						.tournamentName(tournamentDTO.getTournamentName())
						.tournamentPoints(tournamentDTO.getTournamentPoints())
						.tournamentSurface(tournamentDTO.getTournamentSurface())
						.tournamentType(tournamentDTO.getTournamentType()).build();
					
	}

	@Override
	public TournamentDTO convertFromEntityToModel(Tournament e) {
 		return TournamentDTO.builder()
				.id(e.getId())
 				.tournamentLocation(e.getTournamentLocation())
				.tournamentName(e.getTournamentName())
				.tournamentPoints(e.getTournamentPoints())
				.tournamentSurface(e.getTournamentSurface())
				.tournamentType(e.getTournamentType()).build();
	}


}

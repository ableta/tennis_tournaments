package com.tennis.tournament.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@Builder(toBuilder = true)
@Table(name = "tournaments")
@NoArgsConstructor
@AllArgsConstructor
public class Tournament {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "tournament_name")
	private String  tournamentName;
	
	@Column(name = "tournament_location")
	private String tournamentLocation;
	
	@Column(name = "tournament_surface")
	private String tournamentSurface;

	@Column(name = "tournament_points")
	private String tournamentPoints;
	
	@Column(name = "tournament_type")
	private String tournamentType;


	
	
	
}

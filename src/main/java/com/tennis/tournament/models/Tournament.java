package com.tennis.tournament.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.persistence.Table;


@Entity
@Table(name = "tournaments")

public class Tournament {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "tournament_name", nullable = false)
	private String  tournamentName;
	
	@Column(name = "tournament_location", nullable = false)
	private String tournamentLocation;
	
	@Column(name = "tournament_surface", nullable = false)
	private String tournamentSurface;

	@Column(name = "tournament_points", nullable = false)
	private String tournamentPoints;
	
	@Column(name = "tournament_type", nullable = false)
	private String tournamentType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public String getTournamentLocation() {
		return tournamentLocation;
	}

	public void setTournamentLocation(String tournamentLocation) {
		this.tournamentLocation = tournamentLocation;
	}

	public String getTournamentSurface() {
		return tournamentSurface;
	}

	public void setTournamentSurface(String tournamentSurface) {
		this.tournamentSurface = tournamentSurface;
	}

	public String getTournamentPoints() {
		return tournamentPoints;
	}

	public void setTournamentPoints(String tournamentPoints) {
		this.tournamentPoints = tournamentPoints;
	}

	public String getTournamentType() {
		return tournamentType;
	}

	public void setTournamentType(String tournamentType) {
		this.tournamentType = tournamentType;
	}

	@Override
	public String toString() {
		return "Tournaments [id=" + id + ", tournamentName=" + tournamentName + ", tournamentLocation="
				+ tournamentLocation + ", tournamentSurface=" + tournamentSurface + ", tournamentPoints="
				+ tournamentPoints + ", tournamentType=" + tournamentType + "]";
	}
	
	
	
}

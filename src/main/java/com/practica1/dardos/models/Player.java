package com.practica1.dardos.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component

@Getter
@Setter

public class Player {

	public Player() {

	}

	private String name;
	private int[] points;
	private int sumPoints;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Integer> pointsHistorical = new ArrayList();
	private int pointHistoricalTotal;

	public Player(String name) {
		this.name = name;
	}
}

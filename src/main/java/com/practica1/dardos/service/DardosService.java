package com.practica1.dardos.service;

import java.util.Arrays;
import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.practica1.dardos.models.Player;
import com.practica1.dardos.models.PointsHistorical;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class DardosService {
	private LinkedList<Player> players;
	private LinkedList<PointsHistorical> historicals;

	public LinkedList<Player> preparePlayers(int numPlayers) {
		players = new LinkedList<Player>();
		for (int i = 1; i <= numPlayers; i++) {
			this.players.add(new Player("Player" + i));
		}
		return players;
	}

	public void getPoints(Player player) {
		int[] points = { generatedRandomNumber(), generatedRandomNumber(), generatedRandomNumber() };
		player.setPoints(points);
		player.setSumPoints(Arrays.stream(points).sum());
		player.getPointsHistorical().add(Integer.valueOf(player.getSumPoints()));
		player.setPointHistoricalTotal(player.getPointsHistorical().stream().mapToInt(i -> i).sum());
	}

	private int generatedRandomNumber() {
		return ((int) (1 + Math.random() * 20)) * ((int) (1 + Math.random() * 3));
	}
}

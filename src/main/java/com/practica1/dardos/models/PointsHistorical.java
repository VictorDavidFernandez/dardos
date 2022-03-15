package com.practica1.dardos.models;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter

public class PointsHistorical {
	private List<Integer> pointsHistorical;
}

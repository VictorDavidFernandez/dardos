package com.practica1.dardos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.practica1.dardos.models.Player;
import com.practica1.dardos.service.DardosService;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
public class PlayerController {
	@Autowired
	private DardosService service;

	@GetMapping("/")
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView("index");
		service.preparePlayers(5);
		modelAndView.addObject("players", service.getPlayers());
		return modelAndView;
	}

	@GetMapping("throwing")
	public ModelAndView throwing() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("players", service.getPlayers());
		for (Player player : service.getPlayers()) {
			service.getPoints(player);
		}

		return modelAndView;
	}
}

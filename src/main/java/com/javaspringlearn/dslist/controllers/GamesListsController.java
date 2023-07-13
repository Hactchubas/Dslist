package com.javaspringlearn.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspringlearn.dslist.dto.GameMinDTO;
import com.javaspringlearn.dslist.dto.GamesListDTO;
import com.javaspringlearn.dslist.sevices.GameService;
import com.javaspringlearn.dslist.sevices.GamesListsService;

@RestController
@RequestMapping(value = "/lists")
public class GamesListsController {
	@Autowired
	private GamesListsService gamesListsService;
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GamesListDTO> findAll(){
		List<GamesListDTO> result = gamesListsService.findAll();
		return result;
	}	
	
	@GetMapping(value = "/{id}")
	public GamesListDTO findById(@PathVariable Long id) {
		GamesListDTO result = gamesListsService.findById(id);
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId) {
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
}

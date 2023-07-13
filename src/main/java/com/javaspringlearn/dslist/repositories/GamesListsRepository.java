package com.javaspringlearn.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspringlearn.dslist.entities.GameList;

public interface GamesListsRepository extends JpaRepository<GameList, Long> {

}

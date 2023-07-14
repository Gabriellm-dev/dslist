package com.dvsupjava.dslist.repositories;

import com.dvsupjava.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

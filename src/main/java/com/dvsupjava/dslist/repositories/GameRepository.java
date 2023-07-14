package com.dvsupjava.dslist.repositories;

import com.dvsupjava.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}

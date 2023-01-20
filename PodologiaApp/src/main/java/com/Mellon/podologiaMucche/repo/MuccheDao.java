package com.Mellon.podologiaMucche.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mellon.podologiaMucche.entities.Animale;

public interface MuccheDao extends JpaRepository<Animale, Integer> {

}

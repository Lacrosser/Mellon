package com.Mellon.podologiaMucche.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mellon.podologiaMucche.entities.Patologia;

public interface PatologiaDao extends JpaRepository<Patologia, Integer> {

}

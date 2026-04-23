package com.recupera.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryJugador<id> extends JpaRepository<id, long> {
}

package com.evento.eventoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evento.eventoapp.model.Evento;

@Repository
public interface EventoRepository extends JpaRepository <Evento, Long>{

}

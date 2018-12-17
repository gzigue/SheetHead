package br.com.sheethead.tormentaRPG.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sheethead.tormentaRPG.domain.Pericia;

@Repository
public interface PericiaRepository extends JpaRepository<Pericia, Integer> {

}

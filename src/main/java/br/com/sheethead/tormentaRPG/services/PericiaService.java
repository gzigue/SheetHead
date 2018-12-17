package br.com.sheethead.tormentaRPG.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sheethead.tormentaRPG.domain.Pericia;
import br.com.sheethead.tormentaRPG.repositories.PericiaRepository;

@Service
public class PericiaService {
	
	@Autowired
	private PericiaRepository periciaRepository;
	
	public Pericia find(Integer id) {
		Optional<Pericia> obj = periciaRepository.findById(id);
		return obj.orElse(null);
	}

}

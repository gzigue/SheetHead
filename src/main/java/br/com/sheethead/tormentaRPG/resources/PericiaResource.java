package br.com.sheethead.tormentaRPG.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sheethead.tormentaRPG.domain.Pericia;
import br.com.sheethead.tormentaRPG.enums.Atributo;

@RestController
@RequestMapping(value="/pericias")
public class PericiaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> find() {
		
		Pericia cura = new Pericia(1, "Cura", Atributo.SAB, false, false);
		Pericia ladinagem = new Pericia(2, "Ladinagem", Atributo.DES, true, true);
		
		List<Pericia> pericias = new ArrayList<>();
		pericias.addAll(Arrays.asList(cura, ladinagem));
		
		return ResponseEntity.ok().body(pericias);	
	}

}

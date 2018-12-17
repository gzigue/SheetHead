package br.com.sheethead.tormentaRPG.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sheethead.tormentaRPG.domain.Pericia;
import br.com.sheethead.tormentaRPG.services.PericiaService;

@RestController
@RequestMapping(value="/pericias")
public class PericiaResource {
	
	@Autowired
	private PericiaService service; 
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Pericia obj = service.find(id);
		return ResponseEntity.ok().body(obj);
				
//		Pericia cura = new Pericia(1, "Cura", Atributo.SAB, false, false);
//		Pericia ladinagem = new Pericia(2, "Ladinagem", Atributo.DES, true, true);
		
	}

}

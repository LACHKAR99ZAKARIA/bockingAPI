package ma.emsi.projetjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import  ma.emsi.projetjpa.entities.Livre;
import ma.emsi.projetjpa.service.LivreService;



@RestController
public class LivreController {
	@Autowired
	LivreService livreService;
	
		  @GetMapping("/emsi_api/livres")
		  public List<Livre> getAllBooks() {
			   return this.livreService.getAllBooks();
		  }
	
		  @GetMapping("/emsi_api/livres/{id}") 
		  public List<Livre> getBookById(@PathVariable Integer id) { 
			  return this.livreService.getBookById(id);
		  }
		 
	  
	  
		
		  
		  @PutMapping("/emsi_api/livres/{id}") 
		  public void updateBookById(@RequestBody Livre livre, @PathVariable Integer id) {
			  //livreService.updateBookById(livre, id);
			}
		  
		  
		  
		  @DeleteMapping("/emsi_api/livres/{id}") 
		  public void deleteBookById(@PathVariable Integer id) {
			  livreService.deleteBookById(id);
		  }
		 
	

	

}

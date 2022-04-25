package ma.emsi.projetjpa.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.OrderBy;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import ma.emsi.projetjpa.entities.Livre;
import ma.emsi.projetjpa.repos.LivreRepo;



@Component
public class LivreService {
	
	
	
	private LivreRepo livreRepo;
	
	//Constructor
	public LivreService(LivreRepo livreRepo) {
		 this.livreRepo=livreRepo; 
	}
	
	
	//Method To Find All Books Ascending
	@OrderBy
	public List<Livre> getAllBooks() {
		return livreRepo.findAll();
	}
	
	//Method To Find Book By Id
	public List<Livre> getBookById (Integer id) {
		Optional<Livre> livre = livreRepo.findById(id);
		if(livre.isPresent()) {
			return livreRepo.findAllById(id);
		}else {
			throw new RuntimeException("Book not found for the id "+id);
		}
		
	}
	
	//Delete book By Id
	public String deleteBookById(Integer id) {
		Optional<Livre> livre = livreRepo.findById(id);
		if(livre.isPresent()) {
			livreRepo.deleteById(id);
			return ("Book deleted with id "+id);
		}else {
			throw new RuntimeException("Book not found for the id "+id);
		}
	}
	
	
	//Update book By Id


}

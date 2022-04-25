package ma.emsi.projetjpa.repos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.projetjpa.entities.Livre;


@Transactional
public interface LivreRepo  extends JpaRepository<Livre, Integer>{
	
				List<Livre> findAllById(Integer id);
				List<Livre> findAll();
				
}

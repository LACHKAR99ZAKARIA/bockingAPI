package ma.emsi.projetjpa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Table (name = "LIVRE")
@Entity 
@Data @AllArgsConstructor @NoArgsConstructor


public class Livre {

	public Livre(Object id2, String titreLivre2, String maisonEditionLivre2, Date dateSortieLivre2, String auteurLivre2,
			int nombrePageLivre2, String isbnLivre2, Object derniereConsultation2, boolean disponibilteLivre2) {
		// TODO Auto-generated constructor stub
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	
	@Column(name = "TITRE",length = 50,nullable = false)
	private String titreLivre;
	
	@Column(name = "MAISON_EDITION",length = 50,nullable = false,updatable = false)
	private String maisonEditionLivre;
	
	@Temporal(TemporalType.DATE)
	private Date dateSortieLivre;
	
	@Column(name = "AUTEUR",length = 50,nullable = false)
	private String auteurLivre;
	
	@Column(name = "NOMBRE_PAGE",nullable = false)
	private int nombrePageLivre;
	
	@Column(name="ISBN",length = 20,nullable = false,unique = true,updatable = false)
	private String isbnLivre;
	
	@Temporal(TemporalType.TIMESTAMP) @CreationTimestamp
	private Date derniereConsultation;
	
	private boolean disponibilteLivre;
	
	
}

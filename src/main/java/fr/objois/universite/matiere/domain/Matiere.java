package fr.objois.universite.matiere.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import fr.objois.universite.enseignant.domain.Enseignant;
import fr.objois.universite.note.domain.Note;

@Entity(name="t_matiere")
public class Matiere {
	@Column(name="id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="numero_matiere")
	private Integer numeroMatiere;
	@Column(name="nom")
	private String nom;
	@Column(name="coef")
	private Integer coef;
	@Column(name="date_debut")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateDebut;
	@Column(name="date_fin")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateFin;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_enseignant")
	private Enseignant enseignant;
	
	@OneToMany(mappedBy="matiere")
	private List<Note> notes;


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumeroMatiere() {
		return numeroMatiere;
	}
	public void setNumeroMatiere(Integer numeroMatiere) {
		this.numeroMatiere = numeroMatiere;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getCoef() {
		return coef;
	}
	public void setCoef(Integer coef) {
		this.coef = coef;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	public List<Note> getNotes() {
		return notes;
	}
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	
	
	
	
	

}

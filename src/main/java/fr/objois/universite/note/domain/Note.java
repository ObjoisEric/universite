package fr.objois.universite.note.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.objois.universite.etudiant.domain.Etudiant;
import fr.objois.universite.matiere.domain.Matiere;


@Entity
@Table(name="T_NOTE")
public class Note {
	
	
	@EmbeddedId
	private NotePrimaryKey notePrimaryKey;
	
	@Column(name="note")
	private Double note;
	
	@ManyToOne
	@JoinColumn(insertable=false, updatable=false, name="id_etudiant")
	private Etudiant etudiant; 
	
	@ManyToOne
	@JoinColumn(insertable=false, updatable=false, name="id_matiere")
	private Matiere matiere;

	public NotePrimaryKey getNotePrimaryKey() {
		return notePrimaryKey;
	}


	public void setNotePrimaryKey(NotePrimaryKey notePrimaryKey) {
		this.notePrimaryKey = notePrimaryKey;
	}


	public Double getNote() {
		return note;
	}


	public void setNote(Double note) {
		this.note = note;
	}


	public Etudiant getEtudiant() {
		return etudiant;
	}


	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}


	public Matiere getMatiere() {
		return matiere;
	}


	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	
}

package fr.objois.universite.note.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NotePrimaryKey implements Serializable {

	private static final long serialVersionUID = -3960755370829956602L;
	
    @Column(name="id_etudiant")
	private Integer idEtudiant;

    @Column(name="id_matiere")
	private Integer idMatiere;

	public Integer getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(Integer idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public Integer getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(Integer idMatiere) {
		this.idMatiere = idMatiere;
	}

	
	
}

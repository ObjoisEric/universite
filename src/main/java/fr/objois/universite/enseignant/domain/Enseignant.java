package fr.objois.universite.enseignant.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import fr.objois.universite.matiere.domain.Matiere;

@Entity(name = "t_enseignant")
public class Enseignant {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Numero_Enseignant")
    private Integer numeroEnseignant;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Prenom")
    private String prenom;
    @Column(name = "Date_Naissance")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateNaissance;
    @Column(name = "Sexe")
    private String sexe;
    @Column(name = "Grade")
    private String grade;
    @Column(name = "Date_Embauche")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEmbauche;
    @OneToMany(mappedBy = "enseignant")
    private List<Matiere> listMatieres;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroEnseignant() {
        return numeroEnseignant;
    }

    public void setNumeroEnseignant(Integer numeroEnseignant) {
        this.numeroEnseignant = numeroEnseignant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public List<Matiere> getListMatieres() {
        return listMatieres;
    }

    public void setListMatieres(List<Matiere> listMatieres) {
        this.listMatieres = listMatieres;
    }


}

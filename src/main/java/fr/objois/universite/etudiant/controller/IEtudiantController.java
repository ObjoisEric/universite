package fr.objois.universite.etudiant.controller;

import org.springframework.ui.Model;

import fr.objois.universite.etudiant.domain.Etudiant;

public interface IEtudiantController {
	
	public String aficherAllEtudiant(Model model);
	
	public String afficherDetailEtudiant(Model model, Integer id);
	
	public String ajouterEtudiant(Model model);
	
	public String ajouterEtudiant(Model model, Etudiant etudiant);
	
	public String modificationEtudiant(Model model, Integer id);
	
	public String modifierEtudiant(Model model,Etudiant etudiant);

}

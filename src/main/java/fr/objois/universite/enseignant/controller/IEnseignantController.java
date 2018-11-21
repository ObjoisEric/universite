package fr.objois.universite.enseignant.controller;

import org.springframework.ui.Model;

import fr.objois.universite.enseignant.domain.Enseignant;

public interface IEnseignantController {

	public String afficherAllEnseignant(Model model);

	public String afficherDetailEnseignant(Model model, Integer id);

	public String ajouterEnseignant(Model model);

	public String ajouterEnseignant(Model model,Enseignant enseignant);
	
	public String modificationEnseignant(Model model, Integer id);
	
	public String modifierEnseignant(Model model, Enseignant enseignant);
	
	
}

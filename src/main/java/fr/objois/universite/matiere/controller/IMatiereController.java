package fr.objois.universite.matiere.controller;

import org.springframework.ui.Model;

import fr.objois.universite.matiere.domain.Matiere;

public interface IMatiereController {
	
	public String afficherAllMatiere(Model model);
	
	public String afficherDetailMatiere(Model model,Integer id);
	
	public String ajouterMatiere(Model model);
	
	public String ajouterMatiere(Model model, Matiere matiere, Integer idEnseignant);
	
	public String modificationMatiere(Model model, Integer id);
	
	public String modifierMatiere(Model model, Matiere matiere, Integer idEnseignant);

}

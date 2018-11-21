package fr.objois.universite.matiere.business;

import java.util.List;

import fr.objois.universite.enseignant.domain.Enseignant;
import fr.objois.universite.matiere.domain.Matiere;

public interface IMatiereBusiness {

	public List<Matiere> getAllMatiere();

	public Matiere getDetailMatiere(Integer id);

	public void ajouterMatiere(Matiere matiere, Integer idEnseignant);

	public List<Enseignant> qetAllEnseignant();

	public void modifierMatiere(Matiere matiere, Integer idEnseignant);

}

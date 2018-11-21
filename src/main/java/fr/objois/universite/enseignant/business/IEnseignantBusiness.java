package fr.objois.universite.enseignant.business;

import java.util.List;

import fr.objois.universite.enseignant.domain.Enseignant;

public interface IEnseignantBusiness {

	public List<Enseignant> getAllEnseignant();

	public Enseignant getEnseignantDetail(Integer id);

	public void ajouteEnseignant(Enseignant enseignant);

	public void modifierEnseignant(Enseignant enseignant);

}

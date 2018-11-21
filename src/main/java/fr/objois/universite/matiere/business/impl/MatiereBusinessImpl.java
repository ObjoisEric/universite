package fr.objois.universite.matiere.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.objois.universite.enseignant.business.IEnseignantBusiness;
import fr.objois.universite.enseignant.domain.Enseignant;
import fr.objois.universite.matiere.business.IMatiereBusiness;
import fr.objois.universite.matiere.domain.Matiere;
import fr.objois.universite.matiere.repository.IMatiereRepository;
@Service
public class MatiereBusinessImpl implements IMatiereBusiness {
	
	@Autowired
	IMatiereRepository matiereRepository;
	@Autowired
	IEnseignantBusiness enseignantBusiness;

	@Override
	public List<Matiere> getAllMatiere() {
		List<Matiere> listeMatiere = matiereRepository.findAll();
		return listeMatiere;
	}

	@Override
	public Matiere getDetailMatiere(Integer id) {
		Matiere detailMatiere = matiereRepository.getOne(id);
		
		return detailMatiere;
	}



	@Override
	public List<Enseignant> qetAllEnseignant() {
		List<Enseignant> listeEnseignant = enseignantBusiness.getAllEnseignant();
		return listeEnseignant;
	}

	@Override
	public void ajouterMatiere(Matiere matiere, Integer idEnseignant) {
		
		Enseignant enseignant = enseignantBusiness.getEnseignantDetail(idEnseignant);
		matiere.setEnseignant(enseignant);
		matiereRepository.save(matiere);
		
	}

	@Override
	public void modifierMatiere(Matiere matiere, Integer idEnseignant) {
		
		Enseignant enseignant = enseignantBusiness.getEnseignantDetail(idEnseignant);

		Matiere vraiMatiere = matiereRepository.getOne(matiere.getId());
		
		vraiMatiere.setNom(matiere.getNom());
		vraiMatiere.setEnseignant(enseignant);
		
		matiereRepository.save(vraiMatiere);
		
		
	}

}

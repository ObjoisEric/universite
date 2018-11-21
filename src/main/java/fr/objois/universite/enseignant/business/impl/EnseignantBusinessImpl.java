package fr.objois.universite.enseignant.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.objois.universite.enseignant.business.IEnseignantBusiness;
import fr.objois.universite.enseignant.domain.Enseignant;
import fr.objois.universite.enseignant.repository.IEnseignantRepository;
@Service
public class EnseignantBusinessImpl implements IEnseignantBusiness {
	
	@Autowired
	IEnseignantRepository enseignantRepository;

	@Override
	public List<Enseignant> getAllEnseignant() {
		List<Enseignant> listEnseignant = enseignantRepository.findAll();
		return listEnseignant;
	}

	@Override
	public Enseignant getEnseignantDetail(Integer id) {
		Enseignant enseignantDetail = enseignantRepository.getOne(id);
		return enseignantDetail;
	}

	@Override
	public void ajouteEnseignant(Enseignant enseignant) {
		enseignantRepository.save(enseignant);
		
	}

	@Override
	public void modifierEnseignant(Enseignant enseignant) {
		Enseignant vraiEns = enseignantRepository.getOne(enseignant.getId());
		vraiEns.setNom(enseignant.getNom());
		vraiEns.setPrenom(enseignant.getPrenom());
		
		enseignantRepository.save(vraiEns);
		
	}

}

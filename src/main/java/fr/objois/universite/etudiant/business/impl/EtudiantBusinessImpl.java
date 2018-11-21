package fr.objois.universite.etudiant.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.objois.universite.etudiant.business.IEtudiantBusiness;
import fr.objois.universite.etudiant.domain.Etudiant;
import fr.objois.universite.etudiant.repository.IEtudiantRepository;
import fr.objois.universite.note.domain.Note;
import fr.objois.universite.note.repository.INoteRepository;

@Service
public class EtudiantBusinessImpl implements IEtudiantBusiness{
	
	@Autowired
	IEtudiantRepository etudiantRepository;
	@Autowired
	INoteRepository noteRepository;

	@Override
	public List<Etudiant> getAllEtudiant() {

		return etudiantRepository.findAll();
	}

	@Override
	public Etudiant getDetailEtudiant(Integer id) {

		return etudiantRepository.getOne(id);
	}

	@Override
	public void ajouterEtudiant(Etudiant etudiant) {
		etudiantRepository.save(etudiant);
		
	}

	@Override
	public void modifierEtudiant(Etudiant etudiant) {
		Etudiant vraiEtudiant = etudiantRepository.getOne(etudiant.getId());
		vraiEtudiant.setNom(etudiant.getNom());
		vraiEtudiant.setPrenom(etudiant.getPrenom());

		etudiantRepository.save(vraiEtudiant);
	}

	@Override
	public List<Note> getNoteInfdixEtudiant(Integer id) {		
		
 		return noteRepository.findByEtudiantIdAndNoteLessThan(id, 10.0);
	}


	

}

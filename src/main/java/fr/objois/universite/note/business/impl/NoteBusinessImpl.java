package fr.objois.universite.note.business.impl;

import fr.objois.universite.etudiant.business.IEtudiantBusiness;
import fr.objois.universite.etudiant.domain.Etudiant;
import fr.objois.universite.matiere.business.IMatiereBusiness;
import fr.objois.universite.matiere.domain.Matiere;
import fr.objois.universite.note.business.INoteBusiness;
import fr.objois.universite.note.domain.Note;
import fr.objois.universite.note.domain.NotePrimaryKey;
import fr.objois.universite.note.repository.INoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class NoteBusinessImpl implements INoteBusiness{
	
	
	@Autowired
	INoteRepository noteRepository;
	@Autowired
	IMatiereBusiness matiereBusiness;
	@Autowired
	IEtudiantBusiness etudiantBusiness;

	@Override
	public List<Note> getAllNotes() {
		return noteRepository.findAll();
	}


	@Override
	public Matiere getMatiere(Integer id) {
		return matiereBusiness.getDetailMatiere(id);
	}
	


	@Override
	public List<Matiere> getAllMatiere() {
		

		return matiereBusiness.getAllMatiere();
	}


	@Override
	public List<Etudiant> getAllEtudiant() {
		return etudiantBusiness.getAllEtudiant();
	}


	@Override
	public void ajouterNote(Note note, Integer idMatiere, Integer idEtudiant) {
		Matiere matiere = matiereBusiness.getDetailMatiere(idMatiere);
		Etudiant etudiant = etudiantBusiness.getDetailEtudiant(idEtudiant);
		NotePrimaryKey notePrimaryKey = new NotePrimaryKey();		
		
		notePrimaryKey.setIdEtudiant(idEtudiant);
		notePrimaryKey.setIdMatiere(idMatiere);
		
		note.setEtudiant(etudiant);
		note.setMatiere(matiere);
		note.setNotePrimaryKey(notePrimaryKey);
		
		noteRepository.save(note);
		
	}


	@Override
	public List<Etudiant> getEtudiantDiff() {
		List<Etudiant> listEtudiantDiff = etudiantBusiness.getAllEtudiant();

	
		return getEtudiantInfDix(listEtudiantDiff);
	}


	private List<Etudiant> getEtudiantInfDix(List<Etudiant> listEtudiantDiff) {
		for (Iterator<Etudiant> iterator = listEtudiantDiff.iterator(); iterator.hasNext();) {
			Etudiant etudiant = iterator.next();
			List<Note> listNote = getNoteInfDix(etudiant.getNotes());
			
			if (listNote.isEmpty()) {
				iterator.remove();
			}else {
				etudiant.setNotes(listNote);
			}
		}


		return listEtudiantDiff;
	}


	private List<Note> getNoteInfDix(List<Note> notes) {

		notes.removeIf((Note note) -> note.getNote() >= 10);

		return notes;
	}

	

}

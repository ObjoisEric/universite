package fr.objois.universite.note.business;

import java.util.List;

import fr.objois.universite.etudiant.domain.Etudiant;
import fr.objois.universite.matiere.domain.Matiere;
import fr.objois.universite.note.domain.Note;

public interface INoteBusiness {

	public List<Note> getAllNotes();


	public Matiere getMatiere(Integer id);


	public List<Matiere> getAllMatiere();


	public List<Etudiant> getAllEtudiant();


	public void ajouterNote(Note note, Integer idMatiere, Integer idEtudiant);


	public List<Etudiant> getEtudiantDiff();

}

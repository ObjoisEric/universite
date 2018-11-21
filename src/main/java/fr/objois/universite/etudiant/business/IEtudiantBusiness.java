package fr.objois.universite.etudiant.business;

import java.util.List;

import fr.objois.universite.etudiant.domain.Etudiant;
import fr.objois.universite.note.domain.Note;

public interface IEtudiantBusiness {

	public List<Etudiant> getAllEtudiant();

	public Etudiant getDetailEtudiant(Integer id);

	public void ajouterEtudiant(Etudiant etudiant);

	public void modifierEtudiant(Etudiant etudiant);

	public List<Note> getNoteInfdixEtudiant(Integer id);

	


}

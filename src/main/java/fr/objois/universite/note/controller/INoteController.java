package fr.objois.universite.note.controller;

import org.springframework.ui.Model;

import fr.objois.universite.note.domain.Note;

public interface INoteController {
	
	public String afficherAllNotes(Model model);
	
	public String afficherNoteMatiere(Model model, Integer id);
	
	public String ajouterNote(Model model);
	
	public String ajouterNote(Model model, Note note, Integer idMatiere, Integer idEtudiant);
	
	public String noteDiff(Model model);

}

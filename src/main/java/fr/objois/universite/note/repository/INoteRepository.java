package fr.objois.universite.note.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.objois.universite.note.domain.Note;
import fr.objois.universite.note.domain.NotePrimaryKey;

public interface INoteRepository extends JpaRepository<Note, NotePrimaryKey>{
	
	List<Note> findByEtudiantIdAndNoteLessThan(Integer id,Double note);

	List<Note> findByNoteLessThan(double d);


}

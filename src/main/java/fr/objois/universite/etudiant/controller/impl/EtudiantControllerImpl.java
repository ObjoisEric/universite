package fr.objois.universite.etudiant.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.objois.universite.etudiant.business.IEtudiantBusiness;
import fr.objois.universite.etudiant.controller.IEtudiantController;
import fr.objois.universite.etudiant.domain.Etudiant;
import fr.objois.universite.note.domain.Note;


@Controller
public class EtudiantControllerImpl implements IEtudiantController {
	
	@Autowired
	IEtudiantBusiness etudiantBusiness;

	@Override
	@RequestMapping("/etudiants")
	public String aficherAllEtudiant(Model model) {
		
		List<Etudiant> listeEtudiant = etudiantBusiness.getAllEtudiant();
		
		
		model.addAttribute("listeEtudiant",listeEtudiant);
		
		return "etudiant/etudiants";
	}

	@Override
	@RequestMapping("/etudiant")
	public String afficherDetailEtudiant(Model model,@RequestParam Integer id) {
		Etudiant detailEtudiant = etudiantBusiness.getDetailEtudiant(id);
		model.addAttribute("detailEtudiant",detailEtudiant);
		
		List<Note> noteInfdixEtudiant = etudiantBusiness.getNoteInfdixEtudiant(id);
		
		model.addAttribute("noteInfdixEtudiant",noteInfdixEtudiant);
		
		return "etudiant/etudiant";
	}

	@Override
	@RequestMapping("/ajouterEtudiant")
	public String ajouterEtudiant(Model model) {
		Etudiant etudiant = new Etudiant();
		etudiant.setSexe("M");		
		model.addAttribute("etudiant",etudiant);
		return "etudiant/ajouterEtudiant";
	}
	
	@Override
	@PostMapping("/ajouterEtudiant")
	public String ajouterEtudiant(Model model,@ModelAttribute Etudiant etudiant) {

		etudiantBusiness.ajouterEtudiant(etudiant);
		return "redirect:/etudiants";
	}

	@Override
	@RequestMapping("/modifierEtudiant")
	public String modificationEtudiant(Model model, Integer id) {
		
		Etudiant etudiant = etudiantBusiness.getDetailEtudiant(id);
		model.addAttribute("etudiant",etudiant);
		
		return "etudiant/modifierEtudiant";
	}

	@Override
	@PostMapping("/modifierEtudiant")
	public String modifierEtudiant(Model model, Etudiant etudiant) {
		
		etudiantBusiness.modifierEtudiant(etudiant);
		
		return "redirect:/etudiants";
	}
	
	
	

}

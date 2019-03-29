package com.demo.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

	
/*	
  					1st 
  
  	@RequestMapping("/{welcome}/{user}")
	public ModelAndView helloWorld(@PathVariable Map<String,String> path) {
		
		String name = path.get("welcome");
		String country = path.get("user");
		
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","hello world " +name + " I am from " +country);
		
		return model;
	}
*/	
	
/*
					2nd
	
	@RequestMapping(value="/admissionForm.html",method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		
		ModelAndView model = new ModelAndView("AdmissionForm");
		model.addObject("headingmsg","Welcome to my university");
		
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1) {
		
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("headingmsg","Welcome to my university");
		
		return model;
}
*/
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] {"studentMobile"});
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****mm**dd");
//		binder.registerCustomEditor(Date.class,"studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	@GetMapping(value="/admissionForm.html")
	public ModelAndView getAdmissionForm() {
		
		ModelAndView model = new ModelAndView("AdmissionForm");
		
		return model;
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model) {
		model.addAttribute("headingmsg","Welcome to my university");
	}
	
	@PostMapping(value="/submitAdmissionForm.html")
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result) {
		
		if(result.hasErrors()) {
			ModelAndView model1 = new ModelAndView("AdmissionForm");
			return model1;
		}
		
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		
		return model;
}
}
	
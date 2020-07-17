package com.xworkz.calamities.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.calamities.dto.CalamitiesDTO;
import com.xworkz.calamities.service.CalamitiesService;

@Component
@RequestMapping(value = "/")
public class CalamitiesController {
	@Autowired
	private CalamitiesService service;

	public CalamitiesController() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	@InitBinder
	public void init(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}

	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public String doSave(CalamitiesDTO dto, Model model) {
		try {
			System.out.println("invoked doSave method in CalamitiesController");
			int i = service.createAndValidate(dto);
			if (i == 0) {
				System.out.println(dto.getCapturedBy());
				model.addAttribute("message", "Info captured by: " + dto.getCapturedBy());
				return "index";
			} else {
				model.addAttribute("message", "Some filled is missing..");
				return "index";

			}

		} catch (Exception e) {
			System.err.println("Exception in doSave CalamitiesController" + e.getMessage());
		}
		return null;

	}

}

package com.ePages.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ePages.daos.ItemRepository;

@Controller
public class HomeController {
	
	private final Log log = LogFactory.getLog(HomeController.class);
	
	@Autowired
	private ItemRepository itemDao;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model){
		model.addAttribute("items", this.itemDao.findAll());
		log.info("Inside home controller");
		return "index";
	}
}

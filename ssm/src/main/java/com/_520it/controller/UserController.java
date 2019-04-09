package com._520it.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com._520it.service.UsersService;

@Controller
public class UserController {
	@Resource
	private UsersService usersServiceImpl;
	@RequestMapping("/show")
	public String show(Model model) {
		model.addAttribute("list",usersServiceImpl.show());
		return "index.jsp";
	}
}

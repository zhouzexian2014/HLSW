package demo1.zzx_demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import demo1.zzx_demo1.entity.User;
import demo1.zzx_demo1.service.UserService;
@Controller
@RequestMapping("/beetl")
public class BeetController {
	@Autowired
	UserService userService;
	@GetMapping("/showuser.html")
	public ModelAndView showUserInfo(Long id) {
		ModelAndView view = new ModelAndView();
		User user = userService.getUserById(id);
		view.addObject("user",user);
		view.setViewName("/userInfo.btl");
		return view;
	}
}

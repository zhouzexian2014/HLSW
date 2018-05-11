package demo1.zzx_demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import demo1.zzx_demo1.entity.User;
import demo1.zzx_demo1.service.UserService;

@Controller
@RequestMapping("/freemarker")
public class FreemakerController {
	@Autowired UserService userService;
	@RequestMapping("/showuser.html")
	public ModelAndView showUserInfo(Long id) {
		ModelAndView view = new ModelAndView();
		User user = userService.getUserById(id);
		view.addObject("user",user);
		view.setViewName("/userInfo.ftl");
		return view;
	}

}

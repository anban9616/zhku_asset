package zhku.zhou.asset.controller.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import zhku.zhou.asset.entity.UserPage;
import zhku.zhou.asset.service.system.UserService;

@Controller
@RequestMapping("/user")
public class UserServlet {
	@Autowired
	private UserService userService;

	@RequestMapping("/list")
	public ModelAndView getAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<UserPage> list = userService.getAll();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("forward:/WEB-INF/page/system/system-user.jsp");
		return modelAndView;
	}
}

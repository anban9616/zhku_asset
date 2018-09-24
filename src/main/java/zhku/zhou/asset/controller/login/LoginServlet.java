package zhku.zhou.asset.controller.login;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import zhku.zhou.asset.entity.User;
import zhku.zhou.asset.service.login.LoginService;

@Controller
@RequestMapping("/")
public class LoginServlet {
	@Autowired
	private LoginService loginService;
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,User user) {
		ModelAndView mav = new ModelAndView();
		System.out.println("login/user:"+user);
		List<User> userList;
		HttpSession session = request.getSession();
		try {
			userList = loginService.login(user);
			//userList.get(0)在获取不到的时候抛出异常
			User user2 = userList.get(0);
			session.setAttribute("user2", user2);
			mav.setViewName("forward:/WEB-INF/page/index.jsp");
			return mav;
		} catch (Exception e) {
			session.setAttribute("loginMessage", "账号或密码错误");
			mav.setViewName("redirect:/admin-login.jsp");
			return mav;
		}
	}
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		session.removeAttribute("user2");
		session.removeAttribute("loginMessage");
		return new ModelAndView("redirect:/admin-login.jsp");
	}
}

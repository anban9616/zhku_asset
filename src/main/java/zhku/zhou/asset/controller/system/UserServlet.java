package zhku.zhou.asset.controller.system;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import zhku.zhou.asset.entity.Organization;
import zhku.zhou.asset.entity.Role;
import zhku.zhou.asset.entity.User;
import zhku.zhou.asset.entity.UserPage;
import zhku.zhou.asset.service.system.UserService;
import zhku.zhou.asset.utils.DateUtil;

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
		modelAndView.addObject("count", list.size());
		modelAndView.setViewName("forward:/WEB-INF/page/system/system-user.jsp");
		return modelAndView;
	}
	@RequestMapping("/add")
	public ModelAndView add()
	{
		ModelAndView modelAndView = new ModelAndView();
		List<Role> roleList = userService.getRoleList();
		List<Organization> organizationList = userService.getOrganizationList();
		modelAndView.addObject("roleList", roleList);
		modelAndView.addObject("organizationList", organizationList);
		modelAndView.setViewName("forward:/WEB-INF/page/system/system-user-add.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/addAfter")
	public int addAfter(User user,String birthStr,HttpServletRequest request) throws ParseException
	{
		Date birth = DateUtil.Str2Date(birthStr);
		user.setBirth(birth);
		user.setCrtm(new Date());
		user.setMdtm(new Date());
		return userService.addOne(user);
	}
	@RequestMapping("/edit")
	public ModelAndView edit(Integer id)
	{
		System.out.println("/edit/id:"+id);
		ModelAndView modelAndView = new ModelAndView();
		UserPage userPage = userService.SelectOne(id);
		modelAndView.addObject("userPage", userPage);
		System.out.println("userPage:"+userPage);
		List<Role> roleList = userService.getRoleList();
		List<Organization> organizationList = userService.getOrganizationList();
		modelAndView.addObject("roleList", roleList);
		modelAndView.addObject("organizationList", organizationList);
		modelAndView.setViewName("forward:/WEB-INF/page/system/system-user-edit.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/editAfter")
	public int editAfter(User user,String birthStr,HttpServletRequest request) throws ParseException
	{
		Date birth = DateUtil.Str2Date(birthStr);
		user.setBirth(birth);
		user.setMdtm(new Date());
		return userService.updateOne(user);
	}
	@ResponseBody
	@RequestMapping("/deleteOne")
	public int deleteOne(Integer id)
	{
		return userService.deleteOne(id);
	}
}

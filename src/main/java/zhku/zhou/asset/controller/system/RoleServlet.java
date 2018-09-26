package zhku.zhou.asset.controller.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import zhku.zhou.asset.entity.Role;
import zhku.zhou.asset.service.system.RoleService;

@Controller
@RequestMapping("/role")
public class RoleServlet {
	@Autowired
	private RoleService roleService;
	@RequestMapping("/list")
	public ModelAndView getAll()
	{
		ModelAndView modelAndView = new ModelAndView();
		List<Role> list = roleService.getAll();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("/WEB-INF/page/system/system-role.jsp");
		return modelAndView;
	}
	@RequestMapping("/edit")
	public ModelAndView edit(Integer id)
	{
		ModelAndView modelAndView = new ModelAndView();
		Role role = roleService.selectOne(id);
		modelAndView.addObject("role", role);
		modelAndView.setViewName("/WEB-INF/page/system-role-edit.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/editAfter")
	public int editAfter(Role role)
	{
		return roleService.updateOne(role);
	}
	@RequestMapping("/add")
	public ModelAndView add()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/WEB-INF/page/system/system-role-add.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/addAfter")
	public int addAfter(Role role)
	{
		return roleService.addOne(role);
	}
	@ResponseBody
	@RequestMapping("/deleteOne")
	public int deleteOne(int id)
	{
		return roleService.deleteOne(id);
	}
}

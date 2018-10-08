package zhku.zhou.asset.controller.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import zhku.zhou.asset.entity.Organization;
import zhku.zhou.asset.service.system.OrganizationService;

@Controller
@RequestMapping("/organization")
public class OrganizationServlet {
	@Autowired
	private OrganizationService organizationService;
	@RequestMapping("/list")
	public ModelAndView getAll()
	{
		ModelAndView modelAndView = new ModelAndView();
		List<Organization> list = organizationService.getAll();
		modelAndView.addObject("list", list);
		modelAndView.addObject("count", list.size());
		modelAndView.setViewName("forward:/WEB-INF/page/system/system-organization.jsp");
		return modelAndView;
	}
	@RequestMapping("/edit")
	public ModelAndView edit(Integer id)
	{
		ModelAndView modelAndView = new ModelAndView();
		Organization organization = organizationService.selectOne(id);
		modelAndView.addObject("organization", organization);
		modelAndView.setViewName("forward:/WEB-INF/page/system/system-organization-edit.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/editAfter")
	public int editAfter(Organization organization)
	{
		return organizationService.updateOne(organization);
	}
	@RequestMapping("/add")
	public ModelAndView add()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("forward:/WEB-INF/page/system/system-organization-add.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/addAfter")
	public int addAfter(Organization organization)
	{
		System.out.println("--------------------------->");
		System.out.println(organization);
		return organizationService.addOne(organization);
	}
	@ResponseBody
	@RequestMapping("/deleteOne")
	public int deleteOne(int id)
	{
		return organizationService.deleteOne(id);
	}
}

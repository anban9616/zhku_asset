package zhku.zhou.asset.controller.device;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import zhku.zhou.asset.entity.Device;
import zhku.zhou.asset.entity.DevicePage;
import zhku.zhou.asset.entity.DeviceType;
import zhku.zhou.asset.entity.Organization;
import zhku.zhou.asset.entity.User;
import zhku.zhou.asset.service.device.DeviceService;
import zhku.zhou.asset.service.device.DeviceTypeService;
import zhku.zhou.asset.service.system.OrganizationService;
import zhku.zhou.asset.utils.DateUtil;

@Controller
@RequestMapping("/device")
public class DeviceServlet {
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private DeviceTypeService deviceTypeService;
	@Autowired
	private OrganizationService organizationService;
	@RequestMapping("/list")
	public ModelAndView selectAll()
	{
		ModelAndView modelAndView = new ModelAndView();
		List<DevicePage> list = deviceService.selectAll();
		modelAndView.addObject("list", list);
		modelAndView.addObject("count",list.size());
		modelAndView.setViewName("forward:/WEB-INF/page/device/device-list.jsp");
		return modelAndView;
	}
	@RequestMapping("/add")
	public ModelAndView add()
	{
		ModelAndView modelAndView = new ModelAndView();
		List<DeviceType> deviceTypeList = deviceTypeService.selectAll();
		modelAndView.addObject("deviceTypeList", deviceTypeList);
		List<Organization> organizationList = organizationService.getAll();
		modelAndView.addObject("organizationList", organizationList);
		modelAndView.setViewName("forward:/WEB-INF/page/device/device-add.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/addAfter")
	public int addAfter(Device device,String prodDateStr,HttpServletRequest request) throws ParseException
	{
		User user2 = (User) request.getSession().getAttribute("user2");
		Date prodDate = DateUtil.Str2Date(prodDateStr);
		device.setProdDate(prodDate);
		device.setCrtm(new Date());
		device.setMdtm(new Date());
		Short s = 1;
		device.setStatus(s);
		device.setCreator(user2.getId());
		return deviceService.addOne(device);
	}
	@ResponseBody
	@RequestMapping("/deleteOne")
	public int deleteOne(int id)
	{
		return deviceService.deleteOne(id);
	}
	@RequestMapping("/edit")
	public ModelAndView edit(int id)
	{
		ModelAndView modelAndView = new ModelAndView();
		Device device = deviceService.selectOne(id);
		modelAndView.addObject("device", device);
		List<DeviceType> deviceTypeList = deviceTypeService.selectAll();
		modelAndView.addObject("deviceTypeList", deviceTypeList);
		List<Organization> organizationList = organizationService.getAll();
		modelAndView.addObject("organizationList", organizationList);
		modelAndView.setViewName("forward:/WEB-INF/page/device/device-edit.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/editAfter")
	public int editAfter(Device device,String prodDateStr) throws ParseException
	{
		//状态是short,可能转换不过来
		device.setMdtm(new Date());
		Date prodDate = DateUtil.Str2Date(prodDateStr);
		device.setProdDate(prodDate);
		return deviceService.updateOne(device);
	}
}

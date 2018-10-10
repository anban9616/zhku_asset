package zhku.zhou.asset.controller.device;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import zhku.zhou.asset.entity.DeviceType;
import zhku.zhou.asset.service.device.DeviceTypeService;

@Controller
@RequestMapping("/deviceType")
public class DeviceTypeServlet {
	@Autowired
	private DeviceTypeService deviceTypeService;
	@RequestMapping("/list")
	public ModelAndView selectAll()
	{
		ModelAndView modelAndView = new ModelAndView();
		List<DeviceType> list = deviceTypeService.selectAll();
		modelAndView.addObject("list", list);
		modelAndView.addObject("count", list.size());
		modelAndView.setViewName("forward:/WEB-INF/page/device/deviceType-list.jsp");
		return modelAndView;
	}
	@RequestMapping("/add")
	public ModelAndView add()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("forward:/WEB-INF/page/device/deviceType-add.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/addAfter")
	public int addAfter(DeviceType deviceType)
	{
		deviceType.setCrtm(new Date());
		deviceType.setMdtm(new Date());
		return deviceTypeService.addOne(deviceType);
	}
	@ResponseBody
	@RequestMapping("/deleteOne")
	public int deleteOne(int id)
	{
		return deviceTypeService.deleteOne(id);
	}
	@RequestMapping("/edit")
	public ModelAndView edit(int id)
	{
		ModelAndView modelAndView = new ModelAndView();
		DeviceType deviceType = deviceTypeService.selectOne(id);
		modelAndView.addObject("deviceType", deviceType);
		modelAndView.setViewName("forward:/WEB-INF/page/device/deviceType-edit.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/editAfter")
	public int editAfter(DeviceType deviceType)
	{
		deviceType.setMdtm(new Date());
		return deviceTypeService.updateOne(deviceType);
	}
}

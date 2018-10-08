package zhku.zhou.asset.controller.device;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import zhku.zhou.asset.entity.DevicePage;
import zhku.zhou.asset.service.device.DeviceService;

@Controller
@RequestMapping("/device")
public class DeviceServlet {
	@Autowired
	private DeviceService deviceService;
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
}

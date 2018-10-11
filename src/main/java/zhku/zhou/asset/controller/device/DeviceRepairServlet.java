package zhku.zhou.asset.controller.device;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import zhku.zhou.asset.entity.Device;
import zhku.zhou.asset.entity.DeviceRepair;
import zhku.zhou.asset.entity.DeviceRepairPage;
import zhku.zhou.asset.entity.User;
import zhku.zhou.asset.service.device.DeviceRepairService;
import zhku.zhou.asset.service.device.DeviceService;
@Controller
@RequestMapping("/deviceRepair")
public class DeviceRepairServlet {
	@Autowired
	private DeviceRepairService deviceRepairService;
	@Autowired
	private DeviceService deviceService;
	@RequestMapping("/list")
	public ModelAndView selectAll()
	{
		ModelAndView modelAndView = new ModelAndView();
		List<DeviceRepairPage> list	= deviceRepairService.selectAll();
		modelAndView.addObject("list", list);
		modelAndView.addObject("count",list.size());
		modelAndView.setViewName("forward:/WEB-INF/page/device/deviceRepair-list.jsp");
		return modelAndView;
	}
	@RequestMapping("/add")
	public ModelAndView add()
	{
		ModelAndView modelAndView = new ModelAndView();
		List<Device> deviceList = deviceService.selectAll2();
		modelAndView.addObject("deviceList", deviceList);
		modelAndView.setViewName("forward:/WEB-INF/page/device/deviceRepair-add.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/addAfter")
	public int addAfter(DeviceRepair deviceRepair,HttpServletRequest request)
	{
		deviceRepair.setCrtm(new Date());
		deviceRepair.setMdtm(new Date());
		deviceRepair.setDamageDate(new Date());
		User user2 = (User) request.getSession().getAttribute("user2");
		deviceRepair.setDamager(user2.getId());
		deviceRepair.setStatus((short) 1);
		//修改设备状态为维修
		Device device = new Device();
		device.setId(deviceRepair.getDid());
		device.setStatus((short) 5);
		deviceService.updateOne(device);
		return deviceRepairService.addOne(deviceRepair);
	}
	@ResponseBody
	@RequestMapping("/deleteOne")
	public int deleteOne(int id)
	{
		return deviceRepairService.deleteOne(id);
	}
	@RequestMapping("/edit")
	public ModelAndView edit(int id)
	{
		ModelAndView modelAndView = new ModelAndView();
		DeviceRepair deviceRepair = deviceRepairService.selectOne(id);
		modelAndView.addObject("deviceRepair", deviceRepair);
		modelAndView.setViewName("forward:/WEB-INF/page/device/deviceRepair-edit.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/editAfter")
	public int editAfter(DeviceRepair deviceRepair,HttpServletRequest request)
	{
		User user2 = (User) request.getSession().getAttribute("user2");
		deviceRepair.setMdtm(new Date());
		deviceRepair.setRepairDate(new Date());
		deviceRepair.setRepairer(user2.getId());
		return deviceRepairService.updateOne(deviceRepair);
	}
}

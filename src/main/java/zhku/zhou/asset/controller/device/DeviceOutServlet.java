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
import zhku.zhou.asset.entity.DeviceOut;
import zhku.zhou.asset.entity.DeviceOutPage;
import zhku.zhou.asset.entity.User;
import zhku.zhou.asset.service.device.DeviceOutService;
import zhku.zhou.asset.service.device.DeviceService;
@Controller
@RequestMapping("/deviceOut")
public class DeviceOutServlet {
	@Autowired
	private DeviceOutService deviceOutService;
	@Autowired
	private DeviceService deviceService;
	@RequestMapping("/list")
	public ModelAndView selectAll()
	{
		ModelAndView modelAndView = new ModelAndView();
		List<DeviceOutPage> list	= deviceOutService.selectAll();
		modelAndView.addObject("list", list);
		modelAndView.addObject("count",list.size());
		modelAndView.setViewName("forward:/WEB-INF/page/device/deviceOut-list.jsp");
		return modelAndView;
	}
	@RequestMapping("/add")
	public ModelAndView add()
	{
		ModelAndView modelAndView = new ModelAndView();
		List<Device> deviceList = deviceService.selectAll2();
		modelAndView.addObject("deviceList", deviceList);
		modelAndView.setViewName("forward:/WEB-INF/page/device/deviceOut-add.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/addAfter")
	public int addAfter(DeviceOut deviceOut,HttpServletRequest request)
	{
		deviceOut.setCrtm(new Date());
		deviceOut.setMdtm(new Date());
		User user2 = (User) request.getSession().getAttribute("user2");
		deviceOut.setOutter(user2.getId());
		deviceOut.setStatus((short) 1);
		//修改设备状态为报废
		Device device = new Device();
		device.setId(deviceOut.getDid());
		device.setStatus((short) 6);
		deviceService.updateOne(device);
		return deviceOutService.addOne(deviceOut);
	}
	@ResponseBody
	@RequestMapping("/deleteOne")
	public int deleteOne(int id)
	{
		return deviceOutService.deleteOne(id);
	}
	@RequestMapping("/edit")
	public ModelAndView edit(int id)
	{
		ModelAndView modelAndView = new ModelAndView();
		DeviceOut deviceOut = deviceOutService.selectOne(id);
		modelAndView.addObject("deviceOut", deviceOut);
		modelAndView.setViewName("forward:/WEB-INF/page/device/deviceOut-edit.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/editAfter")
	public int editAfter(DeviceOut deviceOut,HttpServletRequest request)
	{
		User user2 = (User) request.getSession().getAttribute("user2");
		deviceOut.setMdtm(new Date());
		deviceOut.setApprover(user2.getId());
		Device device = new Device();
		device.setId(deviceOut.getDid());
		if(deviceOut.getStatus()==2)
		{
			//确认报废
			device.setStatus((short) 7);
		} 
		if(deviceOut.getStatus()==3)
		{
			//拒绝报废放入库存
			device.setStatus((short) 1);
		}
		deviceService.updateOne(device);
		return deviceOutService.updateOne(deviceOut);
	}
}

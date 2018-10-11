package zhku.zhou.asset.controller.device;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import zhku.zhou.asset.entity.Device;
import zhku.zhou.asset.entity.DeviceReceive;
import zhku.zhou.asset.entity.DeviceReceivePage;
import zhku.zhou.asset.entity.User;
import zhku.zhou.asset.service.device.DeviceReceiveService;
import zhku.zhou.asset.service.device.DeviceService;

@Controller
@RequestMapping("/deviceReceive")
public class DeviceReceiveServlet {
	@Autowired
	private DeviceReceiveService deviceReceiveService;
	@Autowired 
	private DeviceService deviceService;
	@RequestMapping("/list")
	public ModelAndView selectAll()
	{
		ModelAndView modelAndView = new ModelAndView();
		List<DeviceReceivePage> list = deviceReceiveService.selectAll();
		modelAndView.addObject("list", list);
		modelAndView.addObject("count",list.size());
		modelAndView.setViewName("forward:/WEB-INF/page/device/deviceReceive-list.jsp");
		return modelAndView;
	}
	@RequestMapping("/add")
	public ModelAndView add()
	{
		//只能领取在库存中的设备
		ModelAndView modelAndView = new ModelAndView();
		List<Device> list = deviceService.selectAll2();
		modelAndView.addObject("deviceList", list);
		modelAndView.setViewName("forward:/WEB-INF/page/device/deviceReceive-add.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/addAfter")
	public int addAfter(DeviceReceive deviceReceive,HttpServletRequest request)
	{
		DeviceReceive deviceReceive2 = deviceReceiveService.selectMaxId();
		String dj = null;
		if(deviceReceive2==null)
		{
	        dj = "DJS" + getYear() + "0001";
		} else 
		{
			dj = getDJ(deviceReceive2.getCode());
		}
		User user2 = (User) request.getSession().getAttribute("user2");
		deviceReceive.setUid(user2.getId());
		deviceReceive.setCode(dj);
		deviceReceive.setCrtm(new Date());
		deviceReceive.setMdtm(new Date());
		deviceReceive.setReceiveDate(new Date());
		deviceReceive.setStatus((short) 1);
		
		//更新设备状态
		Device device = deviceService.selectOne(deviceReceive.getDid());
		device.setStatus((short) 4);
		deviceService.updateOne(device);
		
		return deviceReceiveService.addOne(deviceReceive);
	}
	public static String getYear()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
        Date date = new Date();
        return sdf.format(date);
	}
	public static String getCode(int index)
	{
		DecimalFormat df = new DecimalFormat("0000");
        String code = df.format(index); //次id即为四位不重复的流水号
        return code;
	}
	public static String getDJ(String code1)
	{
		//截取字符串
		String dj = code1.substring(0,3);
		//获取年份
		String year = code1.substring(3,5);
		int intYear = Integer.parseInt(year);
		//对比年份
		if(Integer.parseInt(getYear())>intYear) 
		{
			//如果大设0001
			dj = dj + getYear() + "0001";
		}else {
			//如果小就设置比前一个大一
			code1 = code1.substring(5,9);
			int intCode1 = Integer.parseInt(code1);
			intCode1 +=1;
			if(intCode1>9999)
			{
				//溢出循环
				intCode1=1;
			}
			code1 = getCode(intCode1);
			dj = dj + getYear() + code1;
		}
		return dj;
	}
	@ResponseBody
	@RequestMapping("/deleteOne")
	public int deleteOne(int id)
	{
		return deviceReceiveService.deleteOne(id);
	}
	@RequestMapping("/edit")
	public ModelAndView edit(int id)
	{
		ModelAndView modelAndView = new ModelAndView();
		DeviceReceive deviceReceive = deviceReceiveService.selectOne(id);
		modelAndView.addObject("deviceReceive", deviceReceive);
		modelAndView.setViewName("forward:/WEB-INF/page/device/deviceReceive-edit.jsp");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/editAfter")
	public int editAfter(DeviceReceive deviceReceive)
	{
		if(deviceReceive.getStatus()==2) {
			deviceReceive.setReturnDate(new Date());
		} else {
			deviceReceive.setReturnDate(null);
		}
		deviceReceive.setMdtm(new Date());
		Device device = deviceService.selectOne(deviceReceive.getDid());
		device.setStatus((short) 1);
		deviceService.updateOne(device);
		return deviceReceiveService.updateOne(deviceReceive);
	}
}

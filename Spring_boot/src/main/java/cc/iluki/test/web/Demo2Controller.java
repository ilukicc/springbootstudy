package cc.iluki.test.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.iluki.test.bean.Demo;
import cc.iluki.test.service.DemoService;

@RestController
@RequestMapping("/demo2")
public class Demo2Controller {

	@Resource
	private DemoService demoService;
	/**
	 * 测试保存数据方法
	 * @return
	 */
	@RequestMapping("/save")
	public String save(){
		Demo d=new Demo();
		d.setName("angel");
		demoService.save(d);
		return "ok.Demo2Controller.save";
	}
}

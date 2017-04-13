package cc.iluki.test.web;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.iluki.test.bean.Demo;

/**
 * 测试
 * @author lk
 *
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

	@RequestMapping("/getDemo")
	public Demo getDemo(){
		Demo demo=new Demo();
		demo.setId(1);
		demo.setName("Angel");
		return demo;
	}
	@RequestMapping("/zeroException")
	public int zeroException(){
		return 100/0;
	}
	@RequestMapping("/number")
	public int numberException(){
		int i=(Integer) null;
		return i;
	}
}

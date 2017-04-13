package cc.iluki.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cc.iluki.test.bean.Demo;
import cc.iluki.test.dao.DemoRepository;

/**
 * 提供Demo服务类
 * @author lk
 *
 */
@Service
public class DemoService {

	@Resource
	private DemoRepository demoRepository;
	@Transactional
	public void save(Demo demo){
		demoRepository.save(demo);
	}
}

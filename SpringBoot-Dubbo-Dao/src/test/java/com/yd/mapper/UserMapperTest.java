package com.yd.mapper;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yd.entity.User;
import com.yd.utils.MD5Utils;

@RunWith(SpringRunner.class)
@SpringBootTest
//@MapperScan("com.yd.mapper")  
//单元测试也要有主函数，这就算扫描mapper接口也没作用,由于该项目需要打成jar放到别的项目中，所以我把主函数删掉了，如需要，自行创建
//配置文件也删掉了，因为在service中配置了，如想测试请自行创建
public class UserMapperTest {

	@Autowired
	private   UserMapper  userMapper;
	
	@Test
	public void testInsert() {
		User record = new  User();
		record.setUsername("admin");
		record.setPassword(MD5Utils.encode("123"));
		userMapper.insert(record);
	}

}

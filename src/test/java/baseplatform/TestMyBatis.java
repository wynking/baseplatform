package baseplatform;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import cn.com.pansky.otp5.baseplatform.dao.po.User;
import cn.com.pansky.otp5.baseplatform.service.IUserService;  
 
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
 
public class TestMyBatis {  
   private static Logger logger = Logger.getLogger(TestMyBatis.class);  
// private ApplicationContext ac = null;  
   @Resource  
   private IUserService userService;  
 
// @Before  
// public void before() {  
//     ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//     userService = (IUserService) ac.getBean("userService");  
// }  
 
   @Test  
   public void insert() {  
   /*    User user = new User();
       user.setId(3);
       user.setLoginName("wyn3");
       user.setPassword("10w10y10n");
    		   userService.insert(user);*/
       // System.out.println(user.getUserName());  
       // logger.info("值："+user.getUserName());  
   } 
 
   /*@Test  
   public void getUserById() {  
       User user = userService.getUserById(1);  
       // System.out.println(user.getUserName());  
       // logger.info("值："+user.getUserName());  
       logger.info(JSON.toJSONString(user));  
   } */
}
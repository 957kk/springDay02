import com.itheima.sm.config.SpringConfig;
import com.itheima.sm.domain.User;
import com.itheima.sm.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

/**
 * @Author byZhao
 * @Modify 2021/9/7 15:19
 * Talk is cheap. Show me the code.
 */
public class UserApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        User user = new User();
        user.setId(2L);
        user.setName("赵");
        user.setPassword("1314");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        boolean register = userService.register(user);
        System.out.println(register);

    }

}

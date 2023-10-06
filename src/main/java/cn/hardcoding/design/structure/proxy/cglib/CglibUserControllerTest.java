package cn.hardcoding.design.structure.proxy.cglib;

import cn.hardcoding.design.structure.proxy.UserController;
import cn.hardcoding.design.structure.proxy.jdk.UserControllerImpl;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * @ClassName CglibUserControllerTest
 * @Description TODO
 * @Date 2023/10/6 18:38
 * @Author caoxuanhao
 */
public class CglibUserControllerTest {
    @Test
    public void testCreateProxy() {
        Enhancer enhancer = new Enhancer();
        // 这里注意要使用实现类，而不是接口
        enhancer.setSuperclass(UserControllerImpl.class);
        enhancer.setCallback(new CglibUserControllerHandler());
        UserController userController = (UserController) enhancer.create();
        userController.doSomething();
    }
}

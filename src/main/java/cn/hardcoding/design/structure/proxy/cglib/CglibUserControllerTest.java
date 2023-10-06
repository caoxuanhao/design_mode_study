package cn.hardcoding.design.structure.proxy.cglib;

import cn.hardcoding.design.structure.proxy.UserController;
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
        enhancer.setSuperclass(UserController.class);
        enhancer.setCallback(new CglibUserControllerHandler());
        UserController userController = (UserController) enhancer.create();
        userController.doSomething();
    }
}

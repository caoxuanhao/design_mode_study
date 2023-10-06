package cn.hardcoding.design.structure.proxy.jdk;

import cn.hardcoding.design.structure.proxy.UserController;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @ClassName UserControllerTest
 * @Description 测试代理模式
 * @Date 2023/10/6 17:43
 * @Author caoxuanhao
 */
public class UserControllerTest {
    @Test
    public void testCreateProxy() {
        UserController userController = new UserControllerImpl();
        Class<?>[] targetInterfaces = userController.getClass().getInterfaces();
        UserControllerHandler userControllerHandler = new UserControllerHandler(userController);
        UserController proxyInstance = (UserController)Proxy.newProxyInstance(userController.getClass().getClassLoader(), targetInterfaces, userControllerHandler);
        proxyInstance.doSomething();
    }
}

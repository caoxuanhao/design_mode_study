package cn.hardcoding.design.structure.proxy.cglib;

import cn.hardcoding.design.structure.proxy.UserController;
import cn.hardcoding.design.structure.proxy.jdk.UserControllerImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.Method;

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

    @Test
    public void testCreateProxyByInvoke() {
        Enhancer enhancer = new Enhancer();
        UserControllerImpl target = new UserControllerImpl();
        enhancer.setSuperclass(UserControllerImpl.class);
        enhancer.setCallback(new MethodInterceptor() {

            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("invoke before.");
                // 使用invoke来调用方法，传入的对象需要时原始对象。
                // 利用的是FastClassInfo中的f1对象(即原始对象)
                Object result = proxy.invoke(target, args);
                System.out.println("invoke after.");
                return result;
            }
        });

        UserController userController = (UserController) enhancer.create();
        userController.doSomething();
    }
    @Test
    public void testCreateProxyByInvokeSuper() {
        Enhancer enhancer = new Enhancer();
        UserControllerImpl target = new UserControllerImpl();
        enhancer.setSuperclass(UserControllerImpl.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("invokeSuper before.");
//                Object result = proxy.invokeSuper(target, args);
                // 使用invokeSuper方法调用的时Cglib创建的子类的方法，所以会出发增强后的方法。
                // 利用的是FastClassInfo中的f2对象(即增强后的子类对象)
                Object result = proxy.invokeSuper(obj, args);
                System.out.println("invokeSuper after.");
                return result;
            }
        });

        UserController userController = (UserController) enhancer.create();
        userController.doSomething();
    }
}

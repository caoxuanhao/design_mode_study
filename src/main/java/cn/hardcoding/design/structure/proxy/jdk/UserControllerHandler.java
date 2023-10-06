package cn.hardcoding.design.structure.proxy.jdk;

import cn.hardcoding.design.structure.proxy.UserController;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName UserControllerHandler
 * @Description TODO
 * @Date 2023/10/6 17:39
 * @Author caoxuanhao
 */
public class UserControllerHandler implements InvocationHandler {

    UserController orginalObject;

    public UserControllerHandler(UserController orginalObject) {
        this.orginalObject = orginalObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before");
        Object invoke = method.invoke(orginalObject, args);
        System.out.println("After");
        return invoke;
    }
}

package cn.hardcoding.design.structure.proxy.jdk;

import cn.hardcoding.design.structure.proxy.UserController;

/**
 * @ClassName UserControllerImpl
 * @Description TODO
 * @Date 2023/10/6 17:37
 * @Author caoxuanhao
 */
public class UserControllerImpl implements UserController {

    @Override
    public void doSomething() {
        System.out.println("I`m UserControllerImpl");
    }
}

package cn.hardcoding.design.creator.singleton;

/**
 * @ClassName Hungry
 * @Author caoxuanhao
 * @Date 2023/10/3 16:07
 * @Description 饿汉式实现的单例类
 */
public class Hungry {
    private static final Hungry instance = new Hungry();
    private Hungry() {
    }

    public static Hungry getInstance() {
        return instance;
    }
    // 业务代码...
}

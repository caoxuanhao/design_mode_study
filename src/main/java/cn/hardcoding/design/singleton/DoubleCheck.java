package cn.hardcoding.design.singleton;

/**
 * @ClassName DoubleCheck
 * @Author caoxuanhao
 * @Date 2023/10/3 16:22
 * @Description 双重检测锁实现的单例类
 */
public class DoubleCheck {

    private static volatile DoubleCheck instance;

    private DoubleCheck() {
    }

    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}

package CreationModel.singleton.lazy;

/**
 * 单例模式（懒汉式）
 *      懒汉式单例线程安全控制繁琐，而且性能受影响。
 *   懒汉式在 instance 为空时，创建资源的时候可能会导致线程的不安全
 * @author Atom
 * @version 1.0
 * @date 2020/1/27 - 14:21
 */
public class LazySingleton {
    public static LazySingleton instance = null;

    public LazySingleton() {

    }

    public static LazySingleton getInstance() {
        // 第一重判断
        if (instance == null) {
            // 锁定代码块，确保同一时刻只能有一个线程使用该代码块
            synchronized (LazySingleton.class) {
                // 第二重判断，防止产生多个单例对象
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }


}

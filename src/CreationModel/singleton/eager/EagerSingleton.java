package CreationModel.singleton.eager;

/**
 * 单例模式（饿汉式）
 *      饿汉式单例不能实现延迟加载，不管将来用不用都会占用资源
 *  资源利用率
 *      饿汉式 < 懒汉式
 *  系统加载时间
 *      饿汉式 > 懒汉式
 * @author Atom
 * @version 1.0
 * @date 2020/1/27 - 14:18
 */
public class EagerSingleton {
    public static final EagerSingleton instance = new EagerSingleton();

    public EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}

package CreationModel.singleton;

import CreationModel.singleton.lazy.LazySingleton;

/**
 * 单例模式
 * 饿汉式 eager
 * 懒汉式 lazy
 *
 * @author Atom
 * @version 1.0
 * @date 2020/1/27 - 14:25
 */
public class Client {

    public static void main(String[] args) {

        // 第一次创建懒汉式对象
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println(lazySingleton1);

        // 第二次创建懒汉式对象
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton2);
    }
}

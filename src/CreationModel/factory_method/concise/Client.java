package CreationModel.factory_method.concise;

/**
 * 工厂方法模式
 *  定义
 *      一个用于创建对象的接口，但是让子类决定哪一个类实例化，工厂方法模式让一个类
 *      的实例化延迟到其子类。
 *  别称
 *      1）虚拟构造器模式 Virtual Constructor Pattern
 *      2）多态工厂模式 Ploymorphic Factory Pattern
 *  角色
 *      1）抽象产品
 *      2）具体产品
 *      3）抽象工厂
 *      4）具体工厂
 *
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:12
 */
public class Client {

    public static void main(String[] args) {
        LoggerFactory databaseLoggerFactory = new DatabaseLoggerFactory();
        Logger databaseLogger = databaseLoggerFactory.getLogger();
        databaseLogger.writeLog();

        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger fileLogger = fileLoggerFactory.getLogger();
        fileLogger.writeLog();
    }
}

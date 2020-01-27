package CreationModel.factory_method.hidden;

/**
 * 抽象工厂角色（抽象工厂的隐藏）
 *  日志记录器的工厂接口
 *
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:22
 */
public abstract class LoggerFactory {
    abstract Logger getLogger();

    public void writeLog() {
        this.getLogger().writeLog();
    }
}

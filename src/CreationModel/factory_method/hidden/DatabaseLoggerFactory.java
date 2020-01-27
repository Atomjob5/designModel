package CreationModel.factory_method.hidden;

/**
 * 具体工厂角色
 *      创建数据库日志记录器的工厂
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:23
 */
public class DatabaseLoggerFactory extends LoggerFactory {
    @Override
    public Logger getLogger() {
        return new DatabaseLogger();
    }

}

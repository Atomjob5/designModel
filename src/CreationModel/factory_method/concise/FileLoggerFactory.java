package CreationModel.factory_method.concise;

/**
 * 具体工厂角色
 *      创建文件日志记录器的工厂
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:23
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger getLogger() {
        return new FileLogger();
    }
}

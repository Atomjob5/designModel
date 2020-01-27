package CreationModel.factory_method.hidden;

/**
 * 具体角色
 *      数据库日志记录器
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:21
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录...");
    }
}

package CreationModel.factory_method.concise;

/**
 * 具体角色
 *      文件日志记录器
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:21
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录...");
    }
}

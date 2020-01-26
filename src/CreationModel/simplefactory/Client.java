package CreationModel.simplefactory;

/**
 * 简单工厂模式
 * 角色：
 *      1）Factory 工厂角色
 *      2）Product 抽象产品角色
 *      3）ConcreteProduct 具体产品角色
 * @author Atom
 * @date 2020/1/26 16:54
 */
public class Client {
    public static void main(String[] args) {
        try {
            Chart pie = ChartFactory.createChart("pie");
            pie.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

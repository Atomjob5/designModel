package CreationModel.simplefactory;

/**
 * 具体产品类实现类：
 *      饼状图
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:02
 */
public class PieChart implements Chart {
    public PieChart() {
        System.out.println("创建饼状图");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
}

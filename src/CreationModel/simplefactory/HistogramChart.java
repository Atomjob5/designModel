package CreationModel.simplefactory;

/**
 * 具体产品类实现类：
 *      柱状图
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:02
 */
public class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}

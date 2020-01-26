package CreationModel.simplefactory;

/**
 * 图表创建工厂
 *
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:04
 */
public class ChartFactory {

    public static Chart createChart(String chartName) throws Exception {
        Chart chart = null;
        if (chartName.equals("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化柱状图");
        } else if (chartName.equals("pie")) {
            chart = new PieChart();
            System.out.println("初始化饼状图");
        }else{
            throw new Exception("不存在该图，无法创建");
        }
        return chart;
    }



}

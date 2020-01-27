package CreationModel.builder_pattern.builder;

import CreationModel.builder_pattern.product.Car;

/**
 * 抽象建造者
 *
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:56
 */
public abstract class CarBuilder {
    protected Car car = new Car(); //受保护的汽车对象，只能从汽车构建者的createCar()获得

    /**
     * 构建汽车品牌
     * @return
     */
    public abstract CarBuilder buildBrand();

    /**
     * 构建汽车吨位
     * @return
     */
    public abstract CarBuilder buildTon();

    /**
     * 构建汽车排放量
     * @return
     */
    public abstract CarBuilder buildEmissions();


    /**
     * 工厂方法，返回一个完整的汽车对象
     * @return
     */
    public Car createCar() {
        return this.car;
    }
}

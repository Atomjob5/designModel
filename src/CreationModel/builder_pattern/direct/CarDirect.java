package CreationModel.builder_pattern.direct;

import CreationModel.builder_pattern.builder.CarBuilder;
import CreationModel.builder_pattern.product.Car;

/**
 * 指挥者
 * @author Atom
 * @version 1.0
 * @date 2020/1/27 - 14:08
 */
public class CarDirect {

    public Car construct(CarBuilder carBuilder) {
        Car car = null;
        car = carBuilder.buildBrand().buildTon().buildEmissions().createCar();
        return car;
    }

}

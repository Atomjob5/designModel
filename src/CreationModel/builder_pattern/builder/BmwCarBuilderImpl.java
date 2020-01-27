package CreationModel.builder_pattern.builder;


import CreationModel.builder_pattern.builder.CarBuilder;

 /**
 * 具体建造者
 *   BMW汽车
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:59
 */
public class BmwCarBuilderImpl extends CarBuilder {
    @Override
    public CarBuilder buildBrand() {
        car.setBand("BMW");
        return this;
    }

    @Override
    public CarBuilder buildTon() {
        car.setTon(1.5f);
        return this;
    }

    @Override
    public CarBuilder buildEmissions() {
        car.setEmissions(3.0f);
        return this;
    }
}

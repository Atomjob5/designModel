package CreationModel.builder_pattern.product;

/**
 * 产品对象
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:54
 */
public class Car {
    private String band; //汽车品牌
    private float ton;  //汽车吨位
    private float emissions; //汽车排放量

    @Override
    public String toString() {
        return "Car{" +
                "band='" + band + '\'' +
                ", ton=" + ton +
                ", emissions=" + emissions +
                '}';
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public float getTon() {
        return ton;
    }

    public void setTon(float ton) {
        this.ton = ton;
    }

    public float getEmissions() {
        return emissions;
    }

    public void setEmissions(float emissions) {
        this.emissions = emissions;
    }
}

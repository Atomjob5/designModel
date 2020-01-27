package CreationModel.builder_pattern;

import CreationModel.builder_pattern.builder.BmwCarBuilderImpl;
import CreationModel.builder_pattern.builder.CarBuilder;
import CreationModel.builder_pattern.direct.CarDirect;
import CreationModel.builder_pattern.product.Car;

/**
 * 建造者模式
 *  定义
 *      将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 *      ---
 *      建造者模式是一种对象创建型模式，它将客户端与包含多个部件的复杂对象的创建过程分离，客户端无需知道
 *      复杂对象的内部组成成分与装配方式，只需要知道所需建造者的类型即可
 *  角色
 *      1）抽象建造者
 *      2）具体建造者
 *      3）产品
 *      4）指挥者
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:47
 */
public class Client {

    public static void main(String[] args) {
        CarBuilder bmwCarBuilder = new BmwCarBuilderImpl();
        CarDirect carDirect = new CarDirect();
        Car car = carDirect.construct(bmwCarBuilder);
        System.out.println("car.toString() = " + car.toString());
    }

}

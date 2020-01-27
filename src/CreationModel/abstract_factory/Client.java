package CreationModel.abstract_factory;

import CreationModel.abstract_factory.factory.SkinFactory;
import CreationModel.abstract_factory.factory.impl.SpringSkinFactoryImpl;
import CreationModel.abstract_factory.factory.impl.WindowsSkinFactoryImpl;
import CreationModel.abstract_factory.product.Button;

/**
 * 抽象工厂模式
 *  定义
 *      提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
 *  角色
 *      1）抽象工厂
 *      2）具体工厂
 *      3）抽象产品
 *      4）具体产品
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:33
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory springSkinFactory = new SpringSkinFactoryImpl();
        springSkinFactory.getButton().display();
        springSkinFactory.getTextFiled().display();
        springSkinFactory.getCheckBox().display();

        SkinFactory windowsSkinFactory = new WindowsSkinFactoryImpl();
        windowsSkinFactory.getButton().display();
        windowsSkinFactory.getTextFiled().display();
        windowsSkinFactory.getCheckBox().display();
    }

}

package CreationModel.abstract_factory.product.impl;

import CreationModel.abstract_factory.product.Button;

/**
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:36
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示Spring风格的按钮");
    }
}

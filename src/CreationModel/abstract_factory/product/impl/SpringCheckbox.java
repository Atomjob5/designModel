package CreationModel.abstract_factory.product.impl;


import CreationModel.abstract_factory.product.CheckBox;


/**
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:36
 */
public class SpringCheckbox implements CheckBox {
    @Override
    public void display() {
        System.out.println("显示Spring风格的复选框");
    }
}

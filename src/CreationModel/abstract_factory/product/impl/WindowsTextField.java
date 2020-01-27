package CreationModel.abstract_factory.product.impl;

import CreationModel.abstract_factory.product.TextFiled;

/**
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:36
 */
public class WindowsTextField implements TextFiled {
    @Override
    public void display() {
        System.out.println("显示Windows风格的文本框");
    }
}

package CreationModel.abstract_factory.factory;

import CreationModel.abstract_factory.product.Button;
import CreationModel.abstract_factory.product.CheckBox;
import CreationModel.abstract_factory.product.TextFiled;

/**
 * 抽象工厂角色
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:40
 */
public interface SkinFactory {
    Button getButton();
    TextFiled getTextFiled();
    CheckBox getCheckBox();
}

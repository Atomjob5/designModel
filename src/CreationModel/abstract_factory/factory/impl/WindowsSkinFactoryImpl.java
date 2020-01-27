package CreationModel.abstract_factory.factory.impl;

import CreationModel.abstract_factory.factory.SkinFactory;
import CreationModel.abstract_factory.product.Button;
import CreationModel.abstract_factory.product.CheckBox;
import CreationModel.abstract_factory.product.TextFiled;
import CreationModel.abstract_factory.product.impl.*;

/**
 * @author Atom
 * @version 1.0
 * @date 2020/1/26 - 17:41
 */
public class WindowsSkinFactoryImpl implements SkinFactory {
    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public TextFiled getTextFiled() {
        return new WindowsTextField();
    }

    @Override
    public CheckBox getCheckBox() {
        return new WindowsCheckbox();
    }
}

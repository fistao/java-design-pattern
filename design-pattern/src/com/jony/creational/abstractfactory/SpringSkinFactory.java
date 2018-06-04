
package com.jony.creational.abstractfactory;

/**
 * @author lichao 2018/6/4 - 下午3:06.
 */
public class SpringSkinFactory implements SkinFactory{

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}

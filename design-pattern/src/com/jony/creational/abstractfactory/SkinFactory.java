
package com.jony.creational.abstractfactory;

/**
 * @author lichao 2018/6/4 - 下午3:05.
 */
public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}

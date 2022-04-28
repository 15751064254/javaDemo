package src.design.factory_mothod.example.factories;

import src.design.factory_mothod.example.buttons.Button;
import src.design.factory_mothod.example.buttons.WindowsButton;

/**
 * 具体创建者将重写工厂方法以改变其所返回的产品类型
 * @author Administrator
 */
public class WindowsDialogFactory extends DialogFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
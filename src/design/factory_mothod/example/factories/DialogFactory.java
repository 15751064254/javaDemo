package src.design.factory_mothod.example.factories;

import src.design.factory_mothod.example.buttons.Button;

/**
 * 基础创建者
 * 创建者类声明的工厂方法必须返回一个产品类的对象。
 * 创建者的子类通常会提供该方法的实现。
 *
 * @author Administrator
 */
public abstract class DialogFactory {

    /**
     * 创建者还可提供一些工厂方法的默认实现。
     *
     * @return
     */
    public abstract Button createButton();

    /**
     * 请注意，创建者的只要职责并非是创建产品。
     * 其中通常会包含一些核心业务逻辑，
     * 这些逻辑依赖于由工厂方法返回的产品对象。
     * 子类可通过重写工厂方法并使用返回不同类型的产品来间接修改业务逻辑
     */
    public void renderWindow() {
        // ... other code ...

        // 调用工厂方法创建一个产品对象
        Button okButton = createButton();

        // 现在使用产品
        okButton.click();
        okButton.render();

    }

}

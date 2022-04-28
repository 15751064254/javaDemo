package src.design.factory_mothod.example.buttons;

/**
 * 通用产品接口
 * 产品接口中将声明所有具体产品都必须实现的操作
 * Common interface for all buttons
 * @author Administrator
 */
public interface Button {

    /**
     * 渲染
     */
    void render();

    /**
     * 点击
     */
    void click();
}

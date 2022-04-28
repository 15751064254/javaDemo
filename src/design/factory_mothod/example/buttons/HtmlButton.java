package src.design.factory_mothod.example.buttons;

/**
 * 具体产品
 * 具体产品需提供产品接口的各种实现。
 * HTML button implementation.
 * @author Administrator
 */
public class HtmlButton implements Button {

    @Override
    public void render() {
        // 返回一个按钮的 HTML 表述。
        System.out.println("<button>Test Button</button>");
    }

    @Override
    public void click() {
        // 绑定网路浏览器的点击事件
        System.out.println("Click! Button say - 'Hello Word!' ");
    }
}

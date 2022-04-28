package src.design.factory_mothod.example;

import src.design.factory_mothod.example.factories.DialogFactory;
import src.design.factory_mothod.example.factories.HtmlDialogFactory;
import src.design.factory_mothod.example.factories.WindowsDialogFactory;

/**
 * 工厂客户端
 * 生成跨平台的 GUI 元素
 *
 * @author Administrator
 */
public class Demo {

    private static DialogFactory dialogFactory;


    /**
     * 程序根据当前配置或环境设定选择创建者的类型。
     */
    public static void initialize() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialogFactory = new WindowsDialogFactory();
        } else /*if (System.getProperty("os.name").equals("Web")) */ {
            dialogFactory = new HtmlDialogFactory();
        } /*else {
            throw new Exception("错误！未知的操作系统");
        }*/
    }

    private static void runBusinessLogic() {
        dialogFactory.renderWindow();
    }

    /**
     * 当前客户端代码会与具体创建者的实例进行交互，但是必须通过其基本接口进行
     * 只要客户端通过基本接口与创建者进行交互，你就可将任何创建者子类传递给客户端
     *
     * @param args
     */
    public static void main(String[] args) {
        initialize();
        runBusinessLogic();
    }
}

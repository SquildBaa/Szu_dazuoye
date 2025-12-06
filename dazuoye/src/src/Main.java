// Main.java
import java.util.Arrays;

/**
 * 主程序类

 */
public class Main {

    /**
     * 主方法 - Java 程序的入口点
     * @param args 命令行参数数组
     */
    public static void main(String[] args) {
        // 显示欢迎信息
        System.out.println("=== Java 应用程序启动 ===");

        // 调用其他方法
        printAppInfo();
        processArguments(args);

        // 执行主逻辑
        int result = calculateSum(5, 10);
        System.out.println("计算结果: 5 + 10 = " + result);

        // 结束程序
        System.out.println("=== 程序执行完成 ===");
    }

    /**
     * 打印应用程序信息
     */
    private static void printAppInfo() {
        System.out.println("应用程序: 示例项目");
        System.out.println("Java 版本: " + System.getProperty("java.version"));
    }

    /**
     * 处理命令行参数
     * @param args 命令行参数数组
     */
    private static void processArguments(String[] args) {
        if (args.length == 0) {
            System.out.println("使用提示: 运行时可添加命令行参数");
            return;
        }

        System.out.println("接收到 " + args.length + " 个参数:");
        for (int i = 0; i < args.length; i++) {
            System.out.printf("  [%d] %s%n", i, args[i]);
        }
    }

    /**
     * 示例计算方法
     * @param a 第一个数
     * @param b 第二个数
     * @return 两数之和
     */
    private static int calculateSum(int a, int b) {
        return a + b;
    }
}
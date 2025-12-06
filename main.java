// main.java
public class main {
    public static void main(String[] args) {
        // 程序入口点
        System.out.println("Hello, World!");
        
        // 检查命令行参数
        if (args.length > 0) {
            System.out.println("命令行参数：");
            for (int i = 0; i < args.length; i++) {
                System.out.println("参数 " + i + ": " + args[i]);
            }
        } else {
            System.out.println("没有命令行参数");
        }
    }

}

private main(){
    //try 1
}

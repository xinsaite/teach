import java.util.Scanner;//這是輸入要用的
import java.util.stream.*;//目前來說我是拿來簡化for迴圈用的(只有int可以用)

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//擷取輸入的內容後面用 sc + next 來做組合(要看資料型態)

        System.out.print("輸入一個文字");
        System.out.println(sc.next());
//-----------------------------------------------------------------------------------------------------
        interface MyFunctionalInterface {
            int calculate(int x, int y);//抽象
        }
//先做一個介面
        class SumCalculator implements MyFunctionalInterface {
            @Override//註解來提醒我們要改的是MyFunctionalInterface(父類)這裡的
            public int calculate(int x, int y) {
                //做出上面的功能
                return x + y;
            }
        }


        //方法一
        MyFunctionalInterface sum1 = new SumCalculator();
        System.out.println(sum1.calculate(10, 5));  // 输出 15


        //方法二
        MyFunctionalInterface sum2 = (x, y) -> x + y;
        System.out.println(sum2.calculate(10, 5));  // 输出 15


//-----------------------------------------------------------------------------------------------------
        IntStream.range(1, 5).forEach(i -> System.out.println("* ".repeat(i)));
        //IntStream.range(int 開始數值, int 結束數值)
        //forEach 是 IntStream 介面中的一個方法，它接受一個 IntConsumer 參數，用於處理流中的每個元素
        //IntConsumer 是一個函數式介面，用於表示接受一個 int 型參數並返回 void 的操作。它只包含一個方法 accept(int value)

    }


}

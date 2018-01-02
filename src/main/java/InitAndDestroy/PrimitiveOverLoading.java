package InitAndDestroy;

/**
 * Created by wuxg-a on 2018/1/2.
 */
//第五章 5.2
//基本数据类型能 从一个较小类型自动提升为一个较大的类型
public class PrimitiveOverLoading {
    static void f1(char x){
        System.out.println("f1(char x) " + x );
    }
    static void f1(byte x){
        System.out.println("f1(byte x) " + x);
    }
    static void f1(short x){
        System.out.println("f1(short x) " + x);
    }
    static void f1(int x){
        System.out.println("f1(int x) " + x);
    }
    static void f1(long x){
        System.out.println("f1(long x) " + x);
    }
    static void f1(float x){
        System.out.println("f1(float x) " + x);
    }
    static void f1(double x){
        System.out.println("f1(double x) " + x);
    }

    public static void main(String[] args) {
        //当为较小类型时， 如果形参为小类型的方法不存在，则会寻找更接近的较大类型的方法， 例如该实例中char为最小的参数类型， 如果形参为char不存在，则会依次寻找int long
        char a = 'x';
        f1('a');

        //当参数为较大类型时， 则需通过类型转换来执行窄化转换（较大类型无法自动降级为较小类型）
        double b = 2.10;
        f1(b);
    }
}

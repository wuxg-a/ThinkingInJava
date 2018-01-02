package InitAndDestroy;

/**
 * Created by wuxg-a on 2018/1/2.
 */
public class Test1 {
    private String name ;

    private Test1(){
        name = "hello";
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1.name);
    }
}

import java.util.Scanner;

public  interface InterfaceTest {
    public abstract int add(int a,int b);
    public abstract int sub(int a,int b);
    public abstract int div(int a,int b);
    public abstract int mul(int a,int b);
}//abstract class end
class Test  implements InterfaceTest {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }
}//serviceProvider end
//class t extends serviceProvider
class driver {
    public static void main(String[] args) {
        InterfaceTest t=new serviceProvider();
        int sum,sub,div,mul,one,two;
        Scanner sc = new Scanner(System.in);
        one=sc.nextInt();
        two=sc.nextInt();


        sum=t.add(one,two);
        sub=t.sub(one,two);
        div=t.div(one,two);
        mul=t.mul(one,two);
        System.out.println("sum of two number : "+one+","+two+"= "+sum);
        System.out.println("sub of two number : "+one+","+two+"= "+sub);
        System.out.println("div of two number : "+one+","+two+"= "+div);
        System.out.println("mul of two number : "+one+","+two+"= "+mul);

    }
}

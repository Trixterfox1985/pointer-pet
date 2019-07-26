import java.sql.SQLOutput;

public class MyMathExecution {
    public static void main(String[] args) {
        MyMath matemat = new MyMath();

        int i;

        matemat.mathsumall();
        matemat.mathround();
        matemat.mathavg();

        i = Math.max(MyMath.getARG1(),  MyMath.getARG2());

        System.out.println("З елементів " + matemat.getARG1() + " та " + matemat.getARG2() + " більший: " + i);
    }
}

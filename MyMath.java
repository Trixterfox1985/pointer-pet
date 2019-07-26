public class MyMath {

    private static final int ARG1 = 16;
    private static final int ARG2 = 20;
    private static final int ARG3 = -5;
    private static final double ARG4 = 39.60;

    static {
        System.out.println("Параметри констант які були задані: ");
        System.out.println("ARG1 -> " + ARG1);
        System.out.println("ARG2 -> " + ARG2);
        System.out.println("ARG3 -> " + ARG3);
        System.out.println("ARG4 -> " + ARG4);
        System.out.println();
    }

    public static int getARG1() {
        return ARG1;
    }

    public static int getARG2() {
        return ARG2;
    }

    public static int getARG3() {
        return ARG3;
    }

    public static double getARG4() {
        return ARG4;
    }

    public static int mathsumall(){
        System.out.println("Вивести суму всіх значень -> " + (ARG1 + ARG2 + ARG3 + ARG4));
        System.out.println();
        return (int)(ARG1 + ARG2 + ARG3 + ARG4);
    }

    public static void mathround(){
        System.out.println("Округлити значення із плаваючою комою -> " + getARG4() + " -> " + Math.round(getARG4()));
        System.out.println();
    }

    public static void mathavg(){
        System.out.println("Визначити корінь кв. -> " + Math.sqrt(mathsumall()));
        System.out.println();
    }
}


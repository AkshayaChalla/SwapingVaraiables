public class Swap {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println("Before Swap : ");
        System.out.println("value of a =" + a);
        System.out.println("value of b =" + b);
        int c = a;
        a = c;
        a = b;
        b = c;
        System.out.println("AFTER SWAPPING : ");
        System.out.println("value a =" + a);
        System.out.println("value b = " + b);

    }
}

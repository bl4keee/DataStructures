public class RecursiveMethods {
    public static void main(String[] args) {

        sayHi(5);
        countBackwards(14);
    }

    public static void sayHi(int n) {
        if (n == 0) {
            System.out.println("Done!");
        } else {
            System.out.println("Hi!");
            n--;
            sayHi(n);
        }
    }

    public static void countBackwards (int n) {
        if (n == 0) {
            System.out.println("Done!!");
        } else {
            System.out.println(n);
            n--;
            countBackwards(n);
        }
    }
}

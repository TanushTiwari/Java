package Recursion;

public class xpown {
    public static void main(String[] args) {
        System.out.println(xpown(2, 10));
    }
    static int xpown(int a, int b) {
        //base case
        if (b == 0) {
            return 1;
        }
        //working model
        if (b % 2 == 0) {
            return xpown(a, b / 2) * xpown(a, b / 2);
        } else {
            return a * xpown(a, b / 2) * xpown(a, b / 2);
        }
        //TC = O(log b)
        //SC = O(log b) (auxiliary space)
    }
}

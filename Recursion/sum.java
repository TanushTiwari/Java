package Recursion;

public class sum {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = sum(n - 1);
        int sn = n + snm1;
        // or sn = n + sum(n-1);
        //TC = O(n)
        //SC = O(n)  (auxiliary space)
        return sn;
    }
}

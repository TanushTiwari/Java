import java.util.*;

public class PatternAdvanceMenu {
    
    // Butterfly Pattern
    public static void printButterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int k = 0; k < 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int k = 0; k < 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    // Diamond Pattern
    public static void printDiamond(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    // Floyd's Triangle
    public static void printFloydTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");
        }
    }
    
    // Hollow Rhombus
    public static void printHollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // hollow rectangle
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
    // Hollow Rectangle
    public static void printHollowRectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
    // Inverted Half Pyramid
    public static void printInvertedHalfPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    // Inverted Rotated Half Pyramid
    public static void printInvertedRotatedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    // Rhombus Pattern
    public static void printRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    // Triangle with 0s and 1s
    public static void printTriangleZeroOne(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== PATTERN ADVANCE MENU ===");
            System.out.println("1. Butterfly Pattern");
            System.out.println("2. Diamond Pattern");
            System.out.println("3. Floyd's Triangle");
            System.out.println("4. Hollow Rhombus");
            System.out.println("5. Hollow Rectangle");
            System.out.println("6. Inverted Half Pyramid");
            System.out.println("7. Inverted Rotated Half Pyramid");
            System.out.println("8. Rhombus Pattern");
            System.out.println("9. Triangle with 0s and 1s");
            System.out.println("10. Exit");
            System.out.print("Enter your choice (1-10): ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter number of lines for Butterfly Pattern: ");
                    int n1 = sc.nextInt();
                    printButterfly(n1);
                    break;
                case 2:
                    System.out.print("Enter number of lines for Diamond Pattern: ");
                    int n2 = sc.nextInt();
                    printDiamond(n2);
                    break;
                case 3:
                    System.out.print("Enter number of lines for Floyd's Triangle: ");
                    int n3 = sc.nextInt();
                    printFloydTriangle(n3);
                    break;
                case 4:
                    System.out.print("Enter number of lines for Hollow Rhombus: ");
                    int n4 = sc.nextInt();
                    printHollowRhombus(n4);
                    break;
                case 5:
                    System.out.print("Enter number of rows for Hollow Rectangle: ");
                    int rows = sc.nextInt();
                    System.out.print("Enter number of columns for Hollow Rectangle: ");
                    int cols = sc.nextInt();
                    printHollowRectangle(rows, cols);
                    break;
                case 6:
                    System.out.print("Enter number of lines for Inverted Half Pyramid: ");
                    int n6 = sc.nextInt();
                    printInvertedHalfPyramid(n6);
                    break;
                case 7:
                    System.out.print("Enter number of lines for Inverted Rotated Half Pyramid: ");
                    int n7 = sc.nextInt();
                    printInvertedRotatedHalfPyramid(n7);
                    break;
                case 8:
                    System.out.print("Enter number of lines for Rhombus Pattern: ");
                    int n8 = sc.nextInt();
                    printRhombus(n8);
                    break;
                case 9:
                    System.out.print("Enter number of lines for Triangle with 0s and 1s: ");
                    int n9 = sc.nextInt();
                    printTriangleZeroOne(n9);
                    break;
                case 10:
                    System.out.println("Thank you for using Pattern Advance Menu!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1-10.");
            }
            
            System.out.println("\nPress Enter to continue...");
            sc.nextLine(); // consume newline
            sc.nextLine(); // wait for user input
        }
    }
}

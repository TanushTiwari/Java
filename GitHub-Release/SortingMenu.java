import java.util.*;

public class SortingMenu {
    
    // Bubble Sort
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Selection Sort
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    
    // Insertion Sort
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    // Counting Sort
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    // Quick Sort
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    
    // Merge Sort
    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    public static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];
        
        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[mid + 1 + j];
            
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    
    // Print Array
    public static void printArray(int arr[]) {
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Get array input from user
    public static int[] getArrayInput(Scanner sc) {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== SORTING ALGORITHMS MENU ===");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Counting Sort");
            System.out.println("5. Quick Sort");
            System.out.println("6. Merge Sort");
            System.out.println("7. Inbuilt Sort (Arrays.sort())");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("=== BUBBLE SORT ===");
                    int[] arr1 = getArrayInput(sc);
                    System.out.print("Original Array: ");
                    for (int i : arr1) System.out.print(i + " ");
                    System.out.println();
                    bubbleSort(arr1);
                    printArray(arr1);
                    break;
                case 2:
                    System.out.println("=== SELECTION SORT ===");
                    int[] arr2 = getArrayInput(sc);
                    System.out.print("Original Array: ");
                    for (int i : arr2) System.out.print(i + " ");
                    System.out.println();
                    selectionSort(arr2);
                    printArray(arr2);
                    break;
                case 3:
                    System.out.println("=== INSERTION SORT ===");
                    int[] arr3 = getArrayInput(sc);
                    System.out.print("Original Array: ");
                    for (int i : arr3) System.out.print(i + " ");
                    System.out.println();
                    insertionSort(arr3);
                    printArray(arr3);
                    break;
                case 4:
                    System.out.println("=== COUNTING SORT ===");
                    int[] arr4 = getArrayInput(sc);
                    System.out.print("Original Array: ");
                    for (int i : arr4) System.out.print(i + " ");
                    System.out.println();
                    countingSort(arr4);
                    printArray(arr4);
                    break;
                case 5:
                    System.out.println("=== QUICK SORT ===");
                    int[] arr5 = getArrayInput(sc);
                    System.out.print("Original Array: ");
                    for (int i : arr5) System.out.print(i + " ");
                    System.out.println();
                    quickSort(arr5, 0, arr5.length - 1);
                    printArray(arr5);
                    break;
                case 6:
                    System.out.println("=== MERGE SORT ===");
                    int[] arr6 = getArrayInput(sc);
                    System.out.print("Original Array: ");
                    for (int i : arr6) System.out.print(i + " ");
                    System.out.println();
                    mergeSort(arr6, 0, arr6.length - 1);
                    printArray(arr6);
                    break;
                case 7:
                    System.out.println("=== INBUILT SORT ===");
                    int[] arr7 = getArrayInput(sc);
                    System.out.print("Original Array: ");
                    for (int i : arr7) System.out.print(i + " ");
                    System.out.println();
                    Arrays.sort(arr7);
                    printArray(arr7);
                    break;
                case 8:
                    System.out.println("Thank you for using Sorting Menu!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1-8.");
            }
            
            System.out.println("\nPress Enter to continue...");
            sc.nextLine(); // consume newline
            sc.nextLine(); // wait for user input
        }
    }
}

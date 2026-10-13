
// 1. Program using Bubble sort
//public class SortingAlgo {
//    static void bubbleSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
//    public static void main (String[]args){
//        int[] arr = {7, 4, 9, 2, 1};
//        bubbleSort(arr);
//        System.out.println("Printing the array: ");
//        for (int value : arr) {
//            System.out.print(value);
//        }
//    }
//}

// 2. Program using bubble sort.

//public class SortingAlgo {
//static void sorting(int[] arr) {
//    int n = arr.length;
//    for (int i=0; i<n-1; i++) {
//        for (int j=0; j<n-i-1; j++) {
//            if (arr[j] > arr[j+1]) {
//                int temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//            }
//        }
//    }
//}
//    public static void main(String[] args) {
//        int[] arr = {18,2,7,9,12,14,0};
//        sorting(arr);
//        System.out.println("sorted array printing: ");
//        for (int value: arr) {
//            System.out.print(value+ " ");
//        }
//    }
//}

// 3. Program using Selection sort.

//public class SortingAlgo {
//    static void selectionSort(int[] arr) {
//        int n = arr.length;
//        // Outer loop for rounds.
//        for (int i=0; i<n-1; i++) {
//            int minIndex=i;
//            // Inner loop for comparison of arr[j] and minIndex.
//            for(int j=i+1; j<n; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//                int temp = arr[i];
//                arr[i] = arr[minIndex];
//               arr[minIndex] = temp;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {7,2,9,12,1};
//        selectionSort(arr);
//        System.out.println("Printing sorted array: ");
//        for (int value: arr) {
//            System.out.print(value+" ");
//        }
//    }
//}

//public class SortingAlgo {
//    static void number(int n) {
//        if (n==1) {
//            return; // base case
//        }
//        System.out.println(n);
//        number (n-1); // recursive case
//    }
//    public static void main(String[] args) {
//        number(10);
//    }
//}

//public class SortingAlgo {
//   static int sum(int n,int sum) {
//        if (n == 0) {
//            return sum;
//        }
//        return sum(n-1, n + sum);
//    }
//    public static void main(String[] args) {
//        System.out.println(sum(5, 0));
//    }
//}



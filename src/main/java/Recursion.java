// 1. Print numbers from 1 to N.

//public class Recursion {
// static void pintNumbers(int n) {
//    if (n == 0) {
//        return; // base case
//    }
//    pintNumbers(n-1);
//     System.out.println(n); // recursive case
//  }
//    public static void main(String[] args) {
//        pintNumbers(10);
//    }
//}

// 2. Print numbers from N to 1.

//public class Recursion {
//    static void printNumber(int n) {
//        if (n==0) {
//            return;
//        }
//        System.out.println(n);
//        printNumber(n-1);
//    }
//
//    public static void main(String[] args) {
//        printNumber(10);
//    }
//}

// 3. Print a number N times.

//public class Recursion {
//    static void printNumber(int number, int n) {
//        if (n == 0) {
//            return;
//        }
//        System.out.print(number);
//        printNumber(number, n-1);
//    }
//
//    public static void main(String[] args) {
//        printNumber(5,3);
//    }
//}

// 4. Print the sum of first natural number of N

//public class Recursion {
//    static int sum(int n, int sum) {
//        if (n == 0) {
//            return sum;
//        }
//       return sum(n-1, n+sum);
//    }
//    public static void main(String[] args) {
//        System.out.println(sum(5, 0));
//    }
//}

// 5. Calculate ab using recursion.

//public class Recursion {
//    static int power(int a, int b) {
//        if (b == 0) {
//            return 1;
//        }
//        return a*power(a, b-1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(power(2,3));
//    }
//}

// 6. Print Even number from 1 to N.

//public class Recursion {
//    static void even(int n) {
//        if (n == 0) {
//            return;
//        }
//        even(n-1);
//        if (n%2==0) {
//            System.out.println(n);
//        }
//    }
//
//    public static void main(String[] args) {
//       even(10);
//    }
//}

// 7. print odd number from 1 to N.

//public class Recursion {
//    static void odd(int n) {
//        if (n==0) {
//            return;
//        }
//        odd(n-1);
//        if (n%2==1) {
//            System.out.println(n);
//        }
//    }
//    public static void main(String[] args) {
//        odd(12);
//    }
//}

// 8. Find the sum of digits.

//public class Recursion {
//    static int digits(int n, int sum) {
//        if (n == 0) {
//            return sum;
//        }
//       return digits(n-1, n+sum);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(digits(10,0));
//    }
//}

// 9. Count the digits of a number

//public class Recursion {
//    static int countDigits(int n) {
//        if (n >= 0 && n<=9) { // if the number will be in the condition it will return 1.
//            return 1;
//        }
//        return 1+countDigits(n/10); // this will remove each last element from the digits and add 1 for count.
//    }
//
//    public static void main(String[] args) {
//        System.out.println( countDigits(1234511));
//    }
//}

// 10. Reverse a number.

//public class Recursion {
//    static int reverse(int n, int rev) {
//        if (n==0) {
//            return rev;
//        }
//        return reverse(n/10, rev*10+n%10);
//    }
//
//    public static void main(String[] args) {
//        System.out.println( reverse(12345, 0));
//    }
//}

// 11. maze path problem.

//import java.util.Scanner;
//
//public class Recursion {
//    static int maze(int row, int col, int n, int m) {
//        if ((row == m) || col == n) {
//            return 1;
//        }
//       int rightWays = maze(row, col+1, n,m);
//        int leftWays = maze(row+1, col,n,m);
//return rightWays + leftWays;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//        System.out.println("Enter m: ");
//        int m = sc.nextInt();
//        System.out.println(maze(1,1,n,m));
//    }
//}

// 12. Traverse array with recursion.

//public class Recursion {
//    static void traverse(int[] arr, int i) {
//        if (i == arr.length) {
//            return;
//        }
//        System.out.println(arr[i]);
//        traverse(arr, i+1);
//        //System.out.println(arr[i]);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        traverse(arr,0);
//    }
//}

// 13. Subset problem using recursion.

public class Recursion {
static void subSet(int i, String s, String ans) {
    if (i==s.length()) {
        System.out.println(ans);
        return;
    }
    char ch = s.charAt(i);
    subSet(i+1, s, ans+ch);  // take
    subSet(i+1, s, ans); // skip
}

    public static void main(String[] args) {
      String s = "abc";
      subSet(0, s, " - ");

    }
}
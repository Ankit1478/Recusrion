public class recursion {
    public static void rec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;

        }
        System.out.println(n);
        rec(n - 1);

    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int SumOfNatural(int n) {
        if (n == 0) {
            return 0;
        }
        return n + SumOfNatural(n - 1);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);

    }

    // Dynamic Programing
    public static int fibTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // memoization
    public static int fibmemoixation(int n, int f[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {
            return f[n];
        }
        f[n] = fibmemoixation(n - 1, f) + fibmemoixation(n - 2, f);
        return f[n];

        // in main we have to write int dp[] = new int[n + 1];
    }

    // sorted array
    public static boolean sortedarray(int arr[], int i) {
        // Base case
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return sortedarray(arr, i + 1);
    }

    // first occurance
    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i + 1);
    }

    // last occurance
    public static int lastoccur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastoccur(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    // power of a number
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pow(x, n - 1);
    }

    // time complixity - O(logn)
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfsquare = power(x, n / 2);
        if (n % 2 != 0) {
            return x * halfsquare * halfsquare;
        } else {
            return halfsquare * halfsquare;
        }

    }

    // remove duplicate
    public static void removeDuplicate(String str, int idx, StringBuilder s, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(s);
            return;
        }
        char ch = str.charAt(idx);
        if (map[ch - 'a'] == true) {
            removeDuplicate(str, idx + 1, s, map);
        } else {
            map[ch - 'a'] = true;
            removeDuplicate(str, idx + 1, s.append(ch), map);
        }
    }

    // pair
    public static int friendpair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendpair(n - 1) + (n - 1) * friendpair(n - 2);
    }

    // Tower of honaoi
    public static void toh(int n, char src, char dest, char helper) {
        if (n == 1) {
            System.out.println("move disk " + n + " from " + src + " to " + dest);
            return;
        }
        toh(n - 1, src, helper, dest);

        toh(n - 1, helper, dest, src);
        System.out.println("move disk " + n + " from " + helper + " to " + dest);
    }

    // print String Binary
    public static void printbinary(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printbinary(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printbinary(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printbinary(3, 0, " ");
        // int n = 3;
        // toh(n, 'A', 'B', 'C');
        // System.out.println(friendpair(3));
        // String str = "helloworld";
        // removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(power(2, 5));
        // System.out.println(fibTabulation(4));
    }
}

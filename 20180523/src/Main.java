import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[] a = new int[b];
        for (int i = 0; i < b; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(production(a));
    }

    public static int production(int[] ary) {
        int max = 0;
        for (int i = 0; i < ary.length; i++) {
            int x = ary[i];
            for (int j = i+1; j < ary.length; j++) {
                x *= ary[j];
                if (x == 0) break;
                if (x > max) max = x;
            }
        }
        return max;
    }
}
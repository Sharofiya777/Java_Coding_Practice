import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        boolean f = false;

        int[] res = new int[3];

        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 1; j < n - 1; j++) {

                for (int k = j + 1; k < n; k++) {

                    int sum = a[i] + a[j] + a[k];

                    if (sum == x) {

                        f = true;

                        res[0] = a[i];
                        res[1] = a[j];
                        res[2] = a[k];

                        break;
                    }
                }

                if (f)
                    break;
            }

            if (f)
                break;
        }

        if (f) {
            System.out.println(res[0] + " " + res[1] + " " + res[2]);
        } else {
            System.out.println("No triplet found with the given sum");
        }
    }
}
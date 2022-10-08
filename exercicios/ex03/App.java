import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();
        final int MAX = 1000;
    
        int[] arr = new int[MAX];
        int j = 0;
        for (int i = 0; i < MAX; i++) {
            arr[i] = j;
            j++;
            System.out.println("N[" + i + "] = " + arr[i]);
            if (j == t)
                j = 0;
        }

    }
}
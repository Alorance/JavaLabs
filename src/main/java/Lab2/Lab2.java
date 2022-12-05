package Lab2;
import java.util.Random;
import java.util.Scanner;


public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input rows < 20: ");
        int rows = in.nextInt();
        System.out.print("Input cols < 20: ");
        int cols = in.nextInt();

        if (rows > 20 && cols > 20)
        {
            System.out.print("Width or Height values are too large: ");
        }

        if (rows <= 20 && cols <= 20) {
            System.out.print("Input case you want :\n 1) Random Matrix\n 2) Write matrix values yourself\n");
            int m = in.nextInt();
            switch (m) {
                case 1 -> {
                    int[][] a = new int[rows][cols];
                    Random rnd = new Random();
                    for (int i = 0; i < a.length; i++) {
                        for (int j = 0; j < a[i].length; j++) {
                            a[i][j] = rnd.nextInt(100) + 1;
                        }
                    }
                    for (int i = 0; i < a.length; i++, System.out.println()) {
                        for (int j = 0; j < a[i].length; j++) {
                            System.out.print(a[i][j] + " ");
                        }
                    }

                }
                case 2 -> {
                    int[][] b = new int[rows][cols];
                    for (int i = 0; i < b.length; i++) {
                        for (int j = 0; j < b[i].length; j++) {
                            System.out.print("Input element of Matrix[" + i + "][" + j + "]:");
                            b[i][j] = in.nextInt();
                        }
                    }
                    in.close();

                    for (int i = 0; i < b.length; i++, System.out.println()) {
                        for (int j = 0; j < b[i].length; j++) {
                            System.out.print(b[i][j] + " ");
                        }
                    }
                }
            }

        }
    }
}

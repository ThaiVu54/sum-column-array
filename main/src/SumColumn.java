import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        createArray();
        System.out.print("Bạn muốn tính tổng cột thứ bao nhiêu: ");
        Scanner sc1 = new Scanner(System.in);
        int col = sc1.nextInt();
        double[][] arr1 = createArray();
        System.out.println("tổng của cột "+col+ " = "+sum(arr1,col));
    }

    public static double sum(double[][] arr, int col) {
        double total = 0.0;
        for (int i = 0; i < arr[col].length; i++) {
            total += arr[col][i];
        }
        return total;

//        for (int i = 0; i < totalRows; i++)
//        {
//            for (int j = 0; j < totalColumns; j++)
//            {
//                rowTotal[i] += numbers[i * totalColumns + j];
//                blockTotal[j] += numbers[i * totalColumns + j];
//            }
//        }
    }

    public static double[][] createArray() {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("nhập số hàng: ");
        m = sc.nextInt();
        System.out.print("nhập số cột: ");
        n = sc.nextInt();
        double[][] arr = new double[m][n];
        System.out.println("nhập các phần tử trong mảng: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("mảng vừa tạo: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        return arr;
    }
}

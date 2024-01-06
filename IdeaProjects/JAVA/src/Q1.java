import java.util.*;

public class Q1 {
    public static void found(int numbers[][], int rows, int column) {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < column; j++)
                if (numbers[i][j] == 0) {
                    System.out.println("The object is in row " + (i) + " and column " + (j));
                    break;
                }
    }

    public static void rec(int numbers[][], int rows, int colomn, int i, int j) {
        int c = i + 1, s = j + 1;
        if (numbers[i][j] == 0) {
            System.out.println("The object is in row " + (c - 1) + " and column " + (s - 1));
            numbers[i][j] = 1;
            return;
        }

        if (i + 1 >= rows && j + 1 == colomn - 1)
            rec(numbers, rows, colomn, i, s);
        else if (i + 1 == rows - 1 && j + 1 >= colomn)
            rec(numbers, rows, colomn, c, j);
        else  if (i + 1 >= rows || j + 1 >= colomn)
            return;
        else {
            rec(numbers, rows, colomn, i, s);
            rec(numbers, rows, colomn, c, j);
        }
    }

    public static void rec1(int numbers[][], int rows, int colomn, int i, int j) {
        int c = i + 1, s = j + 1;
        if (numbers[i][j] == 0) {
            System.out.println("The object is in row " + (i) + " and column " + (j));
            numbers[i][j] = 1;
            return;
        }
        if (i + 1 >= rows && j + 1 == colomn - 1)
            rec(numbers, rows, colomn, i, s);
        else if (i + 1 == rows - 1 && j + 1 >= colomn)
            rec(numbers, rows, colomn, c, j);
        else if (i + 1 >= rows || j + 1 >= colomn || numbers[i][j] == -1)
            return;
        else {
            rec1(numbers, rows, colomn, i, s);
            rec1(numbers, rows, colomn, c, j);
        }
    }

    public static void found1(int numbers[][], int rows, int column) {
        if (numbers[0][0] == 0)
            System.out.println("The object is in row 0 and column 0");
        else
            for (int k = 0; k < rows; k++)
                if (k + 1 != rows) {
                    if (numbers[k + 1][0] == -1) {
                        for (int i = 0; i < column; i++)
                            if (numbers[k][i] == 0) {
                                System.out.println("The object is in row " + (k) + " and column " + (i));
                                break;
                            }
                    }
                }else if ((k == rows - 1 && numbers[k][0] != -1))
                    for (int i = 0; i < column; i++)
                        if (numbers[k][i] == 0) {
                            System.out.println("The object is in row " + (k) + " and column " + (i));
                            break;
                        }
    }

    public static void rec2(int numbers[][], int rows, int colomn, int x, int y, int i, int j) {
        if (i < 0 || j < 0)
            return;
        numbers[i][j] = (x - i) + (y - j);
        rec2(numbers, rows, colomn, x, y, i - 1, j);
        rec2(numbers, rows, colomn, x, y, i, j - 1);
    }

    public static void main(String[] args) {
        int number[][] = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 0}
        };//change 3 to how many column do you have in array
        System.out.println("Solution for 1 :");
        System.out.print("ITERATIVE ");
        found(number, number.length, 3);
        System.out.print("RECURSION ");
        rec(number, number.length, 3, 0, 0);
        System.out.println();
        number = new int[][]{
                {3, 2, 1},
                {2, 1, 0},
                {-1, -1, -1}
        };
        System.out.println("Solution for 2 part 1 :");
        System.out.print("iterative ");
        found1(number, number.length, 3);
        System.out.print("recursion ");
        rec1(number, number.length, 3, 0, 0);
        System.out.println();
        number = new int[][]{
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };
        int x = 1, y = 1;
        number[x][y] = 0;
        System.out.println("Solution for 2 part 2 :");
        rec2(number, number.length, 3, x, y, x, y);
        for (int i = 0; i < number.length; i++) {
            if (i > 0)
                System.out.println();
            for (int j = 0; j < 3; j++)
                System.out.print(number[i][j] + " ");
        }
    }
}
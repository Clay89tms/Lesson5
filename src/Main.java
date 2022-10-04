import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer DZ = sc.nextInt();

        switch (DZ) {
            case (1):
            case (2):
            case (3):
                dz05_03();
                break;
            case (4):
                dz05_04();
                break;
            default:
                System.out.println();
        }
    }

    private static void dz05_04() {
        System.out.println("Создайте двумерный массив целых чисел. Отсортируйте элементы в\n" +
                "строках двумерного массива по возрастанию.");
        int[][] mas2 = new int[5][5];
        System.out.println("Исходный произвольный массив : ");
        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                mas2[i][j] = (int) (Math.random() * 10);
                System.out.print(mas2[i][j] + " ");
            }
            System.out.print("\n");
        }
//        Сортировка
        System.out.println("Отсортированный массив : ");
        boolean boo = true;
        while (boo) {
            for (int i = 0; i < mas2.length; i++) {
                boo = false;
                for (int j = 0; j < mas2[i].length - 1; j++) {
                    //a=x 5
                    //b=y 2
                    //a=a+b  5+2 = 7
                    //b=a-b  5+2-2 = 5
                    //a=a-b  5+2-5 = 2
                    if (mas2[i][j] > mas2[i][j + 1]) {
                        mas2[i][j] += mas2[i][j + 1];
                        mas2[i][j + 1] = mas2[i][j] - mas2[i][j + 1];
                        mas2[i][j] = mas2[i][j] - mas2[i][j + 1];
                        boo = true;
                    }
                }
            }
        }
//        Выводим на экран
        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                System.out.print(mas2[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    private static void dz05_03() {
        System.out.println("Создайте двумерный массив целых чисел. Выведите на консоль сумму\n" +
                "всех элементов массива.");
        int sum = 0;
        int[][] mas2 = new int[5][5];
        System.out.println("Исходный произвольный массив : ");
        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                mas2[i][j] = (int) (Math.random() * 10);
                System.out.print(mas2[i][j] + " ");
                sum += mas2[i][j];
            }
            System.out.print("\n");
        }
        System.out.println("Сумма всех элементов = " + sum);

    }
}
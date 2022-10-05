import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer dz5 = null;
        do {
            dz5 = 0;
            System.out.print("Введите номер ДЗ 05 (№1-4) : ");
            if (sc.hasNextInt()) {
                dz5 = sc.nextInt();
                switch (dz5) {
                    case (1):
                        dz5_01();
                        break;
                    case (2):
                        dz5_02();
                        break;
                    case (3):
                        dz05_03();
                        break;
                    case (4):
                        dz05_04();
                        break;
                    default:
                        System.out.println("нет такого ДЗ, попробуйте снова.");
                }

            } else {
                System.out.println("Ввели не число...");
                break;
            }
        } while (dz5 < 5);
        sc.close();
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

    private static void dz5_02() {
        System.out.println("Шахматная доска\n" +
                "Создать программу для раскраски шахматной доски с помощью цикла.\n" +
                "Создать двумерный массив String'ов 8х8. С помощью циклов задать\n" +
                "элементам циклам значения B(Black) или W(White). Результат работы\n" +
                "программы:\n" +
                "W B W B W B W B\n" +
                "B W B W B W B W\n" +
                "W B W B W B W B\n" +
                "B W B W B W B W\n" +
                "W B W B W B W B\n" +
                "B W B W B W B W\n" +
                "W B W B W B W B\n" +
                "B W B W B W B W");
        String chess[][] = new String[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j += 2) {
                if ((i == 0) || (i % 2 == 0)) {
                    chess[i][j] = "W";
                    chess[i][j + 1] = "B";
                } else {
                    chess[i][j + 1] = "W";
                    chess[i][j] = "B";
                }
            }
        }
        System.out.println("Выводим таблицу : ");
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void dz5_01() {
        System.out.println("(01): \nСоздать трехмерный массив из целых чисел.\n" +
                "С помощью циклов \"пройти\" по всему массиву и увеличить каждый\n" +
                "элемент на заданное число. Пусть число, на которое будет\n" +
                "увеличиваться каждый элемент, задается из консоли.");

        int mas3[][][] = new int[5][5][5];
        System.out.println("Изначальный рандомный массив : ");
        for (int a = 0; a < mas3.length; a++) {
            for (int b = 0; b < mas3[a].length; b++) {
                System.out.print("{");
                for (int c = 0; c < mas3[a][b].length; c++) {
                    mas3[a][b][c] = (int) (Math.random() * 9);
                    System.out.print(mas3[a][b][c] + " ");
                }
                System.out.print("}\t");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        Integer chis = null;
        System.out.print("Введите число на которое увеличить все эллементы массива : ");
        if (sc.hasNextInt()) {
            chis = sc.nextInt();
            System.out.println("Измененный массив (" + chis + ") : ");
            for (int a = 0; a < mas3.length; a++) {
                for (int b = 0; b < mas3[a].length; b++) {
                    System.out.print("{");
                    for (int c = 0; c < mas3[a][b].length; c++) {
                        mas3[a][b][c] += chis;
                        System.out.print(mas3[a][b][c] + " ");
                    }
                    System.out.print("}\t");
                }
                System.out.println();
            }
        }
    }
}

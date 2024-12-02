import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = 0;
        while (w==0){
            System.out.print("----------------\nКалькулятор\nВведите первое число: ");
            int n1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int n2 = scanner.nextInt();
            System.out.print("Выберите действие: \n1 - Сложение\n2 - Вычитание\n3 - Умножение\n4 - Деление\n5 - Процент \n6 - Степень\n7 - Выход\nВвод: ");
            int q = scanner.nextInt();
            switch (q) {
                case 1:
                    System.out.println("Результат: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Результат: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Результат: " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("Результат: " + (n1 / n2));
                    break;
                case 5:
                    System.out.println("Результат: " + (n1 % n2));
                    break;
                case 6:
                    System.out.println("Результат: " + (n1 / n2)*100 + "%");
                    break;
                case 7:
                    w=1;
                    break;

                default:
                    System.out.println("Некорректный ввод. Пожалуйста, выберите 1 или 2.");
                    break;
            }
        }
    }
}

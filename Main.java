import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numOne = number();
        int numTwo = number();
        char op = operation();
        int result = calc(numOne, numTwo, op);
        int num;

    }
    public static int number() {
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = number();
        }
        return num;
    }

    public static char operation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = operation();
        }
        return operation;
    }

    public static int calc(int numOne, int numTwo, char op) {
        while (true){
            System.out.println("Выберите номер операции:\n1 - прибавить\n2 - отнять\n3 - умножить\n4 - разделить\n5 - возведение в степень\n 6 - факториал\n7-выход");
            int result = 1;
            switch (op) {
                case '1':
                    result = numOne + numTwo;
                    System.out.println("Результат" + result);
                    break;
                case '2':
                    result = numOne - numTwo;
                    System.out.println("Результат" + result);
                    break;
                case '3':
                    if (numTwo != 0) {
                        result = numOne / numTwo;
                        System.out.println("Результат" + result);
                    } else {
                        System.out.println("Делить на 0 нельзя!!!!!!");
                    }
                    break;
                case '4':
                    if (numTwo != 0) {
                        result = numOne * numTwo;
                        System.out.println("Результат" + result);
                    } else {
                        System.out.println("Умножать на 0 нельзя!!!!!!");
                    }
                    break;
                case '5':
                    for (int i = 1; i <= numTwo; i++) {
                        result = result * numOne;
                    }
                    System.out.println(result);
                    return result;

                case '6':
                    System.out.println("Введите число:");
                    int numFact = scanner.nextInt();
                    for (int i = 1; i <= numFact; i++) {
                        result = result * i;
                    }
                    System.out.println(result);
                    return result;

            }
            return result;


        }

    }
}
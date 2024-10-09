import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите арифметическое выражение:");
            String input = scanner.nextLine();
            System.out.println("Результат: " + calc(input));
        }
    }
    static String calc(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Некорректный ввод");
        }
        int a = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int b= Integer.parseInt(parts[2]);

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new IllegalArgumentException("Числа должны быть от 1 до 10 включительно");
        }
        return switch (operator) {
            case "+" -> String.valueOf(a + b);
            case "-" -> String.valueOf(a - b);
            case "*" -> String.valueOf(a * b);
            case "/" -> String.valueOf(a / b);
            default -> throw new IllegalArgumentException("Некорректная операция");
        };
    }
}
 class Calculator{
 public static void main(String[] ...s) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Welcome to Calculator");
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /, %, ^, sqrt): ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = add(num1, num2);
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = subtract(num1, num2);
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = multiply(num1, num2);
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    result = divide(num1, num2);
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;
            case '%':
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = modulus(num1, num2);
                System.out.println(num1 + " % " + num2 + " = " + result);
                break;
            case '^':
                System.out.print("Enter the power: ");
                num2 = scanner.nextDouble();
                result = power(num1, num2);
                System.out.println(num1 + " ^ " + num2 + " = " + result);
                break;
            case 's':
            case 'S':
                result = squareRoot(num1);
                System.out.println("sqrt(" + num1 + ") = " + result);
                break;
            default:
                System.out.println("Error: Invalid operator");
                break;
        }

        scanner.close();
    }
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }
}

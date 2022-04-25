import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static String calc(String input) throws Exception {
        String[] splittedInput = prepareString(input);
        String a = splittedInput[0];
        String b = splittedInput[2];
        String mathOperator = splittedInput[1];
        checkMathOperator(splittedInput[1]);
        if (checkArabian(a) && checkArabian(b)) {
            return calcArabian(a, b, mathOperator) + "";
        }
        if (checkRome(a) && checkRome(b)) {
            return calcRome(a, b, mathOperator);
        }
        throw new Exception("в выражении должны использоваться только римские или только арабские цыфры от 1 до 10");
    }

    private static int calcArabian(String a, String b, String mathOperator) throws Exception {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        if (intA < 1 || intA > 10 || intB < 1 || intB > 10) {
            throw new Exception("числа выходят за границы диапазона (1 - 10)");
        }
        switch (mathOperator) {
            case "+": {
                return (intA + intB);
            }
            case "-": {
                return (intA - intB);
            }
            case "*": {
                return (intA * intB);
            }
            case "/": {
                return (intA / intB);
            }
            default:
                throw new Exception("неподдерживаемый математический оператор");
        }
    }

    private static String calcRome(String a, String b, String mathOperator) throws Exception {
        int result = calcArabian(Rome.romeToArabian(a) + "", Rome.romeToArabian(b) + "", mathOperator);
        if (result < 1) {
            throw new Exception("результат  при использовании римских чисел не может быть меньше 1");
        }
        return Rome.arabianToRome(result);
    }

    private static String[] prepareString(String input) throws Exception {
        String[] out = input.toUpperCase().split(" ");
        if (out.length != 3) {
            throw new Exception("Строка неверного формата!");
        }
        return out;
    }

    private static boolean checkArabian(String a) {
        int parsedA;
        try {
            parsedA = Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean checkRome(String a) throws Exception {
        return Rome.isRome(a) && Rome.romeToArabian(a) <= 10;
    }

    private static String checkMathOperator(String operator) throws Exception {
        switch (operator) {
            case "+":
            case "/":
            case "-":
            case "*":
                return operator;
            default:
                throw new Exception("неподдерживаемый математический оператор: " + operator);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(calc(console.readLine()));
    }
}

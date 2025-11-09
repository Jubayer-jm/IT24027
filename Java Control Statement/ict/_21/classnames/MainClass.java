package ict._21.classnames;

public class MainClass {

    public static void main(String[] args) {

        // Using static methods directly — no need to create objects
        CustomPrintClass.pr("=== SumClass Test ===");
        CustomPrintClass.pr("Sum = " + SumClass.getSum());

        CustomPrintClass.pr("\n=== DivisorMultipleClass Test ===");
        int a = 12, b = 18;
        CustomPrintClass.pr("GCD(" + a + "," + b + ") = " + DivisorMultipleClass.gcd(a, b));
        CustomPrintClass.pr("LCM(" + a + "," + b + ") = " + DivisorMultipleClass.lcm(a, b));

        CustomPrintClass.pr("\n=== NumberConversionClass Test ===");
        int num = 25;
        CustomPrintClass.pr("Binary of 25 = " + NumberConversionClass.decimalToBinary(num));
        CustomPrintClass.pr("Hex of 25 = " + NumberConversionClass.decimalToHex(num));
        CustomPrintClass.pr("Octal of 25 = " + NumberConversionClass.decimalToOctal(num));
        CustomPrintClass.pr("Binary 11001 to Decimal = " + NumberConversionClass.binaryToDecimal("11001"));

        CustomPrintClass.pr("\n=== CustomPrintClass Test ===");
        CustomPrintClass.pr("Hello from CustomPrintClass!");
    }
}

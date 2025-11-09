package ict._21.classnames;

public class SumClass {
    public static double getSum() {
        double sum = 0.0;
        double term = 1.0;
        do {
            sum += term;
            term -= 0.1;
        } while (term >= 0.1 - 1e-9); // handle floating error
        return sum;
    }
}

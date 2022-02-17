package base.packages;

public class factorial {
    double f = 1;

    public double fact(double n) {
        for (double i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}

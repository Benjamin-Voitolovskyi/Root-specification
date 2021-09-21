public class AlgEquation implements Function{ //алгебраїчне рівняння
    private int n; //степінь многочлена
    private double[] a; //масив коефіцієнтів

    public AlgEquation(int n, double[] a) {
        this.n = n;
        this.a = a;
    }

    @Override
    public double getValue(double x) {
        double result = 0;
        for(int i=0; i<=n; ++i){
            result+=a[i]*Math.pow(x, i);
        }
        return result;
    }
}

public class TransEquation implements Function{ //трансцендентне рівняння
    @Override
    public double getValue(double x) {
        return Math.pow(x-1.0,1.0/3.0)-Math.exp(-x);
    }
}

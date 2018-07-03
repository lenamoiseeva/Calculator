package CalculatorFields;

public abstract class CalculatorFields {
    private double fn;
    private double sn;

    public CalculatorFields(){}

    public double getFn() {
        return fn;
    }
    public void setFn(double fn) {
        this.fn = fn;
    }
    public double getSn() {
        return sn;
    }
    public void setSn(double sn) {
        this.sn = sn;
    }
}
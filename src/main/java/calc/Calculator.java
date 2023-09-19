package calc;

public class Calculator {
    public double defaultvalue;

    /*Access modifier
    return data type
    variable name
    () parameter
    {}
 */
    public Calculator(Double defaultvalue){
        this.defaultvalue=defaultvalue;

    }
    public double add(double valueToadd){
        return this.defaultvalue + valueToadd;
    }

    public double multiply(double valueToMultiply){
        return this.defaultvalue * valueToMultiply;
    }

    public double divide(double valueToDivide){
        return this.defaultvalue /  valueToDivide;
    }
    public double exponent(double exponent) {
        return Math.pow(this.defaultvalue, exponent);
    }
    public double squareRoot() {
        if (this.defaultvalue < 0) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(this.defaultvalue);
    }


}

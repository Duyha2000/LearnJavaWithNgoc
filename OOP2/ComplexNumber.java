package OOP2;

public class ComplexNumber {
    private int real;
    private int field;

    public void sum(ComplexNumber complexNumber) {
        this.real = this.real + complexNumber.real;
        this.field = this.field + complexNumber.field;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    ComplexNumber(int real, int field) {
        this.real = real;
        this.field = field;
    }

    public String toString() {
        return "number : " + this.real + this.field + "i";
    }
}

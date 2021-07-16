package calculator;

public class Standard {
    private float num1;
    private float num2;

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public Standard(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float opAdd() {
        float result = num1 + num2;
        return result;
    }

    public float opSub() {
        float result = num1 - num2;
        return result;
    }
}

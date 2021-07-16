package calculator;

public class Wissen extends Standard {
    public Wissen(float num1, float num2) {
        super(num1, num2);
    }

    public float opwWurzel() {
        float obergrenze = Float.MAX_VALUE;
        float untergrenze = 0;
        for( int i = 0; i < 1_000_000; i++) {
            float mitte = (obergrenze + untergrenze) / 2;
            if(mitte * mitte == getNum1()) {
                return mitte;
            } else if(mitte * mitte > getNum1()) {
                obergrenze = mitte;
            } else {
                untergrenze = mitte;
            }
        }
        return (obergrenze + untergrenze) / 2;
    }
}

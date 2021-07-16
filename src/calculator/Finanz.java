package calculator;

public class Finanz extends Standard {

    private float kapital;
    private float zins;
    private float tage;

    public float getKapital() {
        return kapital;
    }

    public void setKapital(float kapital) {
        this.kapital = kapital;
    }

    public float getZins() {
        return zins;
    }

    public void setZins(float zins) {
        this.zins = zins;
    }

    public float getTage() {
        return tage;
    }

    public void setTage(float tage) {
        this.tage = tage;
    }

    public Finanz(float num1, float num2, float kapital, float zins, float tage) {
        super(num1, num2);
        this.kapital = kapital;
        this.zins = zins;
        this.tage = tage;
    }

    public float opZins() {
        float result = (kapital*zins*tage) / (100*360);
        return result;
    }
}

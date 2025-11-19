public class ComplexNumber {
    private float a;
    private float b;

    /** 
    * @param _a the real part
    * @param _b the imaginary part
    */
    
    public ComplexNumber(float _a, float _b) {
        this.a = _a;
        this.b = _b;
    }
  
    /**
    * @return the real part (a)
    */
    public float getA() {
        return a;
    }
    
    /**
    * @return the imaginary part (b)
    */
    public float getB() {
        return b;
    }

    /**
    * @param otherNumber another ComplexNumber
    * @return a new ComplexNumber representing the product
    */
    public ComplexNumber add(ComplexNumber otherNumber) {
        float newA = a + otherNumber.getA();
        float newB = b + otherNumber.getB();
        return new ComplexNumber(newA, newB);
    }

    /**
    * @param otherNumber another ComplexNumber
    * @return a new ComplexNumber representing the difference
    */
    
    public ComplexNumber subtract(ComplexNumber otherNumber) {
        float newA = a - otherNumber.getA();
        float newB = b - otherNumber.getB();
        return new ComplexNumber(newA, newB);
    }

    /**
    * @param otherNumber another ComplexNumber
    * @return a new ComplexNumber representing the product
    */

    public ComplexNumber multiply(ComplexNumber otherNumber) {
        float newA = a * otherNumber.getA() - b * otherNumber.getB();
        float newB = b * otherNumber.getA() + a * otherNumber.getB();
        return new ComplexNumber(newA, newB);
    }
    
    /**
    * @param otherNumber the other ComplexNumber
    * @return quotient as a new ComplexNumber
    */

   public ComplexNumber divide(ComplexNumber otherNumber) {
        float c = otherNumber.getA();
        float d = otherNumber.getB();
        float denominator = c * c + d * d;
        float newA = (a * c + b * d) / denominator;
        float newB = (b * c - a * d) / denominator;
        return new ComplexNumber(newA, newB);
    }

    /**
    * @param obj the object to compare
    * @return true if both are ComplexNumbers with equal parts
    */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ComplexNumber other = (ComplexNumber) obj;
        return Float.compare(a, other.a) == 0 && Float.compare(b, other.b) == 0;
    }

    /**
    * @return the ComplexNumber as a string in "a + bi" or "a - bi"
    */

    @Override
    public String toString() {
        if (b >= 0)
        return a + " + " + b + "i";
        else 
        return a + " - " + Math.abs(b) + "i";
    }
}
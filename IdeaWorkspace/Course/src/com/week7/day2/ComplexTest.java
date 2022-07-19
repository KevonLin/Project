package com.week7.day2;

class Complex {
    private int realPart;
    private int imaginPart;

    public Complex() {
        this.realPart = 0;
        this.imaginPart = 0;
    }

    public int getRealPart() {
        return realPart;
    }

    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }

    public int getImaginPart() {
        return imaginPart;
    }

    public void setImaginPart(int imaginPart) {
        this.imaginPart = imaginPart;
    }

    public Complex(int realPart, int imaginPart) {
        this.realPart = realPart;
        this.imaginPart = imaginPart;
    }

    public Complex ComplexAdd(Complex a) {
        a.setRealPart(this.realPart + a.getRealPart());
        a.setImaginPart(this.imaginPart + a.getImaginPart());
        return a;
    }

    @Override
    public String toString() {
        System.out.println("toString方法被调用");
        System.out.println("realPart=" + realPart);
        System.out.println("imaginPart=" + imaginPart);
        return "Complex2{" +
                "realPart=" + realPart +
                ", imaginPart=" + imaginPart +
                ", num=" + realPart + '+' + imaginPart + 'i' +
                '}';
    }
}

/**
 * @author Lin
 */
public class ComplexTest {
    public static void main(String[] args) {
        String str1, str2, str3;
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        str1 = c1.toString();
        str2 = c2.toString();
        c1.ComplexAdd(c2);
        str3 = c2.toString();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}

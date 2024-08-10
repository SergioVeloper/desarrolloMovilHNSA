package com.example.holamundo;

public class Complejos {
    private Double a;
    private Double b;
    private Double c;
    private Double d;

    public Complejos(Double a, Double b, Double c, Double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public String suma() {
        Double real = this.a + this.c;
        Double imag = this.b + this.d;
        String resultado;
        if (imag >= 0) {
            resultado = real + "+" + imag + "i";
        } else {
            resultado = real + "" + imag + "i";
        }
        return resultado;
    }

    public String resta() {
        Double real = this.a - this.c;
        Double imag = this.b - this.d;
        String resultado;
        if (imag >= 0) {
            resultado = real + "+" + imag + "i";
        } else {
            resultado = real + "" + imag + "i";
        }
        return resultado;
    }

    public String multiplicar() {
        Double real = this.a * this.c - this.b * this.d;
        Double imag = this.a * this.d + this.c * this.b;
        String resultado;
        if (imag >= 0) {
            resultado = real + "+" + imag + "i";
        } else {
            resultado = real + "" + imag + "i";
        }
        return resultado;
    }

    public String dividir() {
        Double aux = this.c * this.c + this.d * this.d;
        Double real = (this.a * this.c + this.b * this.d) / aux;
        Double imag = (this.b * this.c - this.a * this.d) / aux;
        String resultado;
        if (imag >= 0) {
            resultado = real + "+" + imag + "i";
        } else {
            resultado = real + "" + imag + "i";
        }
        return resultado;
    }


}

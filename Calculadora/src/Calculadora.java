/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Flaviana Andrade
 */

public class Calculadora {
    private double numero1;
    private double numero2;
    private double resultado;

    // Construtores
    public Calculadora() {
    }

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    
    // Métodos
    public void somar(double numero1, double numero2) {
        this.resultado = numero1 + numero2;
    }

    public void dividir() {
        if (numero2 != 0) {
            this.resultado = numero1 / numero2;
        } 
    }

    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public void subtrair() {
        this.resultado = numero1 - numero2;
    }

    
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.numero1) ^ (Double.doubleToLongBits(this.numero1) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.numero2) ^ (Double.doubleToLongBits(this.numero2) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.resultado) ^ (Double.doubleToLongBits(this.resultado) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Calculadora other = (Calculadora) obj;
        if (Double.doubleToLongBits(this.numero1) != Double.doubleToLongBits(other.numero1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numero2) != Double.doubleToLongBits(other.numero2)) {
            return false;
        }
        return Double.doubleToLongBits(this.resultado) == Double.doubleToLongBits(other.resultado);
    }

    @Override
    public String toString() {
        return "Calculadora{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", resultado=" + resultado + '}';
    }

    
}

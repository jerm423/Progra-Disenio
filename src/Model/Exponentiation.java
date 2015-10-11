/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author macbookpro
 */
public class Exponentiation {
    double base, exponent;
    
    
    public Exponentiation(double pBase, double pExponent){
        base = pBase;
        exponent = pExponent;
    }
    
    public double calculateExponent(){
        return Math.pow(base, exponent);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getExponent() {
        return exponent;
    }

    public void setExponent(double exponent) {
        this.exponent = exponent;
    }
    
    
    
    
}

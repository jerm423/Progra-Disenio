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
public class SquareRadication {
    
    double number;
    
    public SquareRadication(double pNumber){
        number = pNumber;
    }
    
    public double calculateSquareRoot(){
        return Math.sqrt(number);
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
    
    
    
}

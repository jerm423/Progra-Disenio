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
public class Substraction {
    
    double substractionParam1, substractionParam2;

    public Substraction(double pParam1, double pParam2) {
        substractionParam1 = pParam1;
        substractionParam2 = pParam2;
    }
    
    public double calculateSubstraction(){
        return substractionParam1 - substractionParam2;
    }

    public double getAddingParam1() {
        return substractionParam1;
    }

    public void setAddingParam1(double substractionParam1) {
        this.substractionParam1 = substractionParam1;
    }

    public double getAddingParam2() {
        return substractionParam2;
    }

    public void setAddingParam2(double substractionParam2) {
        this.substractionParam2 = substractionParam2;
    }
}

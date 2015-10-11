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
public class Multiplication {
    double multiplicationParam1, multiplicationParam2;

    public Multiplication(double pParam1, double pParam2) {
        multiplicationParam1 = pParam1;
        multiplicationParam2 = pParam2;
    }
    
    public double calculateDivision(){
        return multiplicationParam1 / multiplicationParam2;
    }

    public double getDivisionParam1() {
        return multiplicationParam1;
    }

    public void setDivisionParam1(double multiplicationParam1) {
        this.multiplicationParam1 = multiplicationParam1;
    }

    public double getDivisionParam2() {
        return multiplicationParam2;
    }

    public void setDivisionParam2(double multiplicationParam2) {
        this.multiplicationParam2 = multiplicationParam2;
    }
}

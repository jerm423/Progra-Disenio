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
public class Division {
    double divisionParam1, divisionParam2;

    public Division(double pParam1, double pParam2) {
        divisionParam1 = pParam1;
        divisionParam2 = pParam2;
    }
    
    public double calculateDivision(){
        return divisionParam1 / divisionParam2;
    }

    public double getDivisionParam1() {
        return divisionParam1;
    }

    public void setDivisionParam1(double divisionParam1) {
        this.divisionParam1 = divisionParam1;
    }

    public double getDivisionParam2() {
        return divisionParam2;
    }

    public void setDivisionParam2(double divisionParam2) {
        this.divisionParam2 = divisionParam2;
    }
}

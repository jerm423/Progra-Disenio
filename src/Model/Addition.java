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
public class Addition {
    
    double addingParam1, addingParam2;

    public Addition(double pParam1, double pParam2) {
        addingParam1 = pParam1;
        addingParam2 = pParam2;
    }
    
    public double calculateAddition(){
        return addingParam1 + addingParam2;
    }

    public double getAddingParam1() {
        return addingParam1;
    }

    public void setAddingParam1(double addingParam1) {
        this.addingParam1 = addingParam1;
    }

    public double getAddingParam2() {
        return addingParam2;
    }

    public void setAddingParam2(double addingParam2) {
        this.addingParam2 = addingParam2;
    }
    
    
    
    
}

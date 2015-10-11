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
public class OctalConversion {
    
    int number;
    
    public OctalConversion(int pNumber){
        number = pNumber;
    }
    
    public String convertToOctal(){
        return Integer.toOctalString(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}

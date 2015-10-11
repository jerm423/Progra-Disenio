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
public class HexadecimalConversion {
    
    int number;
    
    public HexadecimalConversion(int pNumber){
        number = pNumber;
    }
    
    public String convertToHexadecimal(){
        return Integer.toHexString(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}

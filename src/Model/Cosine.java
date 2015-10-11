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
public class Cosine {
    /* This is the value of the angle in degrees */
    double angle;
    
    public Cosine(double pAngle){
        angle = pAngle;
    }
    
    public double calculateCosine(){
        double angleInDegrees = Math.toRadians(angle);
        return Math.cos(angleInDegrees);
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
    
    
    
}

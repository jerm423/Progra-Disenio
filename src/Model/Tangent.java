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
public class Tangent {
    
    double angle;
    
    public Tangent(double pAngle){
        angle = pAngle;
    }
    
    public double calculateTangent(){
        double angleInDegrees = Math.toRadians(angle);
        return Math.tan(angleInDegrees);
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
    
}

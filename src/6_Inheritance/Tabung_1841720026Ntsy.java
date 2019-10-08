/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;

/**
 *
 * @author Natasya Mutyara
 */
public class Tabung_1841720026Ntsy extends Bangun_1841720026Ntsy{
    protected int t;
    public void setSuperPhi(double phi){
        super.phi = phi;
    }
    
    public void setSuperR(int r){
        super.r = r;
    }
    
    public void setT(int t){
        this.t = t;
    }
    
    public void volume(){
        System.out.println("Volume Tabung adalah : "+(super.phi*super.r*super.r*this.t));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrilaterop;

/**
 *
 * @author fatii
 */
public class TrapecioP extends CuadrilateroP {
    private double AreaT;
    private double x3,y3;
    private double H;
    
    public TrapecioP(int x, int y) {
        super(x, y);
    AreaT= (x3+y3)*H/2;
        System.out.println("El area del cuadrado es:" + AreaT);
    }

    @Override
    public void setY(int y) {
        super.setY(y); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int getY() {
        return super.getY(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setX(int x) {
        super.setX(x); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getX() {
        return super.getX(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Area() {
        super.Area(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAreaT(int AreaT) {
        this.AreaT = AreaT;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }
    
}

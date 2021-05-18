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
public class RectanguloP extends CuadrilateroP {
    private double AreaR;
    private double x2,y2;
    public RectanguloP(int x, int y) {
        super(x, y);
    AreaR= (x2*y2);
        System.out.println("El area del cuadrado es:" + AreaR);
    }
    @Override
    public void setY(int y) {
        super.setY(y); 
    }
    @Override
    public int getY() {
        return super.getY(); 
    }
    @Override
    public void setX(int x) {
        super.setX(x); 
    }
    @Override
    public int getX() {
        return super.getX(); 
    }
    @Override
    public void Area() {
        super.Area(); 
    }
    public double getAreaR() {
        return AreaR;
    }
    public void setAreaR(int AreaR) {
        this.AreaR = AreaR;
    }
    
}

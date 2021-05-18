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
public class CuadradoP extends CuadrilateroP {
    private double AreaC;
    private double x,y;
    public CuadradoP(int x, int y) {
        super(x, y);
        
        AreaC= (x*y);
        System.out.println("El area del cuadrado es:" + AreaC);
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
    
}

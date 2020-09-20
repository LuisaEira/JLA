/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLA;

/**
 *
 * @author lucaa
 */
public class Result {
    private String rx;
    private String ro;
    public Result(String r_x,String r_o){
        rx=r_x;
        ro=r_o;
    }
    public String isRx(){
        return rx;
    }
    public String isRo(){
        return ro;
    }
    public void setRx(){
        int dres_x = Integer.parseInt(rx);
        rx=(String.valueOf(dres_x+1));
    }
    public void setRo(){
        int dres_o = Integer.parseInt(ro);
        ro=(String.valueOf(dres_o+1));
    }
}

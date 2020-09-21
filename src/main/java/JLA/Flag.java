/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JLA;

/**
 *
 * @author luisa
 */
public class Flag {
    private boolean f;
    public Flag(){
        f = false;
    }
    public void Up(){
        f = true;
    }
    public void Down(){
        f = false;
    }
    public boolean isUp(){
        return f;
    }
    public boolean isDown(){
        return !f;
    }
}

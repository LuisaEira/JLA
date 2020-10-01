package JLA;

/*

    The flag is used in the second phase of the game. 
    When the flag is down that means the player has to select the piece he 
    wants to move. When the flag is up that means the player has to select 
    where to move it to.

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

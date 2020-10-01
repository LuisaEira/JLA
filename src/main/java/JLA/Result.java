package JLA;

//Class laquelle change les jlabels ou sont �cris les resultats sur le panneau de l'application
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
    public void setR(int n){
        if (n == 1)
            setRx();
        else
            setRo();
    }
    public void setRx(){
        int dres_x = Integer.parseInt(rx);
        rx=(String.valueOf(dres_x+1));
    }
    public void setRo(){
        int dres_o = Integer.parseInt(ro);
        ro=(String.valueOf(dres_o+1));
    }
    public void resetRx(){
        rx="0";
    }
    public void resetRo(){
        ro="0";
    }
}

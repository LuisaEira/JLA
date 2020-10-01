package JLA;

// Class laquelle ne permet pas de possitionner jettons ne les d�placer une fois qu'un des deux joueurs a gagn�
public class Band {
    private int band;
    public Band(){
        band=0;
    }
    public int isBand(){
        return band;
    }
    public void setBand(){
        band=1;
    }
    public void resetBand(){
        band=0;
    }
}

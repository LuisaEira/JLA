/*

    This class sets a matrix with a variable for each case in the board.
    If the variable is 0 (Set with Pos0()) the board space is empty.
    If the variable is 1, the board space is ocupied with a X.
    If the variable is 2, the board space is ocupied with a O.
    If the variable is 3, the board space has just been emptied up because
    one of the players is moving ther piece. After this move is done the 
    function clear() must be called to reset the variable back to 0.

 */
package JLA;
 
public class Position {
    private int b[][] = new int[3][3];
    private int ligne;
    private int colonne;
    private int lignedef;
    private int colonnedef;
    public Position(){
        b[0][0]=0;
        b[0][1]=0;
        b[0][2]=0;
        b[1][0]=0;
        b[1][1]=0;
        b[1][2]=0;
        b[2][0]=0;
        b[2][1]=0;
        b[2][2]=0;
    }
    public int quelPos(int row,int col){
        return b[row][col];
    }
    public void Pos(int row, int col, int joueur){
        b[row][col]=joueur;
    }
    public void Pos1(int row,int col){
        b[row][col]=1;
    }
    public void Pos2(int row,int col){
        b[row][col]=2;
    }
    public void Pos3(int row,int col){
        b[row][col]=3;
    }
    public void Pos0(int row,int col){
        b[row][col]=0;
    }
    public void setLigne(int lig){
        ligne=lig;
    }
    public void setColonne(int colo){
        colonne=colo;
    }
    public void setLignedef(int lig){
        lignedef=lig;
    }
    public void setColonnedef(int colo){
        colonnedef=colo;
    }
    public void resetColonne(){
        ligne=100;
        colonne=100;
    }
    public int quelLigne(){
        return ligne;
    }
    public int quelCol(){
        return colonne;
    }
    public int quelLignedef(){
        return lignedef;
    }
    public int quelColdef(){
        return colonnedef;
    }
    public void resPos(){
        b[0][0]=0;
        b[0][1]=0;
        b[0][2]=0;
        b[1][0]=0;
        b[1][1]=0;
        b[1][2]=0;
        b[2][0]=0;
        b[2][1]=0;
        b[2][2]=0;
    }
    public void clear(){
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                if (b[i][j] == 3)
                    b[i][j] = 0;
            }
        }
    }
}

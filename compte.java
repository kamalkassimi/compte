package comptebancka;

public abstract class compte{
    private int code;
    protected double solde;
    private static int nbrComptes;

    public compte(double solde){
        this.code = nbrComptes +=1;
        this.solde = solde;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String toString(){

        return "Votre Code est : "+code+" Votre Solde est : "+solde;
    }
}
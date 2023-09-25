package comptebancka;

class CompteEpargne extends compte{
    private double taux;
    public CompteEpargne(double taux , double solde) {
        super(solde);
        this.taux=taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public void calculinterets(int year){
        if(year>=1){
            for (int i=0 ; i<year;i++){
                solde+=(solde*taux/100);
            }
        }
        else{
            System.out.println("you need at least one year of saving");
        }
    }
    public String toString(){
        return super.toString();
    }
}
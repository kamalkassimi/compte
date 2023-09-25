package comptebancka;

public class CompteSimple extends  compte{
        private double decouvert;

        public CompteSimple(double decouvert, double solde){
            super(solde);
            this.decouvert=decouvert;
        }
        public void retirer(double mt){
            if(solde+decouvert>mt){
                solde-=mt;
            }else{
                System.out.println("erreur");
            }
        }
        public String toString() {
            return super.toString();
        }
}


package comptebancka;

class ComptePayant extends compte{
        protected double decouvert;
        public ComptePayant(double solde,double decouvert){

            super(solde);
            this.decouvert=decouvert;

        }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {

            this.decouvert = decouvert;
    }

    public void retirer(double mt) throws Exception{
            if(mt < 0)throw new Exception("solde is nom disposable");{
                       if(this.solde < mt) throw  new Exception(" the credit is not enough ,tried time  "); {
                           this.solde -= mt ;
                       }
        }

        }
        public void verser(double mt) throws  Exception{
            if (mt<0) throw  new Exception("svp enter sold positive ");{
                this.solde+=mt;
            }
        }
        public String toString() {
            return super.toString();
        }
    }


package comptebancka;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;


public class programmetest {
    public static void main(String[] args) {
                   Scanner f= new Scanner(System.in);
//                CompteEpargne c1 = new CompteEpargne(5, 1500);
//                c1.calculinterets(3);
//                System.out.println(c1.toString());
           try {
               System.out.println("enter solde :");
               float solde = f.nextFloat();
               System.out.println("Enter decouvert :");
               float decouvert = f.nextFloat();
               ComptePayant  obj= new ComptePayant(solde,decouvert);
               ComptePayant  obj1= new ComptePayant(solde,decouvert);
               obj.retirer(15700);
               obj1.verser(170);
               System.out.println(obj);
               System.out.println(obj1);
           }catch (Exception e){
             System.out.println(e.getMessage());
           }
           finally {
               System.out.println("fin programme thank ");
           }
            }
        }


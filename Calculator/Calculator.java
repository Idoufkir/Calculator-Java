package Calculator;

import java.util.Scanner;

public class Calculator {
     public static void main(String[] args) {
            double num1 = 0;
            double num2 = 0;
            char opr;
            double res = 0.0;
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Entrer Le Premier Nombre");
            num1 = scanner.nextDouble();
            System.out.println("Entrer Le Deuxieme Nombre");
            num2 = scanner.nextDouble();
            System.out.println("Choisir Opération");
            opr = scanner.next().charAt(0);
            
            switch (opr) {
                case '+' : res = num1 + num2;
                    break;
                case '-' : res = num1 - num2;
                    break;
                case '/' :
                    if(num2 == 0) {
                    	
                    	System.out.println("Erruer du diviseur, éviter de division sur 0");
                        
                    } else {
                    	res = num1 / num2;
                    }
                    break;
                case '*' : res = num1 * num2;
                    break;
            }
            
            System.out.println(num1+" "+opr+" "+num2+" = "+res);
    }
}

package hellowolrd;

import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite sua nota:");
        double n1 = valor.nextDouble();
        System.out.println("Digite sua segunda nota");
        double n2 = valor.nextDouble();
        System.out.println("Digite sua terceira nota");
        double n3 = valor.nextDouble();
        System.out.println("Digite sua quarta nota");
        double n4 = valor.nextDouble();
        double media = (n1+n2+n3+n4) / 4;
        System.out.println("Sua média é" + media);
        
        if(media >= 7){
            System.out.println("Parabéns voce foi aprovado");
        }
        
        else if( media <= 4 && media < 6){
            System.out.println("Precisa estudar mais!!!!");
        
        }
        else{
            System.out.println("Voce foi reprovado");
        }
      
    }
}

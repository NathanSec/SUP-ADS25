package aula3.beetb;

import java.util.Scanner;

public class Average3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double N1, N2, N3, N4, average;

        N1 = sc.nextDouble();
        N2 = sc.nextDouble();
        N3 = sc.nextDouble();
        N4 = sc.nextDouble();
        
        average = ((N1 * 2)+(N2* 3)+(N3*4)+(N4*1))/10;
        System.out.printf("Media: %.1f\n",Math.floor(average*10)/10);
        
        if(average >= 7.0){
            System.out.println("Aluno aprovado.");
        }
        else if(average < 5){
            System.out.println("Aluno reprovado.");
        } else{
            double newExam, finalAverage;
            System.out.println("Aluno em exame.");
            newExam = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n",newExam);
            finalAverage = (newExam+average)/2;
            if(finalAverage >=5 ){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n",finalAverage);
            }else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n",finalAverage);
            }
            
        }
        
        
    }
}

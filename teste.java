import java.util.Scanner;
public class teste {
    public static void main(String [] args){
        Scanner teclado= new Scanner(System.in);
        int cont=0;
        int sum=0;
        int menor = Integer.MAX_VALUE; //maior valor possíver
        int maior = Integer.MIN_VALUE;
        System.out.println("diga um numero (-1 para) :");
        int n=teclado.nextInt();
        while (n!=-1) {
            sum=sum+n;
            cont=cont+1;
            if(n>maior){
                maior=n;
            }
            if(n<menor){
                menor=n;
            }
            System.out.println("diga um numero (-1 para) :");
            n=teclado.nextInt();
        }
        double media=(double)sum/cont;
        System.out.println("Soma: " + sum);
        System.out.println("Média: " + media);
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
    }
}

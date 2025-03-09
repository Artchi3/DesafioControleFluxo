import java.util.Locale;
import java.util.Scanner; 

public class Contador {
    public static void main(String[] args){

        Scanner scann = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("DIGITE O PARAMETRO-A");
        int paramA = scann.nextInt();

        System.out.println("DIGITE O PARAMETRO-B");
        int paramB = scann.nextInt();

        try {
			//chamando o método contendo a lógica de contagem
			contar(paramA, paramB);
		
		}catch (ParametrosInvalidosException  e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		} 
        scann.close();
    }
    static void contar(int paramA, int paramB) throws ParametrosInvalidosException{
        if (paramA >= paramB) throw new ParametrosInvalidosException(); 
        
        int contagem = paramB-paramA + 1;

        for (int i = 1; i < contagem; i++) {
            System.out.println("Imprimindo o número " + i );
        }

    }
}

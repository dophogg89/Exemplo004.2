/*
 * Para alterar este cabeçalho de licença, escolha Cabeçalhos de licença em Propriedades do projeto.
 * Para alterar este arquivo de modelo, escolha Ferramentas | Modelos
 * e abra o modelo no editor.
 */
package exemplo004.pkg2;

import java.util.Scanner;

/**
 *
 * @author Rodolpho
 */
public class Exemplo0042 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s1 =new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO:");
        int x = s1.nextInt();
        if(x%2==0)
          System.out.println("O NÚMERO É PAR");
        else
          System.out.println("O NÚMERO É ÍMPAR");
    }
    
}

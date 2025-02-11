/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    int opcao;
	    
		System.out.printf("\tMENU \n");
		System.out.println("[1] ADIÇÃO");
		System.out.println("[2] SUBTRAÇÃO");
		System.out.println("[3] MULTI");
		System.out.println("[4] DIVISÃO");		
		System.out.println("[0] SAIR");
		System.out.println("\nEscolha uma opção");
		
		opcao = scan.nextInt();
		System.out.printf("A opção escolhida foi: %d \n", opcao);
		
		scan.close();
		
		if (opcao >= 0 && opcao < 5){
		    if (opcao == 0){
		        System.out.println("[1] ADIÇÃO");
		    }
		}else {
		    System.out.println("Resposta invalida");
		}




	}
}

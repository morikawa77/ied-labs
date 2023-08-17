// importação de class para leitura de dados do teclado
import java.util.Scanner;

// classe que contém o PROGRAMA PRINCIPAL ('main')
public class Lab_01_FundamentosJava_DEPOIS_AULA {

    // PROGRAMA PRINCIPAL
	// ------------------
	public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        // criação de um objeto 'Scanner' para a interação com o teclado
        Scanner teclado = new Scanner(System.in);
        
        // declaração de variáveis a serem usadas (independentemente da Atividade)
        int escolha;

        // menu de escolha da Atividade a ser executada
        do {
            // apresentação das opções de escolha
            System.out.println("\n\n");
            System.out.println("Escoha uma das opções abaixo:");
            System.out.println("1 - Atividade 1 - for           -> números pares");
            System.out.println("2 - Atividade 2 - for           -> caracteres do alfabeto");
            System.out.println("3 - Atividade 3 - while         -> múltiplos de 3");
            System.out.println("4 - Atividade 4 - cálculo       -> horas, minutos e segundos para segundos");
            System.out.println("5 - Atividade 5 - transformação -> segundos para horas e minutos");
            System.out.println("9 - Sair");
            
            System.out.print("\nDigite aqui a sua opção: ");
            // coleta da opção digitada
            escolha = teclado.nextInt();
		
		    // avaliação da opção e acionamento da respectiva Atividade
		    switch ( escolha ) {
			
			    case 1: System.out.println("Atividade 1: for -> números pares !\n");
					    // declaração de variáveis para esta Atividade
					    int n1, n2;
					    // obtenção dos valores via teclado
				        System.out.println("Informe o menor valor (n1): ");
					    n1 = teclado.nextInt();
				        System.out.println("Informe o maior valor (n2): ");
					    n2 = teclado.nextInt();
					    // exibição dos números pares do intervalo
					    for ( int i = n1; i <= n2; i++ ) {
								if ( i % 2 == 0 ) {
									System.out.println(i);
								}
							}
			            break;
			    
 			    case 2: System.out.println("Atividade 2: for -> caracteres do alfabeto !\n");
 					    // exibição dos caracteres
			 	 	    // AQUI...
					    break;
				
			    case 3: System.out.println("Atividade 3: while -> múltiplos de 3 !\n");
					    // declaração de variável para esta Atividade
					    int valor_inicial;
					    // obtenção dos valor via teclado
				        System.out.println("Informe o valor de início da série: ");
					    valor_inicial = teclado.nextInt();
 					    // exibição dos múltiplos
					    for ( int i = valor_inicial; i <= 100; i++ ) {
								if ( i % 3 == 0 ) {
									System.out.println(i);
								}
							}
					    break;
				
			    case 4: System.out.println("Atividade 4: cálculo de qtd. segundos !\n");
					    // declaração de variáveis para esta Atividade
					    int horas, minutos, segundos;
					    // obtenção dos valores via teclado
				        System.out.print("Informe a quantidade de horas    (entre 0 e 23): ");
					    horas = teclado.nextInt();
				        System.out.print("Informe a quantidade de minutos  (entre 0 e 59): ");
					    minutos = teclado.nextInt();
				        System.out.print("Informe a quantidade de segundos (entre 0 e 59): ");
					    segundos = teclado.nextInt();
					    // cálculo e exibição do resultado
					    System.out.print("Quantidade equivalente em segundos: ");
                        //System.out.println(AQUI...);
				        break;	
				
			    case 5: System.out.println("Atividade 5: transformação para horas e minutos !\n");
					    // declaração de variável para esta Atividade
					    int qtdMinutos;
					    // obtenção do valor via teclado
				        System.out.print("Informe a quantidade total de minutos (entre 0 e 1439): ");
					    qtdMinutos = teclado.nextInt();
					    // transformação e exibição do resultado
                        // AQUI...
				        break;	
								
			    case 9: System.out.println("Sair ...\n");
				        break;
				
			    default: System.out.println("Opção inválida !  Tente novamente ...\n");
		    }
			
	    } while ( escolha != 9 );

        teclado.close();

		// identificação do autor do trabalho
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("ESTRUTURAS DE DADOS - 2023/2S");
		System.out.println("Lab.: FUNDAMENTOS DE JAVA");
		System.out.println("---------------------------------");
		System.out.println("Nome: REGINALDO MORIKAWA");
		System.out.println("R.A.: 121 092 231 1 022");
		System.out.println("---------------------------------");
		System.out.println();
	
    }

}

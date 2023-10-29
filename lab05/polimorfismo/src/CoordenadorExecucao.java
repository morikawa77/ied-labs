// ----------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : POLIMORFISMO e INTERFACES em JAVA
// Ano/S: 2023/2S
// ----------------------------------------
 
// classe principal (faz o papel efetivo de 'main',
// sendo instanciada pelo programa principal do projeto)
// -----------------------------------------------------

// importação do pacote que contém o código para uso do teclado
import java.util.Scanner;

// classe coordenadora da execução dos testes
public class CoordenadorExecucao {

    // método que realiza todos os testes
    public void executaTudo() {

        // criação de um objeto 'Scanner' para a interação com o teclado
        Scanner teclado = new Scanner(System.in);

        // declaração de constantes para uso no menu
        final int PROCESSAMENTO_INDIVIDUAL = 1;
        final int PROCESSAMENTO_POLIMORFICO = 2;
        final int EXIBICAO_NOME_CLASSE = 3;
        final int SAIR = 9;

        // cria objetos das subclasses
        DiaMesAno nascimentoAssalariado = new DiaMesAno( 8, 13, 1979 );
        EmpregadoAssalariado assalariado
                = new EmpregadoAssalariado(
                    "John", 
                    "Smith", 
                    "111-11-1111",
                    nascimentoAssalariado,
                    800.00);

        DiaMesAno nascimentoHorista = new DiaMesAno( 3, 33, 1991 );
        EmpregadoHorista horista
                = new EmpregadoHorista(
                    "Karen", 
                    "Price", 
                    "222-22-2222",
                    nascimentoHorista,
                    16.75, 
                    40);

        DiaMesAno nascimentoComissionado = new DiaMesAno( 13, 5, 1998 );
        EmpregadoComissionado comissionado
                = new EmpregadoComissionado(
                        "Sue",
                        "Jones", 
                        "333-33-3333",
                        nascimentoComissionado,
                        10000,
                        .06);

        DiaMesAno nascimentoComissionadoMaisFixo = new DiaMesAno( 10, 25, 2001 );
        EmpregadoComissionadoMaisFixo comissionadoMaisFixo
                = new EmpregadoComissionadoMaisFixo(
                        "Bob",
                        "Lewis",
                        "444-44-4444",
                        nascimentoComissionadoMaisFixo,
                        5000,
                        .04,
                        300);

        
        DiaMesAno nascimentoProducao = new DiaMesAno( 3, 10, 1995 );
        EmpregadoProducao producao
                = new EmpregadoProducao(
                        "Robert",
                        "Garcia",
                        "777-77-7777",
                        nascimentoProducao,
                        10,
                        250);

        // cria um array Employee de quatro elementos
        Empregado empregados[] = new Empregado[5];

        // inicializa o array com Employees          
        empregados[0] = assalariado;
        empregados[1] = horista;
        empregados[2] = comissionado;
        empregados[3] = comissionadoMaisFixo;
        empregados[4] = producao;

        // declaração de variáveis a serem usadas (independentemente da Atividade)
        int escolha;

        // menu de escolha da Atividade a ser executada
        do {
            // apresentação das opções de escolha
            System.out.println("\n");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Atividade 1: Processamento INDIVIDUAL  de vários tipos de objetos 'Empregado'");
            System.out.println("2 - Atividade 2: Processamento POLIMÓRFICO de vários tipos de objetos 'Empregado'");
            System.out.println("3 - Atividade 3: Exibição do nome da classe efetiva de cada objeto da classe 'Empregado'");
            System.out.println("9 - Sair");

            System.out.print("\nDigite aqui a sua opção: ");
            // coleta da opção digitada
            escolha = teclado.nextInt();
            teclado.nextLine();

            // avaliação da opção e acionamento da respectiva Atividade
            switch (escolha) {

                case PROCESSAMENTO_INDIVIDUAL:
                    System.out.println("\nAtividade 1: Processamento INDIVIDUAL  de vários tipos de objetos 'Empregado'");
                    System.out.println("-----------------------------------------------------------------------------");

                    System.out.println("Empregados processados individualmente:\n");

                    System.out.printf("%s\n%s: $%,.2f\n\n",
                            assalariado, "Vencimentos", assalariado.vencimentos());
                    System.out.printf("%s\n%s: $%,.2f\n\n",
                            horista, "Vencimentos", horista.vencimentos());
                    System.out.printf("%s\n%s: $%,.2f\n\n",
                            comissionado, "Vencimentos", comissionado.vencimentos());
                    System.out.printf("%s\n%s: $%,.2f\n\n",
                            comissionadoMaisFixo,
                            "Vencimentos", comissionadoMaisFixo.vencimentos());
                    System.out.printf("%s\n%s: $%,.2f\n\n",
                            producao,
                            "Vencimentos", producao.vencimentos());

                    break;

                case PROCESSAMENTO_POLIMORFICO:
                    System.out.println("\nAtividade 2: Processamento POLIMÓRFICO de vários tipos de objetos 'Empregado'");
                    System.out.println("-----------------------------------------------------------------------------");

                    System.out.println("Empregados processados polimorficamente::\n");

                    // processa genericamente cada elemento no empregados
                    for (Empregado empregadoAtual : empregados) {
                        System.out.println(empregadoAtual); // invoca toString

                        // determina se elemento é um 'EmpregadoComissionadoMaisFixo'
                        if (empregadoAtual instanceof EmpregadoComissionadoMaisFixo) {
                            // 'downcast' da referência de 'Empregado' para
                            // referência a 'EmpregadoComissionadoFixo'
                            EmpregadoComissionadoMaisFixo empregado
                                    = (EmpregadoComissionadoMaisFixo) empregadoAtual;

                            double salarioBaseAnterior = empregado.getSalarioBase();
                            empregado.setSalarioBase(1.10 * salarioBaseAnterior);
                            System.out.printf(
                                    "Novo salário base com 10%% de aumento é: $%,.2f\n",
                                    empregado.getSalarioBase());
                        } // fim do if

                        System.out.printf(
                                "Vencimentos $%,.2f\n\n", empregadoAtual.vencimentos());
                    } // for final

                    break;

                case EXIBICAO_NOME_CLASSE:
                    System.out.println("\nAtividade 3: Exibição do nome da classe efetiva de cada objeto da classe 'Empregado'");
                    System.out.println("--------------------------------------------------------------------------------------");

                    System.out.println("Nome da classe efetiva de cada Empregado no vetor 'empregados':");

                    // obtém o nome do tipo de cada objeto no array empregados
                    for (int j = 0; j < empregados.length; j++) {
                        System.out.printf("empregados[%d] é um %s\n", j,
                                empregados[j].getClass().getName());
                    }

                    break;

                case SAIR:
                    System.out.println("\nSair ...\n");
                    break;

                default:
                    System.out.println("\nOpção inválida !  Tente novamente ...\n");
            }

        } while (escolha != SAIR);

        teclado.close();

        // aciona método para exibição dos dados do autor do trabalho
        Autor autor = new Autor();
        autor.exibeDadosAutor(
                "ESTRUTURAS DE DADOS - 2023/2S",
                "POLIMORFISMO e INTERFACES em JAVA",
                "REGINALDO MORIKAWA",
                "121 092 231 1 022");

    }

    /* OUTRA FORMA DE FAZER
    // neste caso, no final de 'executaTudo', fazer
    // Autor.exibeDadosAutor("POLIMORFISMO", "CARLOS MAGNUS CARLSON FILHO", "121 092 AAS P NNN");

    // classe INTERNA ('inner class') para exibição dos dados do autor do trabalho
    static class Autor {

        public static void exibeDadosAutor(String nomeLab, String nomeAutor, String RAAutor) {

            // identificação do autor do trabalho
            System.out.println();
            System.out.println("---------------------------------");
            System.out.println("ESTRUTURAS DE DADOS - 2023/1S");
            System.out.println("Lab.: " + nomeLab);
            System.out.println("---------------------------------");
            System.out.println("Nome: " + nomeAutor);
            System.out.println("R.A.: " + RAAutor);
            System.out.println("---------------------------------");
            System.out.println();

        }
    }
*/
}


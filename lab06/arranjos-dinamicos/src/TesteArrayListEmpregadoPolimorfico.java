// ----------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRANJOS DINÂMICOS em JAVA
// Ano/S: 2023/2S
// ----------------------------------------
 
// classe para realização de testes com
// 'ArrayList' contendo objetos 'EmpregadoPolimorfico'
// ---------------------------------------------------

// importação para permitir o uso de 'ArrayList'
import java.util.ArrayList;
import java.util.Iterator;


public class TesteArrayListEmpregadoPolimorfico {
    
    // método da classe para realização do teste
    public void executaTeste() {
        
        // instanciação de um objeto da classe 'ArrayList'
        // para armazenar 'String' (inicialmente vazio)
        
        // armazenamento no 'ArrayList'
        // - 4 objetos da classe 'Empregado', um de cada tipo
        // - lembrar que cada 'Empregado...' tem uma 'dataNascimento'

        DiaMesAno dataNascimentoA = new DiaMesAno(2,24,1983);
        EmpregadoAssalariado assalariado
                = new EmpregadoAssalariado(
                    "John", 
                    "Smith", 
                    "111-11-1111", 
                    dataNascimentoA,
                    800.00);

        DiaMesAno dataNascimentoH = new DiaMesAno(4,10,1990);
        EmpregadoHorista horista
                = new EmpregadoHorista(
                    "Karen",
                    "Price",
                    "222-22-2222",
                    dataNascimentoH,
                    16.75,
                    40);

        DiaMesAno dataNascimentoC = new DiaMesAno(6,30,1999);
        EmpregadoComissionado comissionado
                = new EmpregadoComissionado(
                    "Sue",
                    "Jones",
                    "333-33-3333",
                    dataNascimentoC,
                    10000,
                    .06);

        DiaMesAno dataNascimentoF = new DiaMesAno(11,3,2002);
        EmpregadoComissionadoMaisFixo comissionadoMaisFixo
                = new EmpregadoComissionadoMaisFixo(
                    "Bob",
                    "Lewis",
                    "444-44-4444",
                    dataNascimentoF,
                    5000,
                    .04,
                    300);
        
        // instanciação de um objeto da classe 'ArrayList'
        // para armazenar 'Empregado' (inicialmente vazio)
        ArrayList<Empregado> empregados = new ArrayList<Empregado>();

        // armazena, no 'ArrayList', empregados dos tipos existentes (um para cada subclasse)
        empregados.add(assalariado);
        empregados.add(horista);
        empregados.add(comissionado);
        empregados.add(comissionadoMaisFixo);

        System.out.println("\nConteúdo do ArrayList de objetos de subclasses de 'Empregado' (usando ITERATOR):");
        Iterator< Empregado > iterador = empregados.iterator();
        while ( iterador.hasNext() ) {
            Empregado emp = iterador.next();
            System.out.printf("\n%s\nVencimentos: $%,.2f\n", emp, emp.vencimentos()); // POLIMORFISMO !!!
        }
        System.out.println();

        System.out.println("\nConteúdo do ArrayList de objetos de subclasses de 'Empregado' (usando FOR e GET(index)):");
        for ( int i = 0; i < empregados.size(); i++ ) {
            Empregado emp = empregados.get(i);
            System.out.printf("\n%s\nVencimentos: $%,.2f\n", emp, emp.vencimentos());  // POLIMORFISMO !!!
        }

        // a verificar a necessidade...
        /*
        // cria um array de 'Empregado' de quatro elementos
        Empregado empregados[] = new Empregado[4];

        // inicializa o array com empregados dos tipos existentes
        empregados[0] = assalariado;
        empregados[1] = horista;
        empregados[2] = comissionado;
        empregados[3] = comissionadoMaisFixo;
        */
        
        // exibição via métodos de 'Empregado...'
        /*
        System.out.printf("%s\n%s: $%,.2f\n\n",
            assalariado, "Vencimentos", assalariado.vencimentos());
        System.out.printf("%s\n%s: $%,.2f\n\n",
            horista, "Vencimentos", horista.vencimentos());
        System.out.printf("%s\n%s: $%,.2f\n\n",
            comissionado, "Vencimentos", comissionado.vencimentos());
        System.out.printf("%s\n%s: $%,.2f\n\n",
            comissionadoMaisFixo,
            "Vencimentos", comissionadoMaisFixo.vencimentos());
        
        */
        
        /*
        // processamento polimórfico
        System.out.println("Empregados processados polimorficamente::\n");

        // processa genericamente cada elemento no array 'empregados'
        for (Empregado empregadoAtual : empregados) {

            System.out.println(empregadoAtual); // invoca toString

            System.out.printf(
                  "Vencimentos $%,.2f\n\n", empregadoAtual.vencimentos());
         }
        */
        /*
        System.out.println("Nome da classe efetiva de cada Empregado:\n");

        // obtém o nome do tipo de cada objeto no array 'empregados'
        for (int j = 0; j < empregados.length; j++) {
            System.out.printf("Empregado %d is a %s\n", j,
                                empregados[j].getClass().getName());
        }
        */


        


        
        // exibição do conteúdo do 'ArrayList'
                
        
    }

}


// ----------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRANJOS DINÂMICOS em JAVA
// Ano/S: 2023/2S
// ----------------------------------------

// classe para realização de testes com
// 'ArrayList' contendo objetos 'String'
// -------------------------------------

// importação para permitir o uso de 'ArrayList'
import java.util.ArrayList;
import java.util.Collections;


public class TesteArrayListStrings {

    final String[] baseNomes = {
        "Adriana", "Bernardo", "Carlos", "Daniel", "Enzo", "Flavia",
        "Guilherme", "Helga", "Inácio", "José", "Kauan", "Luisa",
        "Marcos", "Nicolas", "Oswaldo", "Pietra", "Roberta", "Sandra",
        "Túlio", "Vinícius", "Wilson", "Ximena", "Yasmin", "Zélia"
    };

    // faltaram "Quirino", "Ulisses"
    
    // método da classe para realização do teste
    public void executaTeste() {
        
        // declaração de variáveis auxiliares
        String nomeArmazenar;

        // instanciação de um objeto da classe 'ArrayList'
        // para armazenar 'String' (inicialmente vazio, mas
        // com capacidade previamente definida para 12 elementos)
        ArrayList<String> nomes = new ArrayList<String>();
        
        // instanciação de um objeto da classe 'MetodosAvulsos'
        // para poder acessar o método 'geraNumeroRandomico'
        MetodosAvulsos avulso = new MetodosAvulsos();
        
        // armazenamento no 'ArrayList'
        // - valores arbitrários (nomes)
        // - posição arbitrária em uma dentre 4 inserções
        for ( int i = 0; i < 12; i++) {
            // escolhe o nome a ser armazenado a partir da 'baseNomes'
            nomeArmazenar = baseNomes[avulso.geraNumeroRandomico(0,23)];

            // armazena o nome sorteado
            nomes.add(nomeArmazenar);
        }
        
        // exibição da quantidade de elementos efetivamente armazenados
        System.out.printf("\nQtd. elementos armazenados: %2d\n",nomes.size());
        
        // exibição do conteúdo do 'ArrayList'
        System.out.println(nomes);
        
        // ordenação dos elementos do 'ArrayList'
        Collections.sort(nomes);
        
        // exibição do conteúdo do 'ArrayList'
        System.out.println("\nApós ordenação:");
        System.out.println(nomes);
        
        // realização de buscas por:
        // - nomes efetivamente armazenados no 'ArrayList'
        // - nomes não armazenados no 'ArrayList'
        
        // ESTRATÉGIA:
        // - percorrer a lista com todos os nomes ('baseNomes')
        // - verificar, para cada um, se ele está armazenado na ArrayList
        for ( String nomeProcurado : baseNomes ) {
            // verifica se está armazenado na ArrayList
            if ( nomes.contains(nomeProcurado) ) {
                // SIM, está armazenado
                System.out.printf("\nO nome '%s' está armazenado no ArrayList\n",nomeProcurado);
                System.out.printf("- primeira ocorrência: posição %2d\n", nomes.indexOf(nomeProcurado));
                System.out.printf("- última ocorrência: posição %2d\n", nomes.lastIndexOf(nomeProcurado));
            }
            else {
                // NÃO está armazenado
                System.out.printf("\nO nome '%s' NÃO está armazenado no ArrayList\n", nomeProcurado);
            }
        }
        
    }

}


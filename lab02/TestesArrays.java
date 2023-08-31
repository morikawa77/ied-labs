
public class TestesArrays {

    // Ação 1
    // Criar um array unidimensional de String, em que cada elemento é uma palavra do seu nome.
    // Utilizar o comando for (convencional, que utiliza um contador) e a propriedade length
    // para exibir o seu nome completo.
    private void exibeNomeCompleto() {

        // declaração do array de Strings
        String[] nomes = { "Reginaldo", "Morikawa"};

        // percurso do array para exibição do nome
        System.out.print("\nMeu nome completo é");
        for (String nome: nomes) {
            System.out.print(" " + nome);
        }
        System.out.println(".");

    }
    
    // Ação 2
    // Criar um array unidimensional (vetor), inicialmente vazio, que pode armazenar
    // 10 números inteiros. Preencher os elementos desse vetor com números randômicos entre 10 e 50.
    // Utilizar o comando for (na versão simplificada, que não exige um contador para iterar)
    // para exibir o conteúdo do vetor.
    private void exibeArrayInt() {

        // declaração do array de int
        int[] numeros = new int[10];
        
        // criação de uma instância (objeto) da classe 'MetodosAvulsos' para permitir o acesso
        // aos respectivos métodos
        MetodosAvulsos metodos = new MetodosAvulsos();
        
        // preenchimento dos valores dos elementos do array com números randômicos
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = metodos.geraNumeroRandomico(10, 50);
        }
        
        // percurso do array para exibição dos números
        System.out.print("\nOs números gerados foram:");
        System.out.println();
        for (int numero: numeros) {
            System.out.print(numero + " ");
        }

    }

    // Ação 3
    // Criar um array bidimensional (matriz) de 3 linhas e 4 colunas,
    // já preenchido com valores arbitrários. Utilizar o comando for
    // (convencional, que utiliza um contador) e a propriedade length
    // para exibir o conteúdo da matriz.
    private void exibeArrayBidimensional() {

        // declaração do array bidimensional 3x4 de int
        int matriz[][] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };

        // percurso do array bidimensional para exibição dos números
        System.out.println("\nOs números armazenados na matriz são:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

    }

    // Acionador do métodos acima (este método é chamado pelo Main)
    public void realizaTesteArrays() {

        // monta array de String e exibe o nome completo
        exibeNomeCompleto();

        // exibe array de números inteiros gerados randomicamente
        exibeArrayInt();

        // exibe array bidimensional
        exibeArrayBidimensional();
        
    }
    
}

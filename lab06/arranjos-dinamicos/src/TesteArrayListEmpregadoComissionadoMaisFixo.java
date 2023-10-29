// ----------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRANJOS DINÂMICOS em JAVA
// Ano/S: 2023/2S
// ----------------------------------------

 // classe para realização de testes com
// 'ArrayList' contendo objetos 'EmpregadoComissionadoMaisFixo'
// ------------------------------------------------------------

// importação para permitir o uso de 'ArrayList'
import java.util.ArrayList;


public class TesteArrayListEmpregadoComissionadoMaisFixo {
    
    // método da classe para realização do teste
    public void executaTeste() {
        
        // instanciação de um objeto da classe 'ArrayList'
        // para armazenar 'String' (inicialmente vazio)
        
        // armazenamento no 'ArrayList'
        // - 4 objetos da classe 'EmpregadoComissionadoMaisFixo')
        // - lembrar que cada 'Empregado...' tem uma 'dataNascimento'
        DiaMesAno dataNascimento1 = new DiaMesAno(8, 13, 1979);
        EmpregadoComissionadoMaisFixo empregado1 =
                new EmpregadoComissionadoMaisFixo(
                        "Bob",
                        "Lewis",
                        "333-33-3333",
                        dataNascimento1,
                        5000,
                        .04,
                        300 );

        // criar mais 3 empregados

        
        // exibição do conteúdo do 'ArrayList'
        
        // ??? ordenação dos elementos do 'ArrayList'
        
        // ??? exibição do conteúdo ordenado do 'ArrayList'
        
        // ??? realização de buscas por:
        // - objetos efetivamente armazenados no 'ArrayList'
        // - objetos não armazenados no 'ArrayList'
                
        // transferência do conteúdo para um vetor convencional
        
        // exibição do conteúdo do vetor assim criado
        
        
    }

}


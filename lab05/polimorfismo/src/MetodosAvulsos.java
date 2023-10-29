// --------------------------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: CARLOS MAGNUS CARLSON FILHO - FATEC S J Rio Preto
// Lab. : DIVERSOS
// Ano/S: 2023/2S
// --------------------------------------------------------

// classe que define métodos de uso geral,
// que podem ser acionados de maneira avulsa
// -----------------------------------------
public class MetodosAvulsos {
    
	// Uso geral - geração de número randômico inteiro num certo intervalo [min,max)
	// Observação: min (inclusive), max (exclusive)
	// -------------------------------------------------------------------
	public int geraNumeroRandomico( int min, int max ) {

		// geração do número
		int numeroRandomico = (int)( Math.random() * (max-min+1) + min);  // [min,max]

		// finalização
		return numeroRandomico;
	}

	// Uso geral - construção de linha separadora customizada nos 'prints'
	// ------------------------------------------------------------------
	public String criaSeparadora(String padrao, int qtd) {
		// exibe o 'padrão' indicado exatamente 'qtd' vezes
		return padrao.repeat(qtd);
	}

}


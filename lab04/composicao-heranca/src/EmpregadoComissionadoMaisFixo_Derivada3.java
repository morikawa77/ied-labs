// ------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : COMPOSIÇÃO E HERANÇA em JAVA
// Ano/S: 2023/2S
// ------------------------------------
 
// Classe EmpregadoComissionadoMaisFixo_Derivada3 herda de EmpregadoComissionado_Base3 e
// acessa os dados privados de EmpregadoComissionado_Base3 via os métodos 'public' de
// EmpregadoComissionado_Base3.
// -------------------------------------------------------------------------------------

public class EmpregadoComissionadoMaisFixo_Derivada3 extends EmpregadoComissionado_Base3
{
   // atributos
   private double salarioFixo; // salário-base por semana

   // construtor de seis argumentos
   public EmpregadoComissionadoMaisFixo_Derivada3(
           String argNome,
           String argSobrenome,
           String argCpf,
           double argVendasBrutas,
           double argTaxaComissao,
           double argSalarioFixo,
           int argMes,
           int argDia,
           int argAno)
   {
      super( argNome, argSobrenome, argCpf, argVendasBrutas, argTaxaComissao, argMes, argDia, argAno );
      setSalarioFixo( argSalarioFixo ); // valida e armazena salário-base
   } // fim do construtor
   
   // configura o salário-base                                    
   public void setSalarioFixo( double argSalarioFixo )
   {
      salarioFixo = ( argSalarioFixo < 0.0 ) ? 0.0 : argSalarioFixo;
   } // fim do método setSalarioFixo                         

   // retorna o salário-base                                   
   public double getSalarioFixo()
   {
      return salarioFixo;
   } // fim do método getSalarioFixo                            

   // calcula os lucros                 
   public double vencimentos()
   {
      return getSalarioFixo() + super.vencimentos();
   } // fim do método vencimentos              

   // retorna a representação String do objeto
   public String toString()
   {
      return String.format( "%s %s\n%s: %.2f", "(+ fixo)",
         super.toString(), "Vencimento fixo", getSalarioFixo() );   
   } // fim do método toString
   
} // fim da classe


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Fig. 9.13: BasePlusCommissionEmployee4.java                            *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *************************************************************************/
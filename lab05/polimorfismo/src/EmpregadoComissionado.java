// ----------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : POLIMORFISMO e INTERFACES em JAVA
// Ano/S: 2023/2S
// ----------------------------------------
 
// Classe 'EmpregadoComissionado' que é herança de 'Empregado'
// - contém atributos e define métodos específicos de 'EmpregadoComissionado'
// - implementa (define) o método que era 'abstract' em 'Empregado'
// --------------------------------------------------------------------------
// Fig. 10.7: CommissionEmployee.java 
// Classe CommissionEmployee estende Employee.

public class EmpregadoComissionado extends Empregado
{
   private double vendasBrutas; // vendas brutas semanais       
   private double taxaComissao; // porcentagem da comissão

   // construtor de seis argumentos
   public EmpregadoComissionado(
      String    argNome,
      String    argSobrenome,
      String    argCPF,
      DiaMesAno argDataNascimento,
      double    argVendasBrutas,
      double    argTaxaComissao )
   {
      super( argNome, argSobrenome, argCPF, argDataNascimento ); // passa para o construtor de 'Empregado'
      setVendasBrutas( argVendasBrutas );     // valida e armazena as vendas brutas
      setTaxaComissao( argTaxaComissao );     // valida e armazena a  taxa de comissão
   } // fim do construtor

   // configura a taxa de comissão
   public void setTaxaComissao( double argTaxaComissao )
   {
      taxaComissao = ( argTaxaComissao > 0.0 && argTaxaComissao < 1.0 ) ? argTaxaComissao : 0.0;
   } // fim do método setTaxaComissao 

   // retorna a taxa de comissão 
   public double getTaxaComissao()
   {
      return taxaComissao;
   } // fim do método getTaxaComissao 

   // configura a quantidade de vendas brutas
   public void setVendasBrutas( double argVendasBrutas )
   {
      vendasBrutas = ( argVendasBrutas < 0.0 ) ? 0.0 : argVendasBrutas;
   } // fim do método setVendasBrutas 

   // retorna a quantidade de vendas brutas 
   public double getVendasBrutas()
   {
      return vendasBrutas;
   } // fim do método getVendasBrutas 

   // calcula os rendimentos; sobrescreve o método vencimentos em Empregado
   public double vencimentos()                                            
   {                                                                   
      return getTaxaComissao() * getVendasBrutas();                    
   } // fim do método vencimentos              

   // retorna a representação String do objeto
   public String toString()                                    
   {                                                           
      return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f",    
         "Empregado commissionado", super.toString(),              
         "Vendas Brutas", getVendasBrutas(),                       
         "TaxaComissao", getTaxaComissao() );             
   } // fim do método toString
   
} // fim da classe

/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Fig. 10.7: CommissionEmployee.java                                     *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *************************************************************************/
// ------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : COMPOSIÇÃO E HERANÇA em JAVA
// Ano/S: 2023/2S
// ------------------------------------
 
// Classe EmpregadoComissionado_Base3 representa um empregado APENAS comissionado.
// -------------------------------------------------------------------------------

public class EmpregadoComissionado_Base3 extends Object
{
   // atributos
   private String nome;                              
   private String sobrenome;                               
   private String cpf;                   
   private double vendasBrutas; // vendas brutas semanais       
   private double taxaComissao; // porcentagem da comissão
   private DiaMesAno dataNascimento; // composição

   // construtor de cinco argumentos                                       
   public EmpregadoComissionado_Base3(
           String argNome,
           String argSobrenome,
           String argCPF,
           double argVendasBrutas,
           double argTaxaComissao,
           int argMes,
           int argDia,
           int argAno)                                     
   {                                                                  
      // chamada implícita para o construtor Object ocorre aqui              
      nome = argNome;                                              
      sobrenome = argSobrenome;                                                
      cpf = argCPF;                                     
      setVendasBrutas( argVendasBrutas ); // valida e armazena as vendas brutas       
      setTaxaComissao( argTaxaComissao ); // valida e armazena a taxa de comissão
      dataNascimento = new DiaMesAno(argMes, argDia, argAno); // composição
   } // fim do construtor

   // configura o nome 
   public void setNome( String argNome )
   {
      nome = argNome;
   } // fim do método setNome 

   // retorna o nome
   public String getNome()
   {
   return nome;
   } // fim do método getNome

   // configura o sobrenome 
   public void setSobrenome( String argSobrenome )
   {
      sobrenome = argSobrenome;
   } // fim do método setSobrenome 

   // retorna o sobrenome
   public String getSobrenome()
   {
      return sobrenome;
   } // fim do método getSobrenome

   // configura o CPF
   public void setCPF( String argCPF )
   {
      cpf = argCPF; // deve validar
   } // fim do método setCPF

   // retorna o CPF
   public String getCPF()
   {
      return cpf;
   } // fim do método getCPF 

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

   public void setDiaNascimento(int argMes, int argDia, int argAno)
   {
      dataNascimento.setMonth(argMes);
      dataNascimento.setDay(argDia);
      dataNascimento.setYear(argAno);
   } // fim do método setDiaNascimento

   public DiaMesAno getDataNascimento(){
      return dataNascimento;
   }

   // calcula os lucros                 
   public double vencimentos()              
   {                                     
      return taxaComissao * vendasBrutas;
   } // fim do método vencimentos              

   // retorna a representação 'String' do objeto 'EmpregadoComissionado'     
   public String toString()                                         
   {                                                                
      return String.format( "%s: %s %s\n%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f",
         "Empregado comissionado", nome, sobrenome,                
         "CPF", cpf,        
         "Data de nascimento", dataNascimento.toString(),     
         "Vendas brutas", vendasBrutas,                                 
         "Taxa de comissão", taxaComissao );                       
   } // fim do método toString
   
} // fim da classe


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Fig. 9.4: CommissionEmployee.java                                      *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *************************************************************************/
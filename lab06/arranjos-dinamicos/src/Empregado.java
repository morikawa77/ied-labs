// ----------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : POLIMORFISMO e INTERFACES em JAVA
// Ano/S: 2023/2S
// ----------------------------------------
 
// Superclasse abstrata 'Empregado'
// - contém atributos e define métodos referentes a qualquer 'Empregado'
// - apresenta um método 'abstract' que vai ser implementado nas classes derivadas
// -------------------------------------------------------------------------------
public abstract class Empregado
{
   private String nome;
   private String sobrenome;
   private String cpf;
   private DiaMesAno dataNascimento; // data de nascimento - COMPOSIÇÃO

   // construtor com quatro argumentos
   public Empregado(
      String argNome,
      String argSobrenome,
      String argCPF,
      DiaMesAno argDataNascimento )
   {
      nome = argNome;
      sobrenome = argSobrenome;
      cpf = argCPF;
      dataNascimento = argDataNascimento;
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
      cpf = argCPF; // deve validar...
   } // fim do método setCPF

   // retorna o CPF
   public String getCPF()
   {
      return cpf;
   } // fim do método getCPF 

   // configura a data de nascimento 
   public void setDataNascimento( int argMonth, int argDay, int argYear )
   {
      dataNascimento.setMonth(argMonth); // valida e altera
      dataNascimento.setDay(argDay);
      dataNascimento.setYear(argYear);
   } // fim do método setCPF

   // retorna a data de nascimento
   public DiaMesAno getDataNascimento()
   {
      return dataNascimento;
   } // fim do método getCPF 

   // retorna a representação de String do objeto
   public String toString()
   {
      return String.format( "%s %s\nCPF: %s\nNascido em: %s", 
         getNome(), getSobrenome(), getCPF(), getDataNascimento().toString() );
   } // fim do método toString

   // método abstrato sobrescrito pelas subclasses      
   public abstract double vencimentos(); // nenhuma implementação aqui !!!
   
} // fim da classe

/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Fig. 10.4: Employee.java                                               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *************************************************************************/
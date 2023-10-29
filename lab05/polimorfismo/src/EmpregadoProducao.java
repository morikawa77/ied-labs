public class EmpregadoProducao extends Empregado{
  private double salarioPorPeca;
  private double qtdPecasProduzidas;

  public EmpregadoProducao(
    String argNome, 
    String argSobrenome, 
    String argCPF, 
    DiaMesAno argDataNascimento,
    double argSalarioPorPeca,
    double argQtdPecasProduzidas) {
    
    super(argNome, argSobrenome, argCPF, argDataNascimento);
    
    setSalarioPorPeca(argSalarioPorPeca);
    setQtdPecasProduzidas(argQtdPecasProduzidas);
  }

  private void setSalarioPorPeca(double argSalarioPorPeca) {
    salarioPorPeca = ( argSalarioPorPeca < 0.0 ) ? 0.0 : argSalarioPorPeca;
  }
  
  private void setQtdPecasProduzidas(double argQtdPecasProduzidas) {
    qtdPecasProduzidas = ( argQtdPecasProduzidas < 0.0 ) ? 0.0 : argQtdPecasProduzidas;
  }

  public double getSalarioPorPeca() {
    return salarioPorPeca;
  }

  public double getQtdPecasProduzidas() {
    return qtdPecasProduzidas;
  }

  public double vencimentos(){
    return salarioPorPeca * qtdPecasProduzidas;
  }

  public String toString()                                    
   {                                                           
      return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f",    
         "Empregado por produção", super.toString(),              
         "Salário por peças", getSalarioPorPeca(),                       
         "Peças produzidas", getQtdPecasProduzidas() );             
   }
}

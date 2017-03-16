package folha;
public class Comissionado extends Mensalista{
   private double comissao;
   
   public Comissionado(String nome, double salario, double comissao){
      super(nome, salario);
      this.comissao = comissao;
   }
   
   //N�o sou obrigado a colocar esse m�todo por o Mensalista j� colocou
   @Override
   public double salario(){
      return super.salario()+comissao;
   }
}

public class Eleitor extends Pessoa{
  public Eleitor(String nome, int idade){
       super (nome, idade);
   }
   @Override
   public boolean podeVotar(){
       if(idade >= 16){
           return true;
       }
       return false;
  }
}





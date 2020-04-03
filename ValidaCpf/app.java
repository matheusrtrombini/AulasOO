
public class app
{
   public static void main(String[] args){
    pessoa joao= new pessoa();
    joao.cpf="41259820823";
    
    boolean validou;
    validou = joao.validaCPF(joao.cpf);
    System.out.println(validou);
    
    
    
    
    }
}

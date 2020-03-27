
/**
 * Escreva a descrição da classe CalculoCombustivel aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class CalculoCombustivel
{
    public static void main(String[] args){
   double valorGasolina = 4.29;
   double valorAlcool = 3.59;
   
   double rendimentoGasolina = valorGasolina * 0.7;
   
   if(rendimentoGasolina < valorAlcool){
       System.out.println(" A gasolina está rendendo mais");
       
}
else{
    System.out.println(" O alcool está rendendo mais");
}
}
}

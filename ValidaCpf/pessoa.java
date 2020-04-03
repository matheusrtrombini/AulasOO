
public class pessoa
{
   String name;
   String cpf;
   double hight,weight;
   String adress;
   
   public static boolean validaCPF( String cpf){
   
       if(cpf.equals("00000000000")||
       cpf.equals("11111111111")||
       cpf.equals("22222222222")||
       cpf.equals("33333333333")||
       cpf.equals("44444444444")||
       cpf.equals("55555555555")||
       cpf.equals("77777777777")||
       cpf.equals("88888888888")||
       cpf.equals("66666666666")||
       cpf.equals("99999999999")){
        
        return false;
    }  
       
       
       
       String numeroDoCPF = cpf;
        char [] letras = new char [numeroDoCPF.length()];
        letras = numeroDoCPF.toCharArray();
        int[] numeroCPF = new int[numeroDoCPF.length()];
            for(int x=0;x<numeroDoCPF.length();x++){
                  numeroCPF[x]=Integer.parseInt(String.valueOf(letras[x]));
    
    }
            int digite10;
            int recebe=0;
            int peso = 10;
            for(int x=0;x<9;x++){
   
                recebe+=numeroCPF[x] * peso;
            
                peso = peso - 1;
                
             
            }
        
              digite10 =  (recebe *10) %11;
               
               System.out.println(digite10);
               
              int digite11;
            int recebe1=0;
            int peso2 = 11;
            for(int x=0;x<10;x++){
   
                recebe+=numeroCPF[x] * peso2;
            
                peso2 = peso2 - 1;
                
             
            }
        
              digite11 =  (recebe *10) %11;
               
               System.out.println(digite11);
               return true;
               
                
            }    
            
                
        }
    
    
   


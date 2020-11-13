
public class Urna
{
   
    private int votos;
    private int votosBrancosNulos;
    
    public Urna(){
        votos = 0;
        votosBrancosNulos = 0;
    }
    public void recebeVotos(){
        votos++;
    }
    public void recebeVotosBrancosNulos(){
        votosBrancosNulos++;
    }
    public String mostraVotos(){
        return "Votos Válidos:  " + votos + "\n Votos Brancos e Nulos:  " + votosBrancosNulos;
    }
   
}

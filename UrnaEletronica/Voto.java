
public class Voto
{
    Urna urna;
    private int votos;
    public Voto(Urna urna){
        votos = 0;
        this.urna = urna;
    }
    public void novoVoto(){
        votos += 1;
        urna.recebeVotos();
    }
}

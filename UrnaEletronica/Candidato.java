import java.util.ArrayList;
import java.util.List;

public class Candidato extends Pessoa implements Candidatos
{
   Voto votos;
   int voto;
   String posicao;
   List<Eleitor> quemVotou = new ArrayList<Eleitor>();
   public Candidato(String nome, int idade, Urna urna){
       super(nome, idade);
       votos = new Voto(urna);
       voto = 0;
   }
   public void mostraTotalVotos(){
       if(voto == 0){
           System.out.println("Candidato: " + nome + "Nao recebeu votos");
       }
       else{
           System.out.println("Candidato: " + nome + " Recebeu: " + voto + "Votos");
       }
   }
   public void adicionaEleitor(Eleitor eleitor){
       quemVotou.add(eleitor);
   }
   public void mostraEleitor(){
       if(quemVotou.size()!=0){
           System.out.println("Candidato: " + nome + "\nQuem Votou: ");
           for(int x = 0; x < quemVotou.size(); x++){
               System.out.println(quemVotou.get(x).nome);
           }
           System.out.println("");
       }
       else{
           System.out.println("Candidato: " + nome + "Nao recebeu votos");
       }
   }
   @Override
   public void posicaoCandidato(String posicao){
       this.posicao = posicao;
   }
   @Override
   public void recebeVoto(){
       voto++;
       votos.novoVoto();
   }    
}

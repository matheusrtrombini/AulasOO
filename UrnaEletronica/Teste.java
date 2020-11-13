

public class Teste
{
 public static void main(String [] args){
     Urna urna = new Urna();
     Candidato candidatoA = new Candidato("Adriana Borgo", 49, urna);
     candidatoA.posicaoCandidato("Deputado");
     Candidato candidatoB = new Candidato("Daniel Soares", 44, urna);
     candidatoB.posicaoCandidato("Deputado");
     Candidato candidatoC = new Candidato("Damaris Moura", 48, urna);
     candidatoC.posicaoCandidato("Deputado");
     
     Candidato candidatoD = new Candidato("Rodrigo Pacheco", 44, urna);
     candidatoD.posicaoCandidato("Senador");
     Candidato candidatoE = new Candidato("José Serra", 78, urna);
     candidatoE.posicaoCandidato("Senador");
     Candidato candidatoF = new Candidato("Romário", 54, urna);
     candidatoF.posicaoCandidato("Senador");
     
     Candidato candidatoG = new Candidato("Ciro Gomes", 63, urna);
     candidatoG.posicaoCandidato("Presidente");
     Candidato candidatoH = new Candidato("Guilherme Boulos", 38, urna);
     candidatoH.posicaoCandidato("Presidente");
     Candidato candidatoI = new Candidato("Geraldo Alckmin", 68, urna);
     candidatoI.posicaoCandidato("Presidente");
     
     Eleitor eleitorA = new Eleitor("Julio", 17);
        candidatoC.recebeVoto();
        candidatoC.adicionaEleitor(eleitorA);
        candidatoF.recebeVoto();
        candidatoF.adicionaEleitor(eleitorA);
        candidatoI.recebeVoto();
        candidatoI.adicionaEleitor(eleitorA);
        
     Eleitor eleitorB = new Eleitor("Sabrina", 22);
        candidatoB.recebeVoto();
        candidatoB.adicionaEleitor(eleitorB);
        candidatoE.recebeVoto();
        candidatoE.adicionaEleitor(eleitorB);
        candidatoH.recebeVoto();
        candidatoH.adicionaEleitor(eleitorB);
        
        Eleitor eleitorC = new Eleitor("Geonilda", 72);
        candidatoA.recebeVoto();
        candidatoA.adicionaEleitor(eleitorC);
        candidatoD.recebeVoto();
        candidatoD.adicionaEleitor(eleitorC);
        candidatoG.recebeVoto();
        candidatoG.adicionaEleitor(eleitorC);
        
        Eleitor eleitorD = new Eleitor("Luan", 28);
        candidatoB.recebeVoto();
        candidatoB.adicionaEleitor(eleitorD);
        candidatoD.recebeVoto();
        candidatoD.adicionaEleitor(eleitorD);
        candidatoI.recebeVoto();
        candidatoI.adicionaEleitor(eleitorD);
        
        Eleitor eleitorE = new Eleitor("Carlos", 32);
        candidatoA.recebeVoto();
        candidatoA.adicionaEleitor(eleitorE);
        candidatoD.recebeVoto();
        candidatoD.adicionaEleitor(eleitorE);
        candidatoG.recebeVoto();
        candidatoG.adicionaEleitor(eleitorE);
        
        Eleitor eleitorF = new Eleitor("Claudia", 40);
        candidatoA.recebeVoto();
        candidatoA.adicionaEleitor(eleitorF);
        candidatoF.recebeVoto();
        candidatoF.adicionaEleitor(eleitorF);
        candidatoG.recebeVoto();
        candidatoG.adicionaEleitor(eleitorF);
        
        Eleitor eleitorG = new Eleitor("Renata", 43);
        candidatoA.recebeVoto();
        candidatoA.adicionaEleitor(eleitorG);
        candidatoF.recebeVoto();
        candidatoF.adicionaEleitor(eleitorG);
        candidatoG.recebeVoto();
        candidatoG.adicionaEleitor(eleitorG);
        
        Eleitor eleitorH = new Eleitor("Cristiano", 46);
        candidatoC.recebeVoto();
        candidatoC.adicionaEleitor(eleitorH);
        candidatoF.recebeVoto();
        candidatoF.adicionaEleitor(eleitorH);
        candidatoG.recebeVoto();
        candidatoG.adicionaEleitor(eleitorH);
        
        Eleitor eleitorI = new Eleitor("Maria", 62);
        candidatoB.recebeVoto();
        candidatoB.adicionaEleitor(eleitorI);
        candidatoE.recebeVoto();
        candidatoE.adicionaEleitor(eleitorI);
        candidatoH.recebeVoto();
        candidatoH.adicionaEleitor(eleitorI);
        
        System.out.println(urna.mostraVotos());
        candidatoA.mostraEleitor();
        candidatoB.mostraEleitor();
        candidatoC.mostraEleitor();
        candidatoD.mostraEleitor();
        candidatoE.mostraEleitor();
        candidatoF.mostraEleitor();
        candidatoG.mostraEleitor();
        candidatoH.mostraEleitor();
        candidatoI.mostraEleitor();
        candidatoA.mostraTotalVotos();
        candidatoB.mostraTotalVotos();
        candidatoC.mostraTotalVotos();
        candidatoD.mostraTotalVotos();
        candidatoE.mostraTotalVotos();
        candidatoF.mostraTotalVotos();
        candidatoG.mostraTotalVotos();
        candidatoH.mostraTotalVotos();
        candidatoI.mostraTotalVotos();
        
        
        
        
        
        
        
 
 }
}

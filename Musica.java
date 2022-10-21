
/**
 * Escreva uma descrição da classe Musica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Musica extends Componente
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nomeMusica;
    private String nomeBanda;
    private int anoLancamento;
    
    public Musica(String _paramMusica,String _paramBanda,int _paramano ){
        this.nomeMusica=_paramMusica;
        this.nomeBanda=_paramBanda;
        this.anoLancamento=_paramano;
    }
    
    public String getNomeMusica(){ return nomeMusica;}
    public String getNomeBanda(){ return nomeBanda;}
    public int getAno(){ return anoLancamento;}

    public void exibirInformacoes(){
        System.out.println("Musica: " + getNomeMusica() + " gravada por " +
                    getNomeBanda() + " em " + getAno()+ "\n");
    }
    
}

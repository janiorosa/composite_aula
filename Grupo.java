
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Escreva uma descrição da classe Grupo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Grupo extends Componente 
{
    List album = new ArrayList();
    private String nomeAlbum;
    private String descricao;
    
    public String getNomeAlbum(){return nomeAlbum;}
    public String getDescricao(){return descricao;}
    public Grupo(String _nome, String _descr){
        this.nomeAlbum=_nome;
        this.descricao=_descr;
    }
    //Teste
    public void adiciona(Componente _param){
        album.add(_param);
    }
    
    public Componente getComponente(int _indice){
        return (Componente)album.get(_indice);
    }
    
    public void exibirInformacoes(){
        System.out.println("Banda: "+getNomeAlbum() + " " + getDescricao());
        Iterator musicaIterator = album.iterator();
        while(musicaIterator.hasNext()){
            Componente musica_ou_album = (Componente)musicaIterator.next();
            musica_ou_album.exibirInformacoes();
        }
    }
}

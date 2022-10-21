
/**
 * Escreva uma descrição da classe Boate aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Boate
{

    Componente todas;
    public Boate(Componente _todas){this.todas=_todas;}
    public static void main(String[] args){
        Componente classica = new Grupo("Classicas", "");
        Componente industrial = new Grupo("Industrial", "");
        Componente dubstep = new Grupo("Dubstep", "");
        Componente heavyMetal = new Grupo("Heavy Metal", "");
        
        Componente todas = new Grupo("Todas as musicas da Boate","");
        todas.adiciona(classica);
        Boate boate = new Boate(todas);
        classica.adiciona(new Musica("4 estaçoes","Vivaldi",1700)); 
        classica.adiciona(new Musica("Hino da Alegria","Beethooven",1700)); 
        classica.adiciona(new Musica("Canon in D Menor","Pachelbel",1700)); 
        industrial.adiciona(new Musica("Head Like a Hole","NIN", 1990));
        industrial.adiciona(new Musica("Headhunter","Front 242", 1988));
        
        todas.adiciona(industrial);
        industrial.adiciona(dubstep);
        dubstep.adiciona(new Musica("Centipede", "Knife Party", 2012));
        dubstep.adiciona(new Musica("Tetris", "Doctor P",2011));
        
        todas.adiciona(heavyMetal);
        heavyMetal.adiciona(new Musica("War Pigs", "Black Sabath", 1970));        
        heavyMetal.adiciona(new Musica("Ace of Spades", "Motorhead", 1980));        
        
        boate.musicasDaDiscotecaBoate();
    
    }
    
    public void musicasDaDiscotecaBoate(){
        todas.exibirInformacoes();
    }
}

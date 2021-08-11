import java.io.PipedWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inicializacao {
    private List<Carta> todasCartas = new ArrayList<>();
    private List<Personagem> personagens = new ArrayList<>();

    public void inserirPersonagem(){
        Personagem p1 = new Personagem("Big Man", "Ataque", 50);
        Personagem p2 = new Personagem("Big Girl", "Ataque", 50);
        Personagem p3 = new Personagem("IcerX", "Defesa", 40);
        Personagem p4 = new Personagem("Super Stone", "Defesa", 60);
        Personagem p5 = new Personagem("Super Baby", "Ataque", 80);
        Personagem p6 = new Personagem("Spider Woman", "Ataque", 80);
        Personagem p7 = new Personagem("Come Here", "Defesa", 50);
        Personagem p8 = new Personagem("iBag", "Defesa", 50);

        personagens = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);

    }
    public void inserirCartas(){
        for(Personagem p : personagens){
            Carta c = new Carta(p);
            todasCartas.add(c);
        }
    }
    public List<Personagem> getPersonagens() {
        return personagens;
    }
    public List<Carta> getTodasCartas() {
        return todasCartas;
    }
}

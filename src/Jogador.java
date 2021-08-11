import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogador {
    private String nome;

    public String getNome() {
        return nome;
    }

    private List<Carta> cartas = new ArrayList<>();

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    private int pontos = 0;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Carta jogar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Vez de " + getNome());
        System.out.println("ESTAS SÃO AS SUAS CARTAS\n");
        for(int i=0; i<4; i++){
            System.out.println("Carta " + i + ":\n" + getCartas().get(i).getPersonagem().getNome() + "\n" +
                    getCartas().get(i).getPersonagem().getCategoria() + "\nDano: " +
                    getCartas().get(i).getPersonagem().getForca() + "\n");
        }
        System.out.println("Qual você gostaria de jogar? Escolha de acordo com o número dela");
        int opcao = scan.nextInt();

        return (getCartas().get(opcao));
    }
}

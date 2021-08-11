public class Personagem {
    private String nome;
    private String categoria;
    private int forca;

    public Personagem(String nome, String categoria, int forca) {
        this.nome = nome;
        this.categoria = categoria;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getForca() {
        return forca;
    }
}

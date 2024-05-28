package Classes;

public class Titulo implements Comparable<Titulo>  {
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public int compareTo(Titulo outroTitulo){
        return this.nome.compareTo(outroTitulo.nome);
    }
    public String toString(){
        return this.getNome();
    }

    public String getNome() {
        return nome;
    }
}

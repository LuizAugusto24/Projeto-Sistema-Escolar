package entidade;

public class Disciplina {

    private int id_disciplina;
    private String nome_disc;

    public Disciplina() {
    }

    public Disciplina(int id_disciplina, String nome_disc) {
        this.id_disciplina = id_disciplina;
        this.nome_disc = nome_disc;
    }


    public int getId_disciplina() {
        return id_disciplina;
    }

    public void setId_disciplina(int id_disciplina) {
        this.id_disciplina = id_disciplina;
    }

    public String getNome_disc() {
        return nome_disc;
    }

    public void setNome_disc(String nome_disc) {
        this.nome_disc = nome_disc;
    }
}
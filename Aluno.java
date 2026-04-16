
package entidade;

public class Aluno {

    private String nome;
    private int id_aluno;

    public Aluno() {
    }

    public Aluno(String nome, String turma) {
        this.nome = nome;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getid_aluno() {
        return id_aluno;
    }

    public void setid_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

}

package entidade;

public class Professor {

    private int id_professor;
    private String nome_professor;
    private double salario;

    public Professor() {
    }

    public Professor(int id_professor, String nome_professor, double salario) {
        this.id_professor = id_professor;
        this.nome_professor = nome_professor;
        this.salario = salario;
    }


    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
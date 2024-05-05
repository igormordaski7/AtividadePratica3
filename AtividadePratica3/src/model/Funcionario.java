package model;

public abstract class Funcionario {

    private String nome;
    private int matricula;
    protected float hrsTrab;
    private float valorHr;
  
    public abstract double calcularSalario();

    public Funcionario(){

    }

    public Funcionario(String nome, int matricula, float hrsTrab, float valorHr) {
        this.nome = nome;
        this.matricula = matricula;
        this.hrsTrab = hrsTrab;
        this.valorHr = valorHr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getHrsTrab() {
        return hrsTrab;
    }

    public void setHrsTrab(float hrsTrab) {
        this.hrsTrab = hrsTrab;
    }

    public float getValorHr() {
        return valorHr;
    }

    public void setValorHr(float valorHr) {
        this.valorHr = valorHr;
    }

    @Override
    public String toString() {
         return "\nNome: " + nome +
         "\nMatricula: " + matricula +
         "\nHoras Trabalhadas: " + hrsTrab +
         "\nValor da hora: " + valorHr;
    }
    

}

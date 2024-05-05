package model;

public class Estagiario extends Funcionario implements Trabalhavel{
    
    private String supervisor;

    public Estagiario(){

    }

    public Estagiario(String nome, int matricula, float hrsTrab, float valorHr, String supervisor) {
        super(nome, matricula, hrsTrab, valorHr);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public double calcularSalario() {
        return hrsTrab * getValorHr();
    }

    @Override
    public void trabalhar() {
        System.out.println("O estagiário está aprendendo com o seu supervisor " + supervisor);
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Estagiário relatando o que aprendeu");
    }

    @Override
    public String toString() {
        return super.toString() +
        "\nSupervisor: " + supervisor +
        "\nSalário: R$ " + calcularSalario();
    }
    
    
}

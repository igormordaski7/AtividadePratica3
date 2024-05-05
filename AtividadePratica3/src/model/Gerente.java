package model;

public class Gerente extends Funcionario implements Trabalhavel{
    
    private float bonusAnual;
    private String equipeComand;

    public Gerente() {

    }

    public Gerente(String nome, int matricula, float hrsTrab, float valorHr, float bonusAnual, String equipeComand) {
        super(nome, matricula, hrsTrab, valorHr);
        this.bonusAnual = bonusAnual;
        this.equipeComand = equipeComand;
    }

    public float getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(float bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public String getEquipeComand() {
        return equipeComand;
    }

    public void setEquipeComand(String equipeComand) {
        this.equipeComand = equipeComand;
    }

    @Override
    public double calcularSalario() {
        
        return getValorHr() * getHrsTrab() + bonusAnual;
    }

    @Override
    public void trabalhar() {
       System.out.println("O gerente está trabalhando com sua equipe!"); 
    }

    @Override
    public void relatarProgresso() {
        System.out.println("O gerente está relatando o desenvolvimento de sua equipe!");
    }

    @Override
    public String toString() {
        return super.toString() +
        "\nEquipe que comanda: " + equipeComand +
        "\nBônus Anual: R$ " + bonusAnual +
        "\nSalário: R$ " + calcularSalario();
    }
    
}

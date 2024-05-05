package model;

public class Desenvolvedor extends Funcionario implements Trabalhavel{
    
    private String tecnologias;

    public Desenvolvedor(){
    
    }

    public Desenvolvedor(String nome, int matricula, float hrsTrab, float valorHr, String tecnologias) {
        super(nome, matricula, hrsTrab, valorHr);
        this.tecnologias = tecnologias;
    }

    public String gettecnologias() {
        return tecnologias;
    }

    public void settecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public double calcularSalario() {
        return hrsTrab * getValorHr();
    }

    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor programando em " + tecnologias);
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Desenvolvedor está progredindo na resolução do projeto");
    }

    @Override
    public String toString() {
        return super.toString() +
        "\nTecnologia que domina: " + tecnologias +
        "\nSalário: R$ " + calcularSalario();
    }

    

}

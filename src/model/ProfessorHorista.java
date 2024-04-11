package model;

public class ProfessorHorista extends Professor {

    private int horasAula;
    private double valorHoraAula;

 
    public ProfessorHorista(String nome, String matricula, int idade, int horasAula, double valorHoraAula) {
        super(nome, matricula, idade);
        this.horasAula = horasAula;
        this.valorHoraAula = valorHoraAula;
    }

  
    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
}
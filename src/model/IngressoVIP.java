package model;

public class IngressoVIP extends Ingresso {
	private String funcao;

    public IngressoVIP(String identificador, float valor, String funcao) {
        super(identificador, valor);
        this.funcao = funcao;
    }


    public float valorFinal(float taxaConveniencia) {
        return super.getValor() * 1.18f + taxaConveniencia;
    }

    
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
package model;

public class Principal {

	public static void main(String[] args) {
	   
		Ingresso ingressoComum = new Ingresso("001", 50.0f);
		System.out.println("Valor final do ingresso comum: " + ingressoComum.valorFinal(5.0f));

		IngressoVIP ingressoVIP = new IngressoVIP("002", 80.0f, "Camarote");
		System.out.println("Valor final do ingresso VIP: " + ingressoVIP.valorFinal(5.0f));
	    }
	}



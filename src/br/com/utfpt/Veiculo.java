package br.com.utfpt;

public class Veiculo {
	
	//Atributos
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private float velocMax;
	private int qtdRodas;
	private Motor motor;
	
	
	//M?todo default Motor iniciando vari?veis com 0
	public Veiculo() {
		this.placa = " ";
		this.marca = " ";
		this.modelo = " ";
		this.cor = " ";
		this.velocMax = 0.0f;
		this.qtdRodas = 0;
		motor = new Motor();
	}
	
	
	//M?todo Motor recebendo parametros de ve?culo
	public Veiculo(String placa , String marca , String modelo , String cor , float velocMax , int qtdRodas) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocMax = velocMax;
		this.qtdRodas = qtdRodas;
		motor = new Motor();
	}
	
	
	//M?todo Motor recebendo parametros de Motor
	public Veiculo(String placa , String marca , String modelo , String cor , float velocMax , int qtdRodas , int qtdPist , int potencia) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocMax = velocMax;
		this.qtdRodas = qtdRodas;
		motor = new Motor(qtdPist , potencia);
	}
	
	
	//Getters and Setters
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getVelocMax() {
		return velocMax;
	}
	public void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}
	public int getQtdRodas() {
		return qtdRodas;
	}
	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
	//M?todo ve?culo
	public void imprimirVeiculo() {
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Cor: "+this.cor);
		System.out.println("Placa: "+this.placa);
		System.out.println("Velocidade m?xima: "+this.velocMax);
		System.out.println("Quantidade de rodas: "+this.qtdRodas);
	}		
	

}

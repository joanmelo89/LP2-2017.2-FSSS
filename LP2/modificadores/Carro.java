/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadores;

/**
 *
 * @author joan-
 */
public class Carro {
    public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
	public void exibirAutonomia() {
	    System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}
	
	public double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKMPorConsumoCombustive(double km){
		return km/this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km){
		
		return this.divideKMPorConsumoCombustive(km);
	}
}

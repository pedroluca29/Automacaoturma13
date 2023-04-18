package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	private By btnAbrirConta = By.xpath("/html/body/div[2]/nav[2]/div[2]/div[4]/a");
	private By btnParaVoce = By.id("bt1");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("telefone");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By btnQueroserCliente =  By.id("btnEnviar");
	private By textoFaltaPouco = By.cssSelector("#pu-modalSucesso > div > div:nth-child(2) > p > span:nth-child(1)");
	private By  cookie = By.id("onetrust-accept-btn-handler");
	public By getCookie() {
		return cookie;
	}
	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}
	public By getBtnParaVoce() {
		return btnParaVoce;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoTelefone() {
		return campoTelefone;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoCpf() {
		return campoCpf;
	}
	public By getBtnQueroserCliente() {
		return btnQueroserCliente;
	}
	public By getTextoFaltaPouco() {
		return textoFaltaPouco;
	}
	
}

package Iphone;

public class AparelhoIphone {

	public static void main(String[] args) {
		ReprodutorMusical tocadorDeMusicas = new AppIphone(); 
		AparelhoTelefonico appParaTelefonar = new AppIphone();
		NavegadorDeInternet safari = new AppIphone();
		
		tocadorDeMusicas.tocar();
		tocadorDeMusicas.pausar();
		tocadorDeMusicas.selecionarMusica();
		
		appParaTelefonar.atender();
		appParaTelefonar.iniciarCorreioVoz();
		appParaTelefonar.ligar();
		
		safari.adicionarNovaAba();
		safari.atualizarPagina();
		safari.exibirPagina();
		
	}

}

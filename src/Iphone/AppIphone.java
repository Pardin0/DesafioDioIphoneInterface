package Iphone;

public class AppIphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {

	// ReprodutorMusical

	public void tocar() {
		System.out.println("Tocando música");
	}

	public void pausar() {
		System.out.println("Pausando música");
	}

	public void selecionarMusica() {
		System.out.println("Selecionando música");

	}

	// NavegadorDeInternet

	public void exibirPagina() {
		System.out.println("Exibindo página atual");

	}

	public void adicionarNovaAba() {
		System.out.println("Criando nova Aba");

	}

	public void atualizarPagina() {
		System.out.println("Atualizando página");

	}

	// AparelhoTelefonico

	public void ligar() {
		System.out.println("Ligando para outro aparelho");

	}

	public void atender() {
		System.out.println("Atendendo telefone");

	}

	public void iniciarCorreioVoz() {
		System.out.println("Carregando correio de voz");

	}

}

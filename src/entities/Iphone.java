package entities;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Iniciando Aparelho Telefônico:");
        System.out.println();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("------------------------------");
        System.out.println("Iniciando Reprodutor Musical:");
        System.out.println();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("------------------------------");
        System.out.println("Iniciando Navegador na Internet:");
        System.out.println();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música...");
    }
}

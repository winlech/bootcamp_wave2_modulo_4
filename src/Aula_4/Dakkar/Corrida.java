package Aula_4.Dakkar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Corrida {

    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;

    public Corrida(double distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos = new ArrayList<>();
        this.socorristaCarro = new SocorristaCarro();
        this.socorristaMoto = new SocorristaMoto();

    }

    public void registrarCarro(int velocidade, int aceleracao, double anguloDeGiro, String placa) {
        if (listaVeiculos.size() < quantidadeVeiculosPermitidos) {
            Carro carro = new Carro(velocidade, aceleracao, anguloDeGiro, placa);
            this.listaVeiculos.add(carro);
        }
    }

    public void registrarMoto(int velocidade, int aceleracao, double anguloDeGiro, String placa) {
        if (listaVeiculos.size() < quantidadeVeiculosPermitidos) {
            Motos moto = new Motos(velocidade, aceleracao, anguloDeGiro, placa);
            this.listaVeiculos.add(moto);
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        this.listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        this.listaVeiculos = this.listaVeiculos.stream()
                .filter(veiculo -> !veiculo.getPlaca().equals(placa))
                .collect(Collectors.toList());
    }

    public Veiculo getVencedor() {
        Optional<Veiculo> vencedor =  this.listaVeiculos.stream()
                 .max(Comparator.comparing(Veiculo::pontuacao));

        return vencedor.orElse(null);
    }

    public Veiculo buscarVeiculoPlaca(String placa) {
        return this.listaVeiculos.stream()
                .filter(v -> v.getPlaca().equals(placa))
                .findFirst()
                .orElse(null);
    }

    public void socorrerCarro(String documento) {
        Veiculo veiculo = this.buscarVeiculoPlaca(documento);
        if (veiculo instanceof Carro)
            this.socorristaCarro.socorrer((Carro) veiculo);
    }

    public void socorrerMoto(String documento) {
        Veiculo veiculo = this.buscarVeiculoPlaca(documento);
        if (veiculo instanceof Motos)
            this.socorristaMoto.socorrer((Motos) veiculo);
    }
}

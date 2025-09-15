package aula.dev.dojo.javacore.FmodificadorStatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250; // static usado para limitar a velocidade ou seja todos os carros tem a mesma velocidade limite

    

    public Carro(String nome, double velocidadeMaxima, double velocidadeLimite) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        Carro.velocidadeLimite = velocidadeLimite;
    }


    public void imprime(){
        System.out.println("=================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }
    public void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

  


    

}

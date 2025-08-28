package aula.dev.dojo.javacore.SobreCargaMetodos.Dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    //Construtor, seguido o nome da classe
    public Anime(String nome, String tipo, int episodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    // isso é sobrecarga de métodos, usado para inicializar objetos de forma diferente
    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios); // isso é sobrecarga de métodos
        this.genero = genero;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Gênero: " + this.genero);
        System.out.println("==========");
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){ // get → retorna o valor do atributo.
        return this.tipo;
    }

    public void setEpisodios(int episodios){ // set → altera o valor do atributo.
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }
}

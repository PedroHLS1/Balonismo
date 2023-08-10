public class Balao {
    private int id;
    private String registro;
    private String cor;
    private String tipo;
    private double tamanho;
    private double peso;
    private String porte;
    private int capacidadePessoas;

   //construtor padrão


    public Balao(int id, String registro, String cor, String tipo, double tamanho, double peso, String porte, int capacidadePessoas) {
        this.id = id;
        this.registro = registro;
        this.cor = cor;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.peso = peso;
        this.porte = porte;
        this.capacidadePessoas = capacidadePessoas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public String voar(Combustivel gaspropano) {
        return "voando com " + gaspropano;
    }
}

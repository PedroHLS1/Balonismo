public class Balao {
    int id;
    String registro;
    String cor;
    String tipo;
    double tamanho;
    double peso;
    String porte;
    int capacidadePessoas;
    public String voar(Combustivel gaspropano) {
        return "voando com " + gaspropano;
    }
}

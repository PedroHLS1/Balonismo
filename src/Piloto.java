public class Piloto {
    String nome;
    int cpf;
    int anac;

    public Piloto() {
    }

    public Piloto(String nome, int cpf, int anac) {
        this.nome = nome;
        this.cpf = cpf;
        this.anac = anac;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getAnac() {
        return anac;
    }

    public void setAnac(int anac) {
        this.anac = anac;
    }
}

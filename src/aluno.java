public class aluno {
    private String nome;
    private String cpf;
    private int RA;
    private String data_nascimento;
    private String Sexo;

    public aluno(String nome, String cpf, int RA, String data_nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.RA = RA;
        this.data_nascimento = data_nascimento;

    }

    public aluno() {

    }

    // metodo Setter
    public void setNome(String entrada) {
        this.nome = entrada;

    }

    public void setcpf(String entrada) {
        this.nome = entrada;
    }

    // metodo Getter
    public int getRa() {
        return this.RA;
    }

    

}
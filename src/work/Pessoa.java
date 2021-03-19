package work;

class Pessoa {

    //Classe auxiliar para Aluno e Professor
    private String nome;
    private String data;
    private String user;
    private String senha;

    public Pessoa() {
    }

    public Pessoa(String nome, String data, String user, String senha) {
        this.nome = nome;
        this.data = data;
        this.user = user;
        this.senha = senha;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}

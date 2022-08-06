public class Operador {
    private String nome;
    private String identidade;
    private String codigo;
    private String descricao;

    public Operador(String nome, String identidade, String codigo, String descricao) {
        this.nome = nome;
        this.identidade = identidade;
        this.codigo = codigo;
        this.descricao = descricao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Operador{" +
                "nome='" + nome + '\'' +
                ", identidade='" + identidade + '\'' +
                ", codigo='" + codigo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }


}

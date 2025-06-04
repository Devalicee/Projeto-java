package br.com.alura.minhasmusicas;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public int setDescricao(String descricao) {
        this.descricao = descricao;
        return 0;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalDeCurtidas() > 5000) {
            return 10;
        } else {
            return 8;
        }

    }
}

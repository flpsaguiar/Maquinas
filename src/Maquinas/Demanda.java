package Maquinas;

/**
 * Created by Marcelo on 19/10/2014.
 */
public class Demanda {

    private int qtdDados;
    private char tamanho;
    private int tipo;
    private char marcacao;

    public Demanda()
    {
        this.qtdDados = 0;
        this.tamanho = 'X';
        this.tipo = 0;
        this.marcacao = 'X';
    }

    public void setDemanda(int qtdDados, char tamanho, int tipo, char marcacao){
        this.qtdDados = qtdDados;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.marcacao = marcacao;
    }

    public int getQtdDados() { return this.qtdDados; }

    public char getTamanho()
    {
        return this.tamanho;
    }

    public int getTipo() { return this.tipo; }

    public char getMarcacao()
    {
        return this.marcacao;
    }
}

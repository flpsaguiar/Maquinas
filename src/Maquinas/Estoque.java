package Maquinas;

/**
 * Created by Felipe Aguiar on 03/10/2014.
 */

public class Estoque
{
    Molde moldePequeno = new Molde(1);
    Molde moldeGrande = new Molde(2);
    Placa placa = new Placa();

    private char tamanho;
    private char qualidade;
    private char marcacao;

    public void setDemanda(char tamanho, char qualidade, char marcacao)
    {
        this.tamanho = tamanho;
        this.qualidade = qualidade;
        this.marcacao = marcacao;
    }

    public char getTamanho()
    {
        return this.tamanho;
    }

    public char getQualidade()
    {
        return this.qualidade;
    }

    public char getMarcacao()
    {
        return this.marcacao;
    }



}


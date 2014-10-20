package Maquinas;

/**
 * Created by Felipe Aguiar on 09/10/2014.
 */
public class MaqCorte extends Thread implements MaquinaCorte
{
    Estoque estoque;
    private int tipo;
    private char tamanho;
    private int idMaquina;

    public MaqCorte(Estoque estoque, int idMaquina)
    {
        this.estoque = estoque;
        this.tipo = estoque.demanda.getTipo();
        this.tamanho = estoque.demanda.getTamanho();
        this.idMaquina = idMaquina;
    }

    public void run()
    {
        if(this.tamanho == 'P')
        {

        }
        else if(this.tamanho == 'G')
        {

        }
    }






    public int producaoChapasSimples(int qtdeChapas, int tipo){
        return 1;
    }
    public int producaoChapasQualidade(int qtdeChapas, int tipo){
        return 1;
    }
    public int producaoChapasEspeciais(int qtdeChapas, int tipo){
        return 1;
    }



}

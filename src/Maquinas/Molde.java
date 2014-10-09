package Maquinas;

/**
 * Created by Felipe Aguiar on 06/10/2014.
 */
public class Molde
{
    final int PEQUENO = 1;
    final int GRANDE = 2;
    private int tamanho;
    private int quantidade;

    public Molde(int tamanho)
    {
        if(tamanho != 1 && tamanho != 2)
        {
            System.out.println("Tamanho incorreto.");
        }
        else
        {
            this.tamanho = tamanho;
        }
        this.quantidade = 0;
    }

    public int getTamanho()
    {
        return tamanho;
    }

    public synchronized void incQuantidade()
    {
        this.quantidade++;
    }

    public void decQuantidade()
    {
        this.quantidade--;
    }

    public int getQuantidade()
    {
        try{
            Thread.sleep(500);
        }
        catch (InterruptedException e){
        }
        return this.quantidade;
    }
}

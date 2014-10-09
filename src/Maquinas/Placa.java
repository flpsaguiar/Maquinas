package Maquinas;

/**
 * Created by Felipe Aguiar on 06/10/2014.
 */
public class Placa
{
    private int quantidade;
    public boolean available;

    public Placa()
    {
        this.quantidade = 0;
        this.available = true;
    }

    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
        //provavel notifyAll() para acordar as threads que estão aguardando placas.
    }

    public int getQuantidade()
    {
        return this.quantidade;
    }

    public synchronized int getPlaca()
    {
        while (this.available == false)
        {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        this.quantidade--;
        this.available = false;
        System.out.println("quantidade na classe: " + getQuantidade());
        this.available = true;
        notifyAll();
        return 1;
    }
}

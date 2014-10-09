package Maquinas;

/**
 *
 * @author rfilev
 * chapa - processa escreve molde em 5 segundos
 *  Molde Pequeno
    * Frills - 30 dados
    * LowQualoty - 20
    * Hybrid - 20
    * Differentiation - 10
    * Focused Differentiation 10
 * Molde Grande:
 *  metade da produção de moldes pequenos no mesmo tempo.
    *
 */
public interface MaquinaMolde
{
     public int moldePequeno(int qtdeChapas, int tipo);
     public int moldeGrande(int qtdeChapas, int tipo);//marca a chapa com modelo grande antes do corte
     //public int consultaCicloProducão();
}

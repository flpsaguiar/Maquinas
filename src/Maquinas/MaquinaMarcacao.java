/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Maquinas;

/**
 *
 * @author rfilev
 * marcacao - processa escreve cada dados em 0,5 segundos Dados neste tempo:
    * Frills
    * LowQuality
    * Hybrid
 * marcacao - processa escreve cada dados em 1,5 segundos Dados neste tempo:
    * Differentiation 
    * Focused Differentiation 
    *
 * marcacao de dados especial faz em 1s para qualquer tipo de dado.
 */
public interface MaquinaMarcacao
{
     public int marcaDadosRed(int cortes, int tipo);//marca o dado de vermelho na hora da produção
     public int marcaDadosBlack(int cortes, int tipo);//marca o dado de preto na hora da produção
     public int marcaDadosSpecial(int cortes, int tipo);//permite escolher a cor depois
     //public int consultaCicloProducão();
}

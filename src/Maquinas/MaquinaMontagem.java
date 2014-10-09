/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Maquinas;

/**
 *
 * @author rfilev
 */
public interface MaquinaMontagem
{
    /**
    * Faz a montagem (dobras finais dos dados)
    * O resultado deve ser colocado em um estoque
    * @param qtdeChapas - quantidade de chapas a serem dobradas
    *
    * Para cada tipo de dado
    * cada dado demora 0,5s para ser montado.
    */

    public int montagemDado(int qtdeChapas);
}

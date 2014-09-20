/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Daniel
 */
public class Cards {
    
    private int card;
    private int min = 1, max = 13;
    
    public int dealCard(){
        card = min+ (int)(Math.random()* max);
        return(card);
}
}
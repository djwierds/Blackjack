/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String draw, again = "Yes";
        int card1, card2, card3, cards = 0, Dcard1, Dcard2, Dcard3, Dcards = 0;
        int choice, choice2;
        
        // TODO code application lo10gic here
        
        Cards daniel = new Cards();
        Cards dealer = new Cards();
        
        
       while(again.equalsIgnoreCase("Yes")){
          card1 = daniel.dealCard();
          
          if (card1 == 1){
              System.out.println("You have drawn an Ace do you want a 1 or 11?");
              choice = input.nextInt();
              
               while( choice > 1 && choice < 11 || choice > 11){
                  System.out.println("Choice not Valid");
                  System.out.println("You have drawn an Ace do you want a 1 or 11?");
                  choice = input.nextInt();
              }
              
              if (choice == 1){
                  cards = cards + 1;
              } else if (choice == 11){
                   cards = cards + 11;
              } 
                 
                  
          } else if (card1 == 2){
              System.out.println("You have drawn a 2");
              cards = card1;
          } else if (card1 == 3){
              System.out.println("You have drawn a 3");
              cards = card1;
          } else if (card1 == 4){
              System.out.println("You have drawn a 4");
              cards = card1;
          } else if (card1 == 5){
              System.out.println("You have drawn a 5");
              cards = card1;
          } else if (card1 == 6){
              System.out.println("You have drawn a 6");
              cards = card1;
          } else if (card1 == 7){
              System.out.println("You have drawn a 7");
              cards = card1;
          } else if (card1 == 8){
              System.out.println("You have drawn a 8");
              cards = card1;
          } else if (card1 == 9){
              System.out.println("You have drawn a 9");
              cards = card1;
          } else if (card1 == 10){
              System.out.println("You have drawn a 10");
              cards = card1;
          } else if (card1 == 11){
              System.out.println("You have drawn a Jack");
              cards = card1;
          } else if (card1 == 12){
              System.out.println("You have drawn a Queen");
              cards = card1;
          } else if (card1 == 13){
              System.out.println("You have drawn a King");
              cards = card1;
          }
          
          card2 = daniel.dealCard();
          
          if (card2 == 1){
              System.out.println("You have drawn an Ace do you want a 1 or 11?");
              choice = input.nextInt();
              
             while( choice > 1 && choice < 11 || choice > 11){
                  System.out.println("Choice not Valid");
                  System.out.println("You have drawn an Ace do you want a 1 or 11?");
                  choice = input.nextInt();
              }
              
              if (choice == 1){
                  cards = cards + 1;
              } else if (choice == 11){
                   cards = cards + 11;
              } 
                           
          } else if (card2 == 2){
              System.out.println("You have drawn a 2");
              cards = cards  + card2;
          } else if (card2 == 3){
              System.out.println("You have drawn a 3");
              cards = cards + card2;
          } else if (card2 == 4){
              System.out.println("You have drawn a 4");
              cards = cards + card2;
          } else if (card2 == 5){
              System.out.println("You have drawn a 5");
              cards = cards + card2;
          } else if (card2 == 6){
              System.out.println("You have drawn a 6");
              cards = cards + card2;
          } else if (card2 == 7){
              System.out.println("You have drawn a 7");
              cards = cards + card2;
          } else if (card2 == 8){
              System.out.println("You have drawn a 8");
              cards = cards + card2;
          } else if (card2 == 9){
              System.out.println("You have drawn a 9");
              cards = cards + card2;
          } else if (card2 == 10){
              System.out.println("You have drawn a 10");
              cards = cards + card2;
          } else if (card2 == 11){
              System.out.println("You have drawn a Jack");
              cards = cards + card2;
          } else if (card2 == 12){
              System.out.println("You have drawn a Queen");
              cards = cards + card2;
          } else if (card2 == 13){
              System.out.println("You have drawn a King");
              cards = cards + card2;
          }
          
          if(cards > 21){
              System.out.println("You have more than 21 points. You BUST!");
              System.exit(0);
          } else {
         
            System.out.println("You have " + cards + " points. \nWould you like to draw another card? Yes or no.");
            draw = input.nextLine();
           
            if (draw.equalsIgnoreCase("yes")){
                
                
                card3 = daniel.dealCard();
                
                if (card3 == 1){
              System.out.println("You have drawn an Ace do you want a 1 or 11?");
              choice2 = input.nextInt();
              
             while( choice2 > 1 && choice2 < 11 || choice2 > 11){
                  System.out.println("Choice not Valid");
                  System.out.println("You have drawn an Ace do you want a 1 or 11?");
                  choice2 = input.nextInt();
              }
              
              if (choice2 == 1){
                  cards = cards + 1;
              } else if (choice2 == 11){
                   cards = cards + 11;
              } 
                           
          } else if (card3 == 2){
              System.out.println("You have drawn a 2");
              cards = cards  + card3;
          } else if (card3 == 3){
              System.out.println("You have drawn a 3");
              cards = cards + card3;
          } else if (card3 == 4){
              System.out.println("You have drawn a 4");
              cards = cards + card3;
          } else if (card3 == 5){
              System.out.println("You have drawn a 5");
              cards = cards + card3;
          } else if (card3 == 6){
              System.out.println("You have drawn a 6");
              cards = cards + card3;
          } else if (card3 == 7){
              System.out.println("You have drawn a 7");
              cards = cards + card3;
          } else if (card3 == 8){
              System.out.println("You have drawn a 8");
              cards = cards + card3;
          } else if (card3 == 9){
              System.out.println("You have drawn a 9");
              cards = cards + card3;
          } else if (card3 == 10){
              System.out.println("You have drawn a 10");
              cards = cards + card3;
          } else if (card3 == 11){
              System.out.println("You have drawn a Jack");
              cards = cards + card3;
          } else if (card3 == 12){
              System.out.println("You have drawn a Queen");
              cards = cards + card3;
          } else if (card3 == 13){
              System.out.println("You have drawn a King");
              cards = cards + card3;
          }
          
                
                
                if(cards > 21){
                    System.out.println("You have " + cards + " points. You Bust!\n");
                    System.exit(0);
                } else {
                    System.out.println("You have " + cards + " points.\n");
                }
                
          }  else if (draw.equalsIgnoreCase("No")){
              
          } else {
                 while(!draw.equalsIgnoreCase("Yes")){
                  System.out.println("Choice not Valid");
                  System.out.println("Would you like to draw another card? Yes or no.");
                  draw = input.nextLine();
              }
                 
                 card3 = daniel.dealCard();
                
                if (card3 == 1){
              System.out.println("You have drawn an Ace do you want a 1 or 11?");
              choice2 = input.nextInt();
              
             while( choice2 > 1 && choice2 < 11 || choice2 > 11){
                  System.out.println("Choice not Valid");
                  System.out.println("You have drawn an Ace do you want a 1 or 11?");
                  choice2 = input.nextInt();
              }
              
              if (choice2 == 1){
                  cards = cards + 1;
              } else if (choice2 == 11){
                   cards = cards + 11;
              } 
                           
          } else if (card3 == 2){
              System.out.println("You have drawn a 2");
              cards = cards  + card3;
          } else if (card3 == 3){
              System.out.println("You have drawn a 3");
              cards = cards + card3;
          } else if (card3 == 4){
              System.out.println("You have drawn a 4");
              cards = cards + card3;
          } else if (card3 == 5){
              System.out.println("You have drawn a 5");
              cards = cards + card3;
          } else if (card3 == 6){
              System.out.println("You have drawn a 6");
              cards = cards + card3;
          } else if (card3 == 7){
              System.out.println("You have drawn a 7");
              cards = cards + card3;
          } else if (card3 == 8){
              System.out.println("You have drawn a 8");
              cards = cards + card3;
          } else if (card3 == 9){
              System.out.println("You have drawn a 9");
              cards = cards + card3;
          } else if (card3 == 10){
              System.out.println("You have drawn a 10");
              cards = cards + card3;
          } else if (card3 == 11){
              System.out.println("You have drawn a Jack");
              cards = cards + card3;
          } else if (card3 == 12){
              System.out.println("You have drawn a Queen");
              cards = cards + card3;
          } else if (card3 == 13){
              System.out.println("You have drawn a King");
              cards = cards + card3;
          }
          
                
                
                if(cards > 21){
                    System.out.println("You have " + cards + " points. You Bust!\n");
                    System.exit(0);
                } else {
                    System.out.println("You have " + cards + " points.\n");
                }
                
          }
            
            
            
          Dcard1 = dealer.dealCard();
          
          if (Dcard1 == 1){
              
              if(Dcards <= 10){
              System.out.println("The Dealer has drawn an Ace. It's value is 11");
              }
              
              if( Dcards > 10){
                  System.out.println("The Dealer's Ace has a value of one.");
              }
              
              if (Dcards <=10){
                  Dcards = Dcards + 11;
              } else if (Dcards > 10){
                  Dcards = Dcards + 11;
              } 
                 
                  
          } else if (Dcard1 == 2){
              System.out.println("The Dealer has drawn a 2.");
              Dcards = Dcard1;
          } else if (Dcard1 == 3){
              System.out.println("The Dealer has drawn a 3.");
              Dcards = Dcard1;
          } else if (Dcard1 == 4){
              System.out.println("The Dealer has drawn a 4.");
              Dcards = Dcard1;
          } else if (Dcard1 == 5){
              System.out.println("The Dealer has drawn a 5.");
              Dcards = Dcard1;
          } else if (Dcard1 == 6){
              System.out.println("The Dealer has drawn a 6.");
              Dcards = Dcard1;
          } else if (Dcard1 == 7){
              System.out.println("The Dealer has drawn a 7.");
              Dcards = Dcard1;
          } else if (Dcard1 == 8){
              System.out.println("The Dealer has drawn a 8.");
              Dcards = Dcard1;
          } else if (Dcard1 == 9){
              System.out.println("The Dealer has drawn a 9.");
              Dcards = Dcard1;
          } else if (Dcard1 == 10){
              System.out.println("The Dealer has drawn a 10.");
              Dcards = Dcard1;
          } else if (Dcard1 == 11){
              System.out.println("The Dealer has drawn a Jack.");
              Dcards = Dcard1;
          } else if (Dcard1 == 12){
              System.out.println("The Dealer has drawn a Queen.");
              Dcards = Dcard1;
          } else if (Dcard1 == 13){
              System.out.println("The Dealer has drawn a King.");
              Dcards = Dcard1;
          }
          
          Dcard2 = dealer.dealCard();
          
          if (Dcard2 == 1){
              
              if(Dcards <= 10){
              System.out.println("The Dealer has drawn an Ace. It's value is 11");
              }
              
              if( Dcards > 10){
                  System.out.println("The Dealer's Ace has a value of one.");
              }
              
              if (Dcards <=10){
                  Dcards = Dcards + 11;
              } else if (Dcards > 10){
                  Dcards = Dcards + 11;
              } 
                           
          } else if (card2 == 2){
              System.out.println("The Dealer has drawn a 2.");
              Dcards = Dcards  + Dcard2;
          } else if (Dcard2 == 3){
              System.out.println("The Dealer has drawn a 3.");
              Dcards = Dcards + Dcard2;
          } else if (Dcard2 == 4){
              System.out.println("The Dealer has drawn a 4.");
              Dcards = Dcards + Dcard2;
          } else if (Dcard2 == 5){
              System.out.println("The Dealer has drawn a 5.");
              Dcards = Dcards + Dcard2;
          } else if (Dcard2 == 6){
              System.out.println("The Dealer has drawn a 6.");
              Dcards = Dcards + Dcard2;
          } else if (Dcard2 == 7){
              System.out.println("The Dealer has drawn a 7.");
              Dcards = Dcards + Dcard2;
          } else if (Dcard2 == 8){
              System.out.println("The Dealer has drawn a 8.");
              Dcards = Dcards + Dcard2;
          } else if (Dcard2 == 9){
              System.out.println("The Dealer has drawn a 9.");
              Dcards = Dcards + Dcard2;
          } else if (Dcard2 == 10){
              System.out.println("The Dealer has drawn a 10.");
              Dcards = Dcards + Dcard2;
          } else if (Dcard2 == 11){
              System.out.println("The Dealer has drawn a Jack.");
              Dcards = Dcards + Dcard2;
          } else if (Dcard2 == 12){
              System.out.println("The Dealer has drawn a Queen.");
              Dcards = Dcards + Dcard2;
          } else if (Dcard2 == 13){
              System.out.println("The Dealer has drawn a King.");
              Dcards = Dcards + Dcard2;
          }
          
          if (Dcards <= 15){
              
          
          
          Dcard3 = dealer.dealCard();
          
          if (Dcard3 == 1){
              
                  System.out.println("The Dealer's Ace has a value of one.");
              
              
             
                  Dcards = Dcards + 1;
              
                           
          } else if (Dcard3 == 2){
              System.out.println("The Dealer has drawn a 2.");
              Dcards = Dcards  + Dcard3;
          } else if (Dcard3 == 3){
              System.out.println("The Dealer has drawn a 3.");
              Dcards = Dcards + Dcard3;
          } else if (Dcard3 == 4){
              System.out.println("The Dealer has drawn a 4.");
              Dcards = Dcards + Dcard3;
          } else if (Dcard3 == 5){
              System.out.println("The Dealer has drawn a 5.");
              Dcards = Dcards + Dcard3;
          } else if (Dcard3 == 6){
              System.out.println("The Dealer has drawn a 6.");
              Dcards = Dcards + Dcard3;
          } else if (Dcard3 == 7){
              System.out.println("The Dealer has drawn a 7.");
              Dcards = Dcards + Dcard3;
          } else if (Dcard3 == 8){
              System.out.println("The Dealer has drawn a 8.");
              Dcards = Dcards + Dcard3;
          } else if (Dcard3 == 9){
              System.out.println("The Dealer has drawn a 9.");
              Dcards = Dcards + Dcard3;
          } else if (Dcard3 == 10){
              System.out.println("The Dealer has drawn a 10.");
              Dcards = Dcards + Dcard3;
          } else if (Dcard3 == 11){
              System.out.println("The Dealer has drawn a Jack.");
              Dcards = Dcards + Dcard3;
          } else if (Dcard3 == 12){
              System.out.println("The Dealer has drawn a Queen.");
              Dcards = Dcards + Dcard3;
          } else if (Dcard3 == 13){
              System.out.println("The Dealer has drawn a King.");
              Dcards = Dcards + Dcard3;
          }
          }
          
          System.out.println("The Dealer has " + Dcards + " points");
          
           if(cards > Dcards && cards <= 21){
              System.out.println("You have more points than dealer. You win!");
          } else if (cards > Dcards && cards > 21){
              System.out.println("Your cards exceed 21. You BUST!");
          } else if (cards == Dcards){
            System.out.println("You tied the dealer. Dealer Wins.");  
          } else if (Dcards > cards && Dcards <= 21){
              System.out.println("The Dealer has more points than you. You Lose.");
          } else if (Dcards > cards && Dcards > 21){
              System.out.println("The Dealer's cards exceed 21. You Win!");
          }
         
          }
       
          System.out.println("Would you like to play again? Yes or No");
          again = input.nextLine();
          if(again.equalsIgnoreCase("No")){
              System.exit(0);
          } else if (!again.equalsIgnoreCase("Yes")){
              System.out.println("Not valid answer");
              System.out.println("Would you like to play again? Yes or No");
              again = input.nextLine();
          }
       }
    }
    
}

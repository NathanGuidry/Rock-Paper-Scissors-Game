/*
 * P. Cochran and N. Guidry
 *Rock paper scissors game where the computer goes against the user
 *2/24/22
 */

import java.util.*;
import javax.swing.*;
public class RockPaperScissorsGame 
{
    public static void main(String[] args) 
    {
  
        JOptionPane.showMessageDialog(null, "Welcome!\n"
                + " In this game you will be picking between three choices\n"
                + " against a computer's choice in three games of \"Rock, Paper, Scissors\"\n\n"
                + "Please press \"OK\" to continue.",
                "Rock, Paper, Scissors   "
                + "        P. Cochran and N. Guidry", 1);

        
        int num_of_games = 0;
        int tie_count = 0;
        int win_count = 0;
        int loss_count = 0;
        
        ImageIcon scissorOverPaper = new ImageIcon("scissorCutPaper.png");
        ImageIcon rockOverScissors = new ImageIcon("rockCrushScissor.png");
        ImageIcon paperOverRock = new ImageIcon("paperWrapsRock.png");
        ImageIcon endOrTie = new ImageIcon ("RPS2.png");
        
        while(num_of_games != 3){
        

        ImageIcon icon = new ImageIcon("RPS.png");
        String prompt = "Please click on one of\n"
                + " the following buttons\n"
                + " corresponding to your play\n";
        String[] choices = {"Scissors", "Paper", "Rock"};
        
        int choice = JOptionPane.showOptionDialog(null, prompt, "Play \"Rock,"
            + "Paper, Scissors\"                    P. Cochran and N. Guidry",
            0, 0, icon, choices, choices[0]);
        
        String player_choice = "";
        String computer_choice = "";
        

        switch (choice)
        {
            case 2:
                player_choice = "\"Rock\"";
                break;
            case 1:
                player_choice = "\"Paper\"";
                break;
            case 0:
                player_choice = "\"Scissors\"";
                break;
        }
        String resultsAccumulator = "You played "+player_choice+"\n";
        

        Random randGen = new Random();
        int computer_choice_before = randGen.nextInt(3);
        
        
        switch(computer_choice_before)
        {
            case 2:
                computer_choice = "\"Rock\"";
                break;
            case 1:
                computer_choice = "\"Paper\"";
                break;
            case 0:
                computer_choice = "\"Scissors\"";
                break;
        }
        resultsAccumulator += "The computer played " + computer_choice + "\n";
        
        
        if(computer_choice.equals(player_choice))
        {
            resultsAccumulator += "It's a tie!\n" + "No one won!";
            
            JOptionPane.showMessageDialog(null, resultsAccumulator, "Rock,"
            + "Paper, Scissors              P. Cochran and N. Guidry", 0, endOrTie);
            
            tie_count ++;
        }
        else if(computer_choice.equals("\"Rock\"") && player_choice.equals("\"Paper\""))
        {
            resultsAccumulator += "Paper wraps rock!\n" + "You win!";
            
            JOptionPane.showMessageDialog(null, resultsAccumulator, "Rock,"
            + "Paper, Scissors                    P. Cochran and N. Guidry", 0,
            paperOverRock);
            
            win_count ++;
        }
        else if(computer_choice.equals("\"Rock\"") && player_choice.equals("\"Scissors\""))
        {
            resultsAccumulator += "Rock crushes scissors!\n" + "You lose!";
            
            JOptionPane.showMessageDialog(null, resultsAccumulator, "Rock,"
            + "Paper, Scissors                    P. Cochran and N. Guidry", 0,
            rockOverScissors);
            
            loss_count ++;
        }
        else if(computer_choice.equals("\"Paper\"") && player_choice.equals("\"Rock\""))
        {
            resultsAccumulator += "Paper wraps rock!\n" + "You lose!";
            
            JOptionPane.showMessageDialog(null, resultsAccumulator, "Rock,"
            + "Paper, Scissors                    P. Cochran and N. Guidry", 0,
            paperOverRock);
            
            loss_count ++;
        }
        else if(computer_choice.equals("\"Paper\"") && player_choice.equals("\"Scissors\""))
        {
            resultsAccumulator += "Scissors cuts paper!\n" + "You win!";
            
            JOptionPane.showMessageDialog(null, resultsAccumulator, "Rock,"
            + "Paper, Scissors                    P. Cochran and N. Guidry", 0,
            scissorOverPaper);
            
            win_count ++;
        }
        else if(computer_choice.equals("\"Scissors\"") && player_choice.equals("\"Rock\""))
        {
            resultsAccumulator += "Rock crushes scissors!\n" + "You win!";
            
            JOptionPane.showMessageDialog(null, resultsAccumulator, "Rock,"
            + "Paper, Scissors                    P. Cochran and N. Guidry", 0,
            rockOverScissors);
            
            win_count ++;
        }
        else if(computer_choice.equals("\"Scissors\"") && player_choice.equals("\"Paper\""))
        {
            resultsAccumulator += "Scissors cuts paper!\n" + "You lose!";
            
            JOptionPane.showMessageDialog(null, resultsAccumulator, "Rock,"
            + "Paper, Scissors                    P. Cochran and N. Guidry", 0,
            scissorOverPaper);
            
            loss_count ++;
        }
        num_of_games ++;
        }

        
        String finalResults = "Final scoreboard for 3 games\n"
                + "Wins: " + win_count + "\n" + "Losses: " + loss_count +
                "\n" + "Ties: " + tie_count;
        
        JOptionPane.showMessageDialog(null, finalResults, "Rock,"
            + "Paper, Scissors             P. Cochran and N. Guidry", 0,
            endOrTie);
        
        //step 11 - Termination
        String terminationMessage = "Thank you for playing,\n"
                + " this game will now terminate.";
        
        JOptionPane.showMessageDialog(null, terminationMessage, "End Game"
                + "        P.Cochran and N. Guidry", 1);
    }
}

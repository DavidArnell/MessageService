/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author darnell
 */
public class DailyJoke implements MessageControl {
    private String dailyJoke;
    
    @Override
    public void messageInput(String joke) {
        dailyJoke=joke;
    }

    @Override
    public String messageOutput() {
       return dailyJoke = "What happens to a frog's car when it breaks down?\n" +
                "It gets toad away.";
    }
    
}

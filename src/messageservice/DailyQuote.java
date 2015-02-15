package messageservice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author darnell
 */
public class DailyQuote implements MessageControl{
    private String dailyQuote;
    
    @Override
    public void messageInput(String quote) {
        dailyQuote=quote;
    }

    @Override
    public String messageOutput() {
       return dailyQuote = "Go to Heaven for the climate, Hell for the company.\n\t-Mark Twain";

    }
    
}

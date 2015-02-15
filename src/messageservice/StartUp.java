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
public class StartUp {
    public static void main(String[] args){
        MessageService messeger = new MessageService(new DailyQuote()) ;
        System.out.println(messeger.getMessage());
    }
}


package messageservice;

public class MessageService {
    MessageControl messenger;

    public MessageService(MessageControl messenger) {
       this.messenger = messenger;
    }
    
    public MessageService(){
        
    }
    
    public void setMessenger(MessageControl messenger){
        this.messenger = messenger;
    }
    
    public String getMessage(){
        //messenger.messageInput(message);
        return messenger.messageOutput();
    }
    
}

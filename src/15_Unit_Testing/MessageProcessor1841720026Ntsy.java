package unittest;

public class MessageProcessor1841720026Ntsy {

    private String mSender, mRecipient, mMessage;

    public String getMessage() {
        return mMessage;
    }

    public String getRecipient() {
        return mRecipient;
    }

    public String getSender() {
        return mSender;
    }

    public void setMessage(String message) {
        this.mMessage = message;
    }

    public void setRecipient(String recipient) {
        this.mRecipient = recipient;
    }

    public void setSender(String sender) {
        this.mSender = sender;
    }

    public String messageFormat() {
        String message = String.format("Hai %s, you have message from %s. "
                + "\nThe message as follows : %s", this.mRecipient, this.mSender, this.mMessage);
        return message;
    }

    public void showMessage() {
        System.out.println(messageFormat());
    }
}

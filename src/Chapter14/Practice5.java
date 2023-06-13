package Chapter14;

public class Practice5 {
    public static void main(String[] args) {
        SMS m1 = new SMS("010-555-2111", "010-555-1111", "Hi", "03:10");
        SMS m2 = new SMS("010-555-1111", "010-555-2111");
        m2.setTime("03:11");
        m2.setMsgText("Hm..");
        m1.print();
        System.out.println("=====================================");
        m2.print();
    }
}

class SMS {
    private String sender;
    private String receiver;
    private String time;
    private String msg_text;

    public SMS(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public SMS(String sender, String receiver, String time, String msg_text) {
        this.sender = sender;
        this.receiver = receiver;
        this.time = time;
        this.msg_text = msg_text;
    }

    public void print() {
        System.out.println("송신자 : " + this.sender + "\n시각 : " + this.time + "\n메시지 : " + this.msg_text);
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMsgText() {
        return msg_text;
    }

    public void setMsgText(String msg_text) {
        this.msg_text = msg_text;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}


package Chapter12;

public class Assignment3 {
    public static void main(String[] args) {
        Television TV = new Television();
        TV.turnOn();
        TV.setChannel(777);
        TV.setVolume(77);

        System.out.println(TV);
    }
}

class Television {
    private boolean isOn;
    private int volume;
    private int channel;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public String toString() {
        return "isOn : " + this.isOn + "\nvolume : " + this.volume + "\nchannel : " + this.channel;
    }
}

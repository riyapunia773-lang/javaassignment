
public class television{
    private boolean isOn;
    private int channel;

    public television() {
        isOn = false;
        channel = 1;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setChannel(int newChannel) {
        if (isOn && newChannel >= 1 && newChannel <= 10) {
            channel = newChannel;
        }
    }

    public int getChannel() {
        return channel;
    }
}

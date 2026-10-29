
public class televisionviewer {
    public static void main(String[] args) {
        television television = new television();
        int channel = 1;

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);
            television.turnOn();

            int numberOfChannels;

            if (day % 2 == 1) {
                numberOfChannels = 3;
            } else {
                numberOfChannels = 4;
            }

            for (int i = 0; i < numberOfChannels; i++) {
                television.setChannel(channel);
                System.out.println("Watching channel "
                        + television.getChannel());

                channel = channel + 1;

                if (channel > 10) {
                    channel = 1;
                }
            }

            television.turnOff();
            System.out.println("Falling asleep");
        }
    }
}

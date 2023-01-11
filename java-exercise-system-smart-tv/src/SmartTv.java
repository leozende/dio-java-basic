public class SmartTv {
    boolean on = !turn();
    int channel = 1;
    int volume = 25;

    public boolean turn(){
        return on = !on;
    }

    public void volumeUp(){
        System.out.println("Volume Change: " + ++volume);
    }

    public void volumeDown(){
        System.out.println("Volume Change: " + --volume);
    }

    public void increaseChannel(){
        System.out.println("Channel Change: " + ++channel);
    }

    public void decreaseChannel(){
        System.out.println("Channel Change: " + --channel);
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
        System.out.println("Channel Change: " + channel);
    }

}

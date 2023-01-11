public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV On ? " + smartTv.on);
        System.out.println("Current Channel : " + smartTv.channel);
        System.out.println("Current Volume : " + smartTv.volume);

        smartTv.turn();
        System.out.println("New State -> TV On ? " + smartTv.on);

        smartTv.turn();
        System.out.println("New State -> TV On ? " + smartTv.on);

        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.volumeUp();

        smartTv.increaseChannel();
        smartTv.increaseChannel();
        smartTv.increaseChannel();
        smartTv.changeChannel(13);
        smartTv.increaseChannel();
        smartTv.increaseChannel();
        smartTv.increaseChannel();
        smartTv.decreaseChannel();
        

    }
}

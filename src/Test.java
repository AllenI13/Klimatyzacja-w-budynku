public class Test {
    public static void main(String[] args) {
        Room room = new Room(10, true, 30.3, 500);
        Room room1 = new Room(10, true, 40.3, 505);
        AirConditioner airConditioner = new AirConditioner(30, true);
        AirConditioner airConditioner1 = new AirConditioner(40, false);
        airConditioner.coolTemperature(airConditioner,room);
        airConditioner.coolTemperature(airConditioner1,room1);
        System.out.printf("%.1f%n", room.getActualTemperature());
        System.out.printf("%.1f%n", room1.getActualTemperature());
        airConditioner.coolTemperature(airConditioner,room);
        airConditioner.coolTemperature(airConditioner1,room1);
        airConditioner.coolTemperature(airConditioner,room);
        airConditioner.coolTemperature(airConditioner1,room1);
        System.out.printf("%.1f%n", room.getActualTemperature());
        System.out.printf("%.1f%n", room1.getActualTemperature());
    }
}

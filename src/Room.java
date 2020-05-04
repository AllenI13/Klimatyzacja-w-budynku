public class Room {
    private int squareMetrage;
    private boolean airConditioner;
    private double actualTemperature;
    private int roomNumber;

    public Room(int squareMetrage, boolean airConditioner, double actualTemperature, int roomNumber) {
        this.squareMetrage = squareMetrage;
        this.airConditioner = airConditioner;
        this.actualTemperature = actualTemperature;
        this.roomNumber = roomNumber;
    }

    public int getSquareMetrage() {
        return squareMetrage;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public double getActualTemperature() {
        return actualTemperature;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setActualTemperature(double actualTemperature) {
        this.actualTemperature = actualTemperature;
    }
}

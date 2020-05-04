import java.math.BigDecimal;
import java.text.NumberFormat;

public class AirConditioner {
    private double setTemperature;
    private boolean pro;

    public AirConditioner(double setTemperature, boolean pro) {
        this.setTemperature = setTemperature;
        this.pro = pro;
    }

    public double getSetTemperature() {
        return setTemperature;
    }

    public boolean isPro() {
        return pro;
    }

    public void coolTemperature(AirConditioner airConditioner, Room room) {
        if (room.isAirConditioner()) {

            if (room.getActualTemperature() > airConditioner.setTemperature && airConditioner.pro) {
                room.setActualTemperature(room.getActualTemperature() - (room.getSquareMetrage() * 0.02));

            } else if (room.getActualTemperature() > airConditioner.setTemperature) {
                room.setActualTemperature(room.getActualTemperature() - (room.getSquareMetrage() * 0.01));
            } else {
                System.out.println("osiagnieto wartosc");
            }
        }

        if(room.getActualTemperature()<airConditioner.setTemperature){
            room.setActualTemperature(airConditioner.setTemperature);

        }
    }

}





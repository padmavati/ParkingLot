package module;


public class ParkingLot {

    private static int noOfSlots;

    private static String createParkingLotCommand = "create_parking_lot";

    public void createParkingLot(String create_parking_lot, int noOfSlots) {

        if(ParkingLot.noOfSlots == 0 && create_parking_lot.equals(createParkingLotCommand) && noOfSlots > 0){

            ParkingLot.noOfSlots = noOfSlots;
            System.out.printf("Created parking lot with %d slots\n", ParkingLot.noOfSlots);
        }
        else {
            System.out.println("Something wrong in the command, unable to allocate slots");
        }

    }

    public int getNoOfSlots(){
        return ParkingLot.noOfSlots;
    }
}

package module;

import junit.framework.TestCase;



public class ParkingLotTest extends TestCase {

    private ParkingLot parkingLot = new ParkingLot();

    public void testShouldNotCreateParkingLotIfTheCommandIsNotCreateParkingLot() throws Exception {

        parkingLot.createParkingLot("createParkingLot",6);

        assertEquals(0, parkingLot.getNoOfSlots());
    }

    public void testShouldNotCreateParkingLotIfNoOfSlotsIsLessThanOne() throws Exception {

        parkingLot.createParkingLot("create_parking_lot",-1);

        assertEquals(0, parkingLot.getNoOfSlots());
    }

    public void testCreateAParkingLot() throws Exception {

        parkingLot.createParkingLot("create_parking_lot", 6);

        assertEquals(6, parkingLot.getNoOfSlots());

    }

    public void testShouldNotAllotSlotMultipleTimes() throws Exception {

        parkingLot.createParkingLot("create_parking_lot",8);

        assertEquals(6, parkingLot.getNoOfSlots());

    }
}
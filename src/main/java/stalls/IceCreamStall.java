package stalls;

import behaviours.IReviewed;
import stalls.ParkingSpot;
import stalls.Stall;

public class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

}
package com.ms.parkingcontrol.adapters.in.parkingmanagement.config;

public class ConflictParkingSpotException extends RuntimeException {
    public ConflictParkingSpotException(String message) {
        super(message);
    }

    public ConflictParkingSpotException(String message, Throwable cause) {
        super(message, cause);
    }
}

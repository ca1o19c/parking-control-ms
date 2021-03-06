package com.ms.parkingcontrol.domain.parkingmanagement;

import java.util.List;

public class FilteredParkingSpot {

    private Integer total;

    private Integer totalPages;

    private List<ParkingSpot> parkingSpots;

    public Integer getTotalPages() {
        return totalPages;
    }

    public Integer getTotal() {
        return total;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private Integer total;

        private Integer totalPages;

        private List<ParkingSpot> parkingSpots;

        public Builder withTotal(Integer total) {
            this.total = total;
            return this;
        }

        public Builder withTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public Builder withParkingSpots(List<ParkingSpot> parkingSpots) {
            this.parkingSpots = parkingSpots;
            return this;
        }

        public FilteredParkingSpot build() {
            FilteredParkingSpot filteredParkingSpot = new FilteredParkingSpot();
            filteredParkingSpot.parkingSpots = this.parkingSpots;
            filteredParkingSpot.total = this.total;
            filteredParkingSpot.totalPages = this.totalPages;
            return filteredParkingSpot;
        }
    }
}

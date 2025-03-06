public class Route {
    private String startAddress;
    private String destinationAddress;
    private int tripPrice;

    public Route(String startAddress, String destinationAddress, int tripPrice) {
        this.startAddress = startAddress;
        this.destinationAddress = destinationAddress;
        this.tripPrice = tripPrice;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }

    @Override
    public String toString() {
        return "Route{" +
                "startAddress='" + startAddress + '\'' +
                ", destinationAddress='" + destinationAddress + '\'' +
                ", tripPrice=" + tripPrice +
                '}';
    }
}

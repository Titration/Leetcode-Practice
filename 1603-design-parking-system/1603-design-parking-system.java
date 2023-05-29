class ParkingSystem {

    int big = 0;
    int medium = 0;
    int small = 0;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        boolean isAvailable = false;
        if (carType == 1) {
            if (big - 1 < 0) {
                isAvailable = false;
            }
            else {
                big--;
                isAvailable = true;
            }
        }
        else if (carType == 2) {
            if (medium - 1 < 0) {
                isAvailable = false;
            }
            else {
                medium--;
                isAvailable = true;
            }
        }
        else {
            if (small - 1 < 0) {
                isAvailable = false;
            }
            else {
                small--;
                isAvailable = true;
            }
        }
        return isAvailable;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
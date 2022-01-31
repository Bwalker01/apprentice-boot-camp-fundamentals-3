package tax;

public class DefaultTaxCalculator extends TaxCalculator {
    public DefaultTaxCalculator() {
        super();
    }

    public DefaultTaxCalculator(int year) {
        super(year);
    }

    @Override
    int calculateTax(Vehicle vehicle) {
        int o2Emis = vehicle.getCo2Emissions();

        if (vehicle.getFuelType() == FuelType.PETROL) {
            if (o2Emis == 0) {
                return 0;
            } else if (o2Emis <= 50) {
                return 10;
            } else if (o2Emis <= 75) {
                return 25;
            } else if (o2Emis <= 90) {
                return 105;
            } else if (o2Emis <= 100) {
                return 125;
            } else if (o2Emis <= 110) {
                return 145;
            } else if (o2Emis <= 130) {
                return 165;
            } else if (o2Emis <= 150) {
                return 205;
            } else if (o2Emis <= 170) {
                return 515;
            } else if (o2Emis <= 190) {
                return 830;
            } else if (o2Emis <= 225) {
                return 1240;
            } else if (o2Emis <= 255) {
                return 1760;
            } else {
                return 2070;
            }
        }

        if(vehicle.getFuelType() == FuelType.DIESEL) {
            if (o2Emis == 0) {
                return 0;
            } else if (o2Emis <= 50) {
                return 25;
            } else if (o2Emis <= 75) {
                return 105;
            } else if (o2Emis <= 90) {
                return 125;
            } else if (o2Emis <= 100) {
                return 145;
            } else if (o2Emis <= 110) {
                return 165;
            } else if (o2Emis <= 130) {
                return 205;
            } else if (o2Emis <= 150) {
                return 515;
            } else if (o2Emis <= 170) {
                return 830;
            } else if (o2Emis <= 190) {
                return 1240;
            } else if (o2Emis <= 225) {
                return 1760;
            } else if (o2Emis <= 255) {
                return 2070;
            } else if (o2Emis >= 255) {
                return 2070;
            }

        }
        return o2Emis;
    }
}

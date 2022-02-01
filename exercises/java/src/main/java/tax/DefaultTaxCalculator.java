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

        switch (vehicle.getFuelType()) {
            case PETROL:
                return petrolTax(o2Emis);
            case DIESEL:
                return dieselTax(o2Emis);
            case ALTERNATIVE_FUEL:
                return altTax(o2Emis);
            default:
                return 0;
        }
    }

    // test comment to create a conflict
    private int altTax(int o2Emis) {
        if (o2Emis <= 50) {
            return 0;
        }
        if (o2Emis <= 75) {
            return 15;
        }
        if (o2Emis <= 90) {
            return 95;
        }
        if (o2Emis <= 100) {
            return 115;
        }
        if (o2Emis <= 110) {
            return 135;
        }
        if (o2Emis <= 130) {
            return 155;
        }
        if (o2Emis <= 150) {
            return 195;
        }
        if (o2Emis <= 170) {
            return 505;
        }
        if (o2Emis <= 190) {
            return 820;
        }
        if (o2Emis <= 225) {
            return 1230;
        }
        if (o2Emis <= 255) {
            return 1750;
        }
        return 2060;
    }

    private int dieselTax(int o2Emis) {
        if (o2Emis == 0) {
            return 0;
        }
        if (o2Emis <= 50) {
            return 25;
        }
        if (o2Emis <= 75) {
            return 105;
        }
        if (o2Emis <= 90) {
            return 125;
        }
        if (o2Emis <= 100) {
            return 145;
        }
        if (o2Emis <= 110) {
            return 165;
        }
        if (o2Emis <= 130) {
            return 205;
        }
        if (o2Emis <= 150) {
            return 515;
        }
        if (o2Emis <= 170) {
            return 830;
        }
        if (o2Emis <= 190) {
            return 1240;
        }
        if (o2Emis <= 225) {
            return 1760;
        }
        if (o2Emis <= 255) {
            return 2070;
        }
        return 2070;
    }

    private int petrolTax(int o2Emis) {
        if (o2Emis == 0) {
            return 0;
        }
        if (o2Emis <= 50) {
            return 10;
        }
        if (o2Emis <= 75) {
            return 25;
        }
        if (o2Emis <= 90) {
            return 105;
        }
        if (o2Emis <= 100) {
            return 125;
        }
        if (o2Emis <= 110) {
            return 145;
        }
        if (o2Emis <= 130) {
            return 165;
        }
        if (o2Emis <= 150) {
            return 205;
        }
        if (o2Emis <= 170) {
            return 515;
        }
        if (o2Emis <= 190) {
            return 830;
        }
        if (o2Emis <= 225) {
            return 1240;
        }
        if (o2Emis <= 255) {
            return 1760;
        }
        return 2070;
    }
}

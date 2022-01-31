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

    private int altTax(int o2Emis) {
        if (o2Emis <= 50) {
            return 0;
        } else if (o2Emis <= 75) {
            return 15;
        } else if (o2Emis <= 90) {
            return 95;
        } else if (o2Emis <= 100) {
            return 115;
        } else if (o2Emis <= 110) {
            return 135;
        } else if (o2Emis <= 130) {
            return 155;
        } else if (o2Emis <= 150) {
            return 195;
        } else if (o2Emis <= 170) {
            return 505;
        } else if (o2Emis <= 190) {
            return 820;
        } else if (o2Emis <= 225) {
            return 1230;
        } else if (o2Emis <= 255) {
            return 1750;
        } else {
            return 2060;
        }
    }

    private int dieselTax(int o2Emis) {
        return 0;
    }

    private int petrolTax(int o2Emis) {
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
}

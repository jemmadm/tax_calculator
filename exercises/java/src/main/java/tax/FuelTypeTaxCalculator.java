package tax;

public class FuelTypeTaxCalculator extends TaxCalculator {

    public int calculateTax(Vehicle vehicle) {
        int co2Emissions = vehicle.getCo2Emissions();
        if (vehicle.getFuelType() == FuelType.PETROL) {
            return petrolRates(co2Emissions);
        } else if (vehicle.getFuelType() == FuelType.DIESEL) {
            return dieselRates(co2Emissions);
        } else if (vehicle.getFuelType() == FuelType.ALTERNATIVE_FUEL) {
            return alternativeFuelRates(co2Emissions);
        }
        return 0;
    }

    private int alternativeFuelRates(int co2Emissions) {
        if (co2Emissions <= 50) {
            return 0;
        } else if (co2Emissions <= 75) {
            return 15;
        } else if (co2Emissions <= 90) {
            return 95;
        } else if (co2Emissions <= 100) {
            return 115;
        } else if (co2Emissions <= 110) {
            return 135;
        } else if (co2Emissions <= 130) {
            return 155;
        } else if (co2Emissions <= 150) {
            return 195;
        } else if (co2Emissions <= 170) {
            return 505;
        } else if (co2Emissions <= 190) {
            return 820;
        } else if (co2Emissions <= 225) {
            return 1230;
        } else if (co2Emissions <= 255) {
            return 1750;
        } else {
            return 2060;
        }
    }

    private int dieselRates(int co2Emissions) {
        if (co2Emissions == 0) {
            return 0;
        } else if (co2Emissions <= 50) {
            return 25;
        } else if (co2Emissions <= 75) {
            return 105;
        } else if (co2Emissions <= 90) {
            return 125;
        } else if (co2Emissions <= 100) {
            return 145;
        } else if (co2Emissions <= 110) {
            return 165;
        } else if (co2Emissions <= 130) {
            return 205;
        } else if (co2Emissions <= 150) {
            return 515;
        } else if (co2Emissions <= 170) {
            return 830;
        } else if (co2Emissions <= 190) {
            return 1240;
        } else if (co2Emissions <= 225) {
            return 1760;
        } else if (co2Emissions <= 255) {
            return 2070;
        } else {
            return 2070;
        }
    }

    private int petrolRates(int co2Emissions) {
        if (co2Emissions == 0) {
            return 0;
        } else if (co2Emissions <= 50) {
            return 10;
        } else if (co2Emissions <= 75) {
            return 25;
        } else if (co2Emissions <= 90) {
            return 105;
        } else if (co2Emissions <= 100) {
            return 125;
        } else if (co2Emissions <= 110) {
            return 145;
        } else if (co2Emissions <= 130) {
            return 165;
        } else if (co2Emissions <= 150) {
            return 205;
        } else if (co2Emissions <= 170) {
            return 515;
        } else if (co2Emissions <= 190) {
            return 830;
        } else if (co2Emissions <= 225) {
            return 1240;
        } else if (co2Emissions <= 255) {
            return 1760;
        } else {
            return 2070;
        }
    }
}

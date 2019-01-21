//package tax;
//
//public class DieselTaxCalculator extends TaxCalculator{
//
//
//    @Override
//    int calculateTax(Vehicle vehicle) {
//        int co2Emissions = vehicle.getCo2Emissions();
//        if (co2Emissions == 0) {
//            return 0;
//        } else if (co2Emissions <= 50) {
//            return 25;
//        } else if (co2Emissions <= 75) {
//            return 105;
//        } else if (co2Emissions <= 90) {
//            return 125;
//        } else if (co2Emissions <= 100) {
//            return 145;
//        } else if (co2Emissions <= 110) {
//            return 165;
//        } else if (co2Emissions <= 130) {
//            return 205;
//        } else if (co2Emissions <= 150) {
//            return 515;
//        } else if (co2Emissions <= 170) {
//            return 830;
//        } else if (co2Emissions <= 190) {
//            return 1240;
//        } else if (co2Emissions <= 225) {
//            return 1760;
//        } else if (co2Emissions <= 255) {
//            return 2070;
//        } else {
//            return 2070;
//        }
//    }
//}

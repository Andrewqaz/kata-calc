import java.util.ArrayList;

class Rome {
    private static final ArrayList<String> romeNumbers = new ArrayList<>();

    static {
        romeNumbers.add("I");
        romeNumbers.add("II");
        romeNumbers.add("III");
        romeNumbers.add("IV");
        romeNumbers.add("V");
        romeNumbers.add("VI");
        romeNumbers.add("VII");
        romeNumbers.add("VIII");
        romeNumbers.add("IX");
        romeNumbers.add("X");
        romeNumbers.add("XI");
        romeNumbers.add("XII");
        romeNumbers.add("XIII");
        romeNumbers.add("XIV");
        romeNumbers.add("XV");
        romeNumbers.add("XVI");
        romeNumbers.add("XVII");
        romeNumbers.add("XVIII");
        romeNumbers.add("XIX");
        romeNumbers.add("XX");
        romeNumbers.add("XXI");
        romeNumbers.add("XXII");
        romeNumbers.add("XXIII");
        romeNumbers.add("XXIV");
        romeNumbers.add("XXV");
        romeNumbers.add("XXVI");
        romeNumbers.add("XXVII");
        romeNumbers.add("XXVIII");
        romeNumbers.add("XXIX");
        romeNumbers.add("XXX");
        romeNumbers.add("XXXI");
        romeNumbers.add("XXXII");
        romeNumbers.add("XXXIII");
        romeNumbers.add("XXXIV");
        romeNumbers.add("XXXV");
        romeNumbers.add("XXXVI");
        romeNumbers.add("XXXVII");
        romeNumbers.add("XXXVIII");
        romeNumbers.add("XXXIX");
        romeNumbers.add("XL");
        romeNumbers.add("XLI");
        romeNumbers.add("XLII");
        romeNumbers.add("XLIII");
        romeNumbers.add("XLIV");
        romeNumbers.add("XLV");
        romeNumbers.add("XLVI");
        romeNumbers.add("XLVII");
        romeNumbers.add("XLVIII");
        romeNumbers.add("XLIX");
        romeNumbers.add("L");
        romeNumbers.add("LI");
        romeNumbers.add("LII");
        romeNumbers.add("LIII");
        romeNumbers.add("LIV");
        romeNumbers.add("LV");
        romeNumbers.add("LVI");
        romeNumbers.add("LVII");
        romeNumbers.add("LVIII");
        romeNumbers.add("LIX");
        romeNumbers.add("LX");
        romeNumbers.add("LXI");
        romeNumbers.add("LXII");
        romeNumbers.add("LXIII");
        romeNumbers.add("LXIV");
        romeNumbers.add("LXV");
        romeNumbers.add("LXVI");
        romeNumbers.add("LXVII");
        romeNumbers.add("LXVIII");
        romeNumbers.add("LXIX");
        romeNumbers.add("LXX");
        romeNumbers.add("LXXI");
        romeNumbers.add("LXXII");
        romeNumbers.add("LXXIII");
        romeNumbers.add("LXXIV");
        romeNumbers.add("LXXV");
        romeNumbers.add("LXXVI");
        romeNumbers.add("LXXVII");
        romeNumbers.add("LXXVIII");
        romeNumbers.add("LXXIX");
        romeNumbers.add("LXXX");
        romeNumbers.add("LXXXI");
        romeNumbers.add("LXXXII");
        romeNumbers.add("LXXXIII");
        romeNumbers.add("LXXXIV");
        romeNumbers.add("LXXXV");
        romeNumbers.add("LXXXVI");
        romeNumbers.add("LXXXVII");
        romeNumbers.add("LXXXVIII");
        romeNumbers.add("LXXXIX");
        romeNumbers.add("XC");
        romeNumbers.add("XCI");
        romeNumbers.add("XCII");
        romeNumbers.add("XCIII");
        romeNumbers.add("XCIV");
        romeNumbers.add("XCV");
        romeNumbers.add("XCVI");
        romeNumbers.add("XCVII");
        romeNumbers.add("XCVIII");
        romeNumbers.add("XCIX");
        romeNumbers.add("C");
    }

    public static int romeToArabian(String rome) throws Exception {
        if (romeNumbers.contains(rome.toUpperCase())) {
            return romeNumbers.indexOf(rome.toUpperCase()) + 1;
        }
        throw new Exception("'" + rome + "' - не является римским числом, либо находится вне диапазона 1 - 100");
    }

    public static String arabianToRome(int arabian) throws Exception {
        if (arabian <= romeNumbers.size() && arabian >= 1) {
            return romeNumbers.get(arabian - 1);
        }
        throw new Exception("'" + arabian + "' - находится вне диапазона 1 - 100");
    }

    public static boolean isRome(String s) {
        return romeNumbers.contains(s.toUpperCase());
    }
}

public class Maskify {

    //Mask all digits(0-9) with #, unless they are the first 4 or last four characters
    //Never mask credit cards with less than 6 characters
    //Never mask non digit characters


    public static void main(String[] args) {
        String cr1 = maskify("4545dfgds55555");
        System.out.println(cr1);
    }
    public static String maskify(String creditCardNumber){
        if(creditCardNumber.length()< 6){
            return creditCardNumber;
        }else{
            String firstFourDigits= creditCardNumber.substring(0,4);
            String lastFourDigits = creditCardNumber.substring(creditCardNumber.length()-4);
            String result = firstFourDigits + creditCardNumber.substring(4).replaceAll("\\d", "#")+ lastFourDigits;
           return result;
        }

    }
}

public class Phone {
    public static String convertPhone(String number){
        if (number.startsWith("8")){
            return "+7 " + number.substring(1, 4) + " " + number.substring(4, 7) + " " + number.substring(7, 11);
        }else{
            return number.substring(0 , number.length()-10) + " " + number.substring(number.length()-10, number.length()-7) + " " + number.substring(number.length()-7, number.length()-4) + " " + number.substring(number.length()-4);
        }
    }
}

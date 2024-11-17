import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(System.in);
        //String message = sc.nextLine();
        //send(message);
        //String ot = sc.nextLine();
        //Person a = new Person("", "Ivanov", ot);
        //System.out.println(a.getName());
        Addres ad = new Addres("Russia, Saratov Prokatnaya. 15; 34");
        ad.getAddres();
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White TShirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10]= "S011,Maroon Polo Shirt,Maroon,S";
        System.out.println(Arrays.toString(Shirt.convert(shirts)));
        System.out.println(Phone.convertPhone("89873593353"));
        System.out.println(Phone.convertPhone("+109873593353"));

        Scanner scanner = new Scanner(new File("src/file.txt"));
        String[] file = scanner.nextLine().split(" ");
        String[] res = new String[file.length];
        for (int q = 0; q < file.length; q++){
            String a = file[q];
            file[q] = "";
            sor(a, file, 0, res);
            file[q] = a;
        }
    }
    public static void sor(String cur, String[] left, int index, String[] res){
        res[index] = cur;
        if (index == left.length - 1){
            System.out.println(Arrays.toString(res));
            return;
        }
        for ( int q = 0; q< left.length; q++){
            if (!Objects.equals(left[q], "") && cur.charAt(cur.length()-1) == left[q].charAt(0)){
                String a = left[q];
                left[q] = "";
                sor(a, left, index+1, res);
                left[q] = a;
            }
        }
    }

    public static void send(String message){
        System.out.println("I got your message: " + message);
        System.out.println("Last Symbol");
        System.out.println(message.charAt(message.length() - 1));
        if (message.endsWith("!!!")){
            System.out.println("You are excited");
        }
        if (message.startsWith("I like")){
            System.out.println("I like it too");
        }
        if (message.contains("Java")){
            System.out.println("Java is cool language");
            System.out.println("You said java at: " + message.indexOf("Java"));
        }
        System.out.println(message.replace("a", "o"));
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.substring(7,11));
    }
}
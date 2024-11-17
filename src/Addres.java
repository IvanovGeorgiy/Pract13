import java.util.StringTokenizer;

public class Addres {
    String country;
    String city;
    String street;
    String house;
    String apps;
    public Addres(String addres){
        StringTokenizer token = new StringTokenizer(addres, ".,:; ");
        country = token.nextToken();
        city = token.nextToken();
        street = token.nextToken();
        house = token.nextToken();
        apps = token.nextToken();
    }
    public void getAddres(){
        System.out.println(country + " " + city + " " + street + " " + house + " " + apps);
    }
}

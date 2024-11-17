public class Shirt {
    String index;
    String name;
    String color;
    String size;
    public static  Shirt[] convert(String[] products){
        Shirt[] res = new Shirt[products.length];
        for (int q = 0; q < products.length; q++) {
            String[] product = products[q].split(",");
            res[q] = new Shirt();
            res[q].index = product[0];
            res[q].name = product[1];
            res[q].color = product[2];
            res[q].size = product[3];
        }
        return res;
    }
    @Override
    public String toString(){
        return index + " " + name + " " + color + " " + size;
    }
}

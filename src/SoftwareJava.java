public class SoftwareJava extends Software {

    private String software;
    //override getFormattedPrice (price) method by adding 100 instead of 90% dicount
    public double getFormattedPrice(double price) {
        // Use the NumberFormat class to format the price to 2 decimal places
        price=price+100;
        return price;
    }

    public static void main(String args[]){

        SoftwareJava softwareJava= new SoftwareJava();
        System.out.println("programmer field value from parent Software:"+softwareJava.getProgrammer());
        System.out.println();
        //override getFormattedPrice(price) method
        System.out.println("Override method of getFormattedPrice(price)"+softwareJava.getFormattedPrice(30.00));

    }
}

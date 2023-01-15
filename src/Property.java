import org.w3c.dom.ls.LSOutput;

public class Property {
    //variables declaration
    private String city;
    private String street;
    private int rooms;
    private int price;
    private String type;
    private boolean forRent;
    private int houseNumber;
    private int floor;
    private String publisher;
//constructor
    public Property(String city, String street, int rooms, int price, String type, boolean forRent, int houseNumber, int floor, String publisher) {
        this.city = city;
        this.street = street;
        this.rooms = rooms;
        this.price = price;
        this.type = type;
        this.forRent = forRent;
        this.houseNumber = houseNumber;
        this.floor = floor;
        this.publisher = publisher;
    }
   //setters & getters

    //main code
}

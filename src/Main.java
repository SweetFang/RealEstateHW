import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        City beerSheva = new City("Beer Sheva", "South", new String[]{"Bialik", "Basel", "Borochov", "Shapira"});
        City dimona = new City("Dimon", "South", new String[]{"Hertzel", ""});
        City city3 = new City("City03", "Center", new String[]{"Street1", "Street2", "Street3"});
        City city4 = new City("City04", "Negev", new String[]{"Street1", "Street2", "Street3"});
        City city5 = new City("City05", "Negev", new String[]{"Street1", "Street2", "Street3"});
        City city6 = new City("City06", "Center", new String[]{"Street1", "Street2", "Street3"});
        City city7 = new City("City07", "Sharon", new String[]{"Street1", "Street2", "Street3"});
        City city8 = new City("City08", "Sharon", new String[]{"Street1", "Street2", "Street3"});
        City city9 = new City("City09", "North", new String[]{"Street1", "Street2", "Street3"});
        City city10 = new City("City10", "North", new String[]{"Street1", "Street2", "Street3"});

        City[] cities = new City[]{beerSheva, dimona, city3, city4, city5, city6, city7, city8, city9, city10};


    }
public static void mainMenu(){
    Scanner scanner=new Scanner(System.in);
    int selection;
   do {
       System.out.println("Enter your selection:");
       System.out.println("1. Create new user");
       System.out.println("2. login");
       System.out.println("3. Exit");
       selection = scanner.nextInt();
   }while(selection <0 || selection>2);

}

    public static void newMenu() {
        Scanner scanner = new Scanner(System.in);
        int opt;
        while (true) {
            System.out.println("Enter your selection:");
            System.out.println("1. Create new user");
            System.out.println("2. login");
            System.out.println("3. Exit");
            opt= scanner.nextInt();
            if (opt==1){
                System.out.println("opt1");
        }
            if(opt==2){
                System.out.println("opt2");
            }
            if(opt==3){
                break;
            }
    }
}}
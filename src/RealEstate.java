public class RealEstate {
  User[] users;
  Property[] Properties;
// City[] cities;

 //constructor
public RealEstate (City[] cities){
 this.cities=cities;
}
 //setter & getters

 //main code
 City beerSheva = new City("Beer Sheva","South",new String[]{"Bialik","Basel","Borochov","Shapira"});
 City dimona = new City("Dimon","South",new String[]{"Hertzel","Rabin","Hanasi"});
 City[] cities = new City[] {beerSheva,dimona};
}

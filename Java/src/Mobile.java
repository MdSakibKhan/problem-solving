public class Mobile implements MobileInterface{
    Mobile next ;
    String name ;
    String NN;
    Mobile(String name , Mobile mobile){
        this.name = name;
        this.next = mobile;
    }
    public String getName(){
        return this.name;
    }
}

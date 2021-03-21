public class person{
    private String pName;

    public person(String pName){
        this.pName=pName;
    }
    public void getName(String pName){
        this.pName=pName;
    }
    public String getName(){
        return pName;
    }
}
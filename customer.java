public class customer extends person{
    private String address;
    private double budget;


    public customer(String cName){
        super(cName);
    }

    public void purchase(String address){
        this.address=address;
    }
    public String purchase(){
        return address;
    }

    public void getBudget(double budget){
        this.budget=budget;
    }
    public double getBudget(){
        return budget;
    }

}

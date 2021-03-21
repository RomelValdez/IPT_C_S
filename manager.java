public class manager extends employee{

    private double basicSalary;
    private int employeeNum;
    private double allowance;

    public manager(String mName){
        super(mName);
    }
    public void mEmpNum(int employeeNum){
        this.employeeNum=employeeNum;
    }
    public int mEmpNum(){
        return employeeNum;
    }
    public void mAllowance(int allowance){
        this.allowance=allowance;
    }
    public double mAllowance(){
        return allowance;
    }
    public void mSalary(double basicSalary){
        this.basicSalary=basicSalary;
    }
    public double mSalary(){
        return basicSalary;
    }
   


   
}

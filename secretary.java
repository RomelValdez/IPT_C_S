public class secretary extends employee{
   
    private double basicSalary;
    private int employeeNum;

    public secretary(String sName){
        super(sName);
    }
    public void sEmpNum(int employeeNum){
        this.employeeNum=employeeNum;
    }
    public int sEmpNum(){
        return employeeNum;
    }
    public void sSalary(double basicSalary){
        this.basicSalary=basicSalary;
    }
    public double sSalary(){
        return basicSalary;
   
}
}
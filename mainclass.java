public class mainclass {
    public static void main(String args[]){
    printer p1=new printer();
    customer c1=new customer("MEL");
    employee emp1=new employee("HARVY");
    manager m1=new manager("BARDS");
    salesPerson sp1=new salesPerson("JEMS");
    secretary s1=new secretary("RORO");
    

    //input for customer
    c1.purchase("30 Rang Ayan Paniqui, Tarlac");
    c1.getBudget(320000);
    //output for customer
    p1.customer(c1);
    

    //input for employee
    emp1.getEmployeeNumber(247181724);
    emp1.getBasicSalary(32000);
    //output for employee
    p1.employee(emp1);
    


    //input for manager
    m1.mEmpNum(16441812);
    m1.mAllowance(10000);
    m1.mSalary(25000);
    //output for manager
    p1.manager(m1);


    //input for salesPerson
    sp1.spEmpNum(712371239);
    sp1.spSalary(20000);
    sp1.spCom("Sales Lady");
    //output for salesPerson
    p1.salesPerson(sp1);

    
    //input for secretary
    s1.sEmpNum(12368921);
    s1.sSalary(20000);
    //output for secretary
    p1.secretary(s1);



}
}
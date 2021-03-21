public class printer {
    public printer(){
        System.out.println("Printing Info....");
        System.out.println();
    }
    public void customer(customer c1){
        System.out.println("Customer");
        System.out.println("Name: "+c1.getName());
        System.out.println("Address: "+c1.purchase());
        System.out.println("Budget: "+c1.getBudget());
        System.out.println();
    }
   
    public void employee(employee emp1){
        System.out.println("Employee");
        System.out.println("Name: "+emp1.getName());
        System.out.println("Employee Number: "+emp1.getEmployeeNumber());
        System.out.println("Basic Salary: "+emp1.getBasicSalary());
        System.out.println();
    }

    public void manager(manager m1){
        System.out.println("Manager");
        System.out.println("Name: "+m1.getName());
        System.out.println("Employee Number: "+m1.mEmpNum());
        System.out.println("Basic Salary: "+m1.mSalary());
        System.out.println("Allowance: "+m1.mAllowance());
        System.out.println();
    }

    public void salesPerson(salesPerson sp1){
        System.out.println("Sales Person");
        System.out.println("Name: "+sp1.getName());
        System.out.println("Employee Number: "+sp1.spEmpNum());
        System.out.println("Basic Salary: "+sp1.spSalary());
        System.out.println("Commision: "+sp1.spCom());
        System.out.println();
    }  

    public void secretary(secretary s1){
        System.out.println("Secretary");
        System.out.println("Name: "+s1.getName());
        System.out.println("Employee Number: "+s1.sEmpNum());
        System.out.println("Basic Salary: "+s1.sSalary());
        System.out.println();
    }

}

package Design_Patterns.StructuralDesignPattern.ProxyDesignPattern;

public class Client {

    public static void main(String[] args) {

        try{
            EmployeeDao empTableObj = new EmployeeDaoProxy();
            //empTableObj.create("USER", new EmployeeDo());
            empTableObj.create("ADMIN", new EmployeeDo());

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

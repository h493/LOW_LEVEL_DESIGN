package Design_Patterns.StructuralDesignPattern.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        //create a new row
        System.out.println("Create new row in the employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {

        //delete a row
        System.out.println("delete Row with employeeId: " + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {

        //fetch row from DB
        System.out.println("Fetching Data from DB");
        return new EmployeeDo();
    }
}

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee("saa", 2121, "DE", 212, "asa");
        Employee employee4 = new Employee("SDS", 121,"SAS");
        employee4.setMailId("sasa");
        employee4.setPhNo(321312);
        employee4.showEmployeeDetails();


        employee1.setName("Aravind");
        employee1.setId(06157);
        employee1.setRole("Developer");
        employee1.setphNo(98983450);
        employee1.setMailId("asnd.nseit.com");

        employee2.setName("Sachin");
        employee2.setId(06155);
        employee2.setRole("Developer");
        employee2.setphNo(9893451);
        employee2.setMailId("sachin.nseit.com");

        employee3.setName("Praveen");
        employee3.setId(0615);
        employee3.setRole("Developer");
        employee3.setphNo(9893451);
        employee3.setMailId("praveen.nseit.com");

        employee4.setName("Srinath");
        employee4.setId(06154);
        employee4.setRole("Developer");
        employee4.setphNo(98987455);
        employee4.setMailId("srinath.nseit.com");

        Employee employeeFive = new Employee("Udhaya", 72434, "Trainee");
        employeeFive.showEmployeedetailes();


    }
}

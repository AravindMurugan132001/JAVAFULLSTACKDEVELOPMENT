public class Employee {
    private String name;
    private int id;
    private String role;
    private long phNo;
    private String mailId;

    public Employee() {
    }

    public Employee(String name, int id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public Employee(String name, int id, String role, long phNo, String mailId) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.phNo = phNo;
        this.mailId = mailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getPhNo() {
        return phNo;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public void showEmployeeDetails() {
        System.out.println("Name           :"+name);
        System.out.println("ID             :"+id);
        System.out.println("ROLE           :"+role);
        System.out.println("PHONE NUMER    :"+phNo);
        System.out.println("MAIL ID        :"+mailId);

    }
}

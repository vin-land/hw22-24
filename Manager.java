public class Manager extends Employee {
    private boolean hasStocks;

    public Manager() {
    }

    public Manager(String name, int age, double salary, boolean hasStocks) {
        super(name, age, salary);
        this.hasStocks = hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public boolean getHasStocks() {
        return hasStocks;
    }

    public void writeProcedures() {
        System.out.println("Our team is great, we successfully closed all projects!");
    }

    public void print() {
        System.out.printf("Name: %s, Age: %d, Salary: %.2f, hasStocks: %b\n",
                getName(), getAge(), getSalary(), getHasStocks());
    }
}

package homeLesson5.model;

public class User {
    private String name;
    private int numDeposit;
    private double deposit;

    public User(int numDeposit, String name) {
        this.name = name;
        this.numDeposit = numDeposit;
        this.deposit = 0;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumDeposit() {
        return numDeposit;
    }
    
    public void SetNumDeposit(int numDeposit) {
        this.numDeposit = numDeposit;
    }

    @Override
    public String toString() {
        return "User{" +
        "л/с='" + numDeposit + '\'' +
                ", имя пользователя='" + name + '\'' +
                ", депозит='" + deposit + "$" + '\'' +
                '}';
    }
}

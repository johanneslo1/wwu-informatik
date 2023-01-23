package Schnittstellen;

public class Student implements UniversityMember, MensaCardOwner {

    private final String id;
    private final float balance;

    public Student(String id, float balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public float getBalance() {
        return balance;
    }

    @Override
    public boolean isStudent() {
        return true;
    }
}

package Contacts;

public class Contact {
    private String fName;
    private String lName;
    private long phoneNum;

    public Contact() {

    };

    public Contact (String fName, String lName, long phoneNum) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNum = phoneNum;
    }

    public void setFName (String newFName) {
        this.fName = newFName;
    }

    public void setLName (String newLName) {
        this.lName = newLName;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return fName + " " + lName;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

}

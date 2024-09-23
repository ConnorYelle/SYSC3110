public class BuddyInfo {

    private String name;
    private String phoneNumber;
    private String address;


    public BuddyInfo(){
        this("default", "000-000-0000", "default address");
    }

    public BuddyInfo(String name, String phoneNumber, String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }



    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Connor", "123-456-7890", "123 Carleton lane");
        System.out.println("Hello "+buddy1.getName());
    }
}

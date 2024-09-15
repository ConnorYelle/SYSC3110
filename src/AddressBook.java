import java.util.ArrayList;
public class AddressBook {
    public ArrayList<BuddyInfo> myArrayList;

    public AddressBook(){
        myArrayList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        myArrayList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        myArrayList.remove(buddy);
    }


    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Connor", "123-456-7890", "123 Carleton lane");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(buddy1);
        System.out.println("Address Book");
    }
}

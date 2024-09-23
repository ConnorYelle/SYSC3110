import java.util.ArrayList;
public class AddressBook {
    public ArrayList<BuddyInfo> myArrayList;

    public AddressBook(){
        myArrayList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if (buddy != null) {
            myArrayList.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < myArrayList.size()) {
            return myArrayList.remove(index);
        }
        return null;
    }

    public int addressBookSize(){
        return myArrayList.size();
    }


    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Connor", "123-456-7890", "123 Carleton lane");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(0);
        System.out.println("Address Book");
    }
}

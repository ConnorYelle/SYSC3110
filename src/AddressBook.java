import java.util.ArrayList;
public class AddressBook {
    public ArrayList<BuddyInfo> myArrayList;

    public AddressBook(){
        myArrayList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        myArrayList.add(buddy);
    }

    public void removeBuddy(int i){
        if (i < 0 || i > myArrayList.size() - 1){
            System.out.println("Invalid Index!");
        }
        else {
            myArrayList.remove(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}

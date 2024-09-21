package weekly_quiz_02;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addAddress(Contact newAddr) {
        contacts.add(newAddr);
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if(name.equals(contact.getName())) {
                System.out.println(contact);
                return;
            }
        }
        System.out.println("연락처를 찾을 수 없습니다.");
    }
}

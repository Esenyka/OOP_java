package hw5.task02.Core.Mod;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<Contact>();
    }

    // create
    public boolean add(Contact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    public Contact getCotact(int index) {
        return contacts.contains(contacts.get(index)) ? contacts.get(index) : null;
    }

    public boolean update(Contact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            int index = contacts.indexOf(contact);
            contacts.remove(index);
            return true;
        }
        return false;
    }

        // delete
    public boolean remove(Contact contact) {
        boolean flag = false;
        if (contacts.contains(contact)) {
            contacts.remove(contact);
            flag = true;
        }
            return flag;
        }


        private boolean contains(int index) {
            return contacts != null
                    && contacts.size() > index;
        }

        public List<Contact> getContacts() {
            return contacts;
        }


        public int count() {
            return contacts.size();
        }

    }

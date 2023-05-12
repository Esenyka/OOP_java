package hw5.task02.Core.MVP;

import hw5.task02.Core.Mod.Contact;
import hw5.task02.Core.Mod.PhoneBook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Model {
    PhoneBook currentBook;
    private int currentIndex;
    private String path;

    public Model(String path) {
        currentBook = new PhoneBook();
        currentIndex = 0;
        this.path = path;
    }

    public Contact currentContact() {
        if (currentIndex >= 0) {
            return currentBook.getCotact(currentIndex);
        } else {
            return null;
        }
    }

    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String fname = reader.readLine();
            while (fname != null) {
                String lname = reader.readLine();
                String description = reader.readLine();
                String phone = reader.readLine();
                String email = reader.readLine();
                this.currentBook.add(new Contact(fname, lname, description, phone, email));
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove() {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getCotact(i);
                writer.append(String.format("%s\n", contact.firstName));
                writer.append(String.format("%s\n", contact.lastName));
                writer.append(String.format("%s\n", contact.description));
                writer.append(String.format("%s\n", contact.phone));
                writer.append(String.format("%s\n", contact.email));
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveFiveLines() {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getCotact(i);
                writer.append(String.format("%s\n", contact.firstName));
                writer.append(String.format("%s\n", contact.lastName));
                writer.append(String.format("%s\n", contact.description));
                writer.append(String.format("%s\n", contact.phone));
                writer.append(String.format("%s\n", contact.email));
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveOneLine() {
        try (FileWriter writer = new FileWriter(path, false)) {{
            Contact contact = currentBook.getCotact(0);
            writer.append(contact.firstName + " " + contact.lastName + " " + contact.description + " " +  " "  +
                        contact.phone + " " + contact.email + "\n");
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public PhoneBook currentBook() {
        return this.currentBook;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }
}

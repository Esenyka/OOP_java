package hw5.task02.Core.MVP;

import hw5.task02.Core.Mod.Contact;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }

    public void LoadFromFile() {
        model.load();

        if (model.currentBook().count() > 0) {
            model.setCurrentIndex(0);
            var contact = model.currentContact();

            view.setFirstName(contact.firstName);
            view.setLastName(contact.lastName);
            view.setDescription(contact.description);
            view.setPhone(contact.phone);
            view.setEmail(contact.email);
        }
    }

    public void add() {
        model.currentBook().add(
                new Contact(view.getFirstName(), view.getLastName(), view.getDescription(),view.getPhone(), view.getEmail()));
    }

    public void remove() {
        Contact contact = new Contact(view.getFirstName(), view.getLastName(), view.getDescription(), view.getPhone(),
                view.getEmail());
        model.currentBook().remove(contact);

        if (model.currentBook().count() < 1) {
            model.setCurrentIndex(-1);

            view.setFirstName("");
            view.setLastName("");
            view.setDescription("");
            view.setPhone("");
            view.setEmail("");
        } else {
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);

            Contact temp = model.currentContact();
            view.setFirstName(temp.firstName);
            view.setLastName(temp.lastName);
            view.setDescription(temp.description);
            view.setPhone(temp.phone);
            view.setEmail(temp.phone);
        }
    }

    public void saveToFileOne() {
        model.saveOneLine();
    }

    public void saveToFileFive() {
        model.saveFiveLines();
    }

    public void nextFive() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);
                view.setPhone(contact.phone);
                view.setEmail(contact.email);
            }
        }
    }
    public void nextOne() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Contact contact = model.currentContact();
                view.setAll(contact.firstName, contact.lastName, contact.description, contact.phone, contact.email);
            }
        }
    }

    public void prevFive() {
        if (model.currentBook().count() > 1) {
            if (model.getCurrentIndex() + 1 >= 2) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);
                view.setPhone(contact.phone);
                view.setEmail(contact.phone);
            }
        }
    }
    public void prevOne() {
        if (model.currentBook().count() > 1) {
            if (model.getCurrentIndex() + 1 >= 2) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.currentContact();
                view.setAll(contact.firstName, contact.lastName, contact.description, contact.phone, contact.email);
            }
        }
    }

}

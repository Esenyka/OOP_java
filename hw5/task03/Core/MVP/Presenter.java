package Core.MVP;

import Core.Mod.Student;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }
    public void LoadFromFile() {
        model.load();

        if (model.currentJournal().count() > 0) {
            model.setCurrentIndex(0);
            var cClass = model.currentClass();
            for (int i=0; i <  cClass.count(); i++) {
                var student = cClass.getStudent(i);
                view.setFirstName(student.firstName);
                view.setLastName(student.lastName);
                view.setAge(student.age);
            }
        }
    }
    public void next() {
        if (model.currentJournal().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentJournal().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Student student = model.currentStudent();
                view.setFirstName(student.firstName);
                view.setLastName(student.lastName);
                view.setAge(student.age);
            }
        }
    }
    public void prev() {
        if (model.currentJournal().count() > 0) {
            if (model.getCurrentIndex() + 1 >= 2) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Student student = model.currentStudent();
                view.setFirstName(student.firstName);
                view.setLastName(student.lastName);
                view.setAge(student.age);
                }
            }
    }
    public void add() {
        model.currentClass.add(new Student(view.getFirstName(), view.getLastName(), view.getAge()));
    }
    public void saveClass() {
        int n = view.getNumber();
        if (this.model.currentJournal != null) {
            model.currentJournal.add(n, model.currentClass);
        }
    }
    public void save() {
        model.save();
    }
    public Integer getCurrentClass() {
        return view.setNumber(model.currentClass.getClassRoom());
    }
}

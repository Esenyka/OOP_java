package Core.MVP;

import Core.Mod.ClassesJournal;
import Core.Mod.SchoolClass;
import Core.Mod.Student;

import java.io.*;

public class Model {
    SchoolClass currentClass;
    ClassesJournal currentJournal;

    private String path;
    private int currentIndex;

    public Model(String path) {
        currentClass = new SchoolClass();
        currentIndex = 0;
        this.path = path;
    }

    public SchoolClass currentClass() {
        return this.currentClass;
    }

    public Student currentStudent() {
        return currentClass.getStudent(currentIndex);
    }

    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String fname = reader.readLine();
            while (fname != null) {
                String lname = reader.readLine();
                String age = reader.readLine();
                this.currentClass.add(new Student(fname, lname, age));
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentClass.count(); i++) {
                Student student = currentClass.getStudent(i);
                writer.append(String.format("%s\n", student.firstName));
                writer.append(String.format("%s\n", student.lastName));
                writer.append(String.format("%s\n", student.age));
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public SchoolClass currentJournal() {
        return this.currentClass;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }
    public int getCurrentIndex() {
        return this.currentIndex;
    }
}

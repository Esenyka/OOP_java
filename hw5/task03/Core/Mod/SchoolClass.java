package Core.Mod;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    protected Integer number;
    private List<Student> classRoom;

    public SchoolClass() {
        classRoom = new ArrayList<Student>();
    }

    public boolean add(Student student) {
        boolean flag = false;
        if (!classRoom.contains(student)) {
            classRoom.add(student);
            flag = true;
        }
        return flag;
    }

    public int count() {
        return classRoom.size();
    }

    public boolean remove(Student student) {
        boolean flag = false;
        if (classRoom.contains(student)) {
            classRoom.remove(student);
            flag = true;
        }
        return flag;
    }

    public Student getStudent(int i) {
        if (classRoom.get(i) == null) {
            return null;
        }
        return classRoom.get(i);

    }
    public Integer getClassRoom() {
        return number;
    }
}

package Core.Mod;

import java.util.HashMap;
import java.util.List;

public class ClassesJournal extends SchoolClass{
    private HashMap<Integer, SchoolClass> journal;

    public ClassesJournal(){
        journal  = new HashMap<Integer, SchoolClass>();
    }

    public boolean add(int num, SchoolClass schoolClass) {
        boolean flag = false;
        if (!journal.containsValue(schoolClass)) {
            journal.put(num, schoolClass);
            flag = true;
        }
        return flag;
    }

    public boolean remove(SchoolClass schoolClass) {
        boolean flag = false;
        if (journal.containsValue(schoolClass)) {
            journal.remove(super.number);
            flag = true;
        }
        return flag;
    }
    public int count() {
        return journal.size();
    }
    public SchoolClass getClass(int key) {
        return journal.getOrDefault(key, null);
    }

}

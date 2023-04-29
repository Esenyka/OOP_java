package hw3.task1;

import java.util.Iterator;

public class Program {
    private PrinterImple printerImple;
    public static void main(String[] args){
        PrinterImple Print = new PrinterImple();
        GeoTree tree = new GeoTree();

        FamilyPerson per1 = new GrParents("Michel", "Sveta", "Female", 45);
        Print.print(per1.getInfo());

        FamilyPerson per2 = new Parent("Michel", "Mihail", "male", 48);
        Print.print(per2.getInfo());

        FamilyPerson per3 = new Child("Michel", "Masha", "female", 7);
        Print.print(per3.getInfo());

        FamilyPerson per4 = new Parent("Jonson", "Dark", "male", 43);
        Print.print(per4.getInfo());

        FamilyPerson per5 = new Child("Jonson", "Vika", "female", 10);
        Print.print(per5.getInfo());

        Print.print(per1.isRelative(per2));
        Print.print(per2.isRelative(per5));

        Print.print(per1.GetPersonStatus());

        tree.append(per1.getInfo());
        tree.append(per2.getInfo());
        tree.append(per3.getInfo());
        tree.append(per4.getInfo());
        tree.append(per5.getInfo());

        System.out.println(tree.showTree());
        tree.showFamily("Jonson");

        Iterator<String> components = per1;
        while(components.hasNext()) {
            System.out.println(per1.next());
        }





    }
}

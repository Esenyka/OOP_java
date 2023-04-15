package hw1.task01;

public class Program {
    public static void main(String[] args){
        FamilyPerson per1 = new GrParents("Michel", "Sveta", "Female", 45);
        System.out.println(per1.getInfo());

        FamilyPerson per2 = new Parent("Michel", "Mihail", "male", 48);
        System.out.println(per2.getInfo());

        FamilyPerson per3 = new Child("Michel", "Masha", "female", 7);
        System.out.println(per3.getInfo());

        FamilyPerson per4 = new Parent("Jonson", "Dark", "male", 43);
        System.out.println(per4.getInfo());

        FamilyPerson per5 = new Child("Jonson", "Vika", "female", 10);
        System.out.println(per5.getInfo());

        System.out.println(per1.isRelative(per2));
        System.out.println(per2.isRelative(per5));






    }
}

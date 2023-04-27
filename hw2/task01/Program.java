package hw2.task01;

public class Program {
    private PrinterImple printerImple;
    public static void main(String[] args){
        PrinterImple Print = new PrinterImple();
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






    }
}

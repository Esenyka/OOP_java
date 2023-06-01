package hw2.task01;

public class Program {
    private PrinterImple printerImple;
    public static void main(String[] args){
        PrinterImple Print = new PrinterImple();
        Model m = new Model();

        FamilyPerson per1 = new GrParents("Michel", "Sveta", "Female", 45);
        Print.print(m.getInfo(per1));

        FamilyPerson per2 = new Parent("Michel", "Mihail", "male", 48);
        Print.print(m.getInfo(per2));

        FamilyPerson per3 = new Child("Michel", "Masha", "female", 7);
        Print.print(m.getInfo(per3));

        FamilyPerson per4 = new Parent("Jonson", "Dark", "male", 43);
        Print.print(m.getInfo(per4));

        FamilyPerson per5 = new Child("Jonson", "Vika", "female", 10);
        Print.print(m.getInfo(per5));

        Print.print(m.isRelative(per1, per2));
        Print.print(m.isRelative(per5, per2));

        Print.print(m.getStatus(per1));






    }
}

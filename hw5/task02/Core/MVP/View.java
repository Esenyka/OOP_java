package hw5.task02.Core.MVP;
public interface View {
    String getFirstName();
    void setFirstName(String value);
    String getLastName();
    void setLastName(String value);
    String getDescription();
    void setDescription(String value);
    String getPhone();
    void setPhone(String value);
    String getEmail();
    void setEmail(String value);
    void setAll(String n, String l, String d, String p, String e);
}


// File: Person.java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Person {
    protected String name;
    protected Date dob;

    public Person(String name, String dobStr, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        this.name = name;
        this.dob = sdf.parse(dobStr);
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        Calendar birth = Calendar.getInstance();
        birth.setTime(dob);

        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        System.out.println("Age: " + age);
    }
}
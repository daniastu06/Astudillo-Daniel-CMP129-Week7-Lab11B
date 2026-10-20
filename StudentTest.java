public class StudentTest {

    public static void main(String[] args) {

        // PART 1: Mutable Student
        // TODO: Create a MutableStudent object.
        MutableStudent m = new MutableStudent("Daniel", 20);

        // TODO: Display the student's original information.
        System.out.println("Original Student Information: ");
        m.DisplayInfo();

        // TODO: Use the setter methods to change the student's data.
        m.setName("Felipe");
        m.setAge(18);

        // TODO: Display the student again.
         System.out.println("New Student Information: ");
        m.DisplayInfo();
        // Question: Did the SAME object change?
        // Yes

        System.out.println();

        // PART 2: Immutable Student
        // TODO: Create an ImmutableStudent object.
        ImmutableStudent s1 = new ImmutableStudent("Daniel", 20);

        // TODO: Display the student's information.
        s1.DisplayInfo();

        // Try to answer this in a comment:
        // Why can you not change the ImmutableStudent object
        // using setter methods?
        // Because there are no setters in the class and the fields are final
        // so the only way to change to change the date is creating a new object

        // PART 3: Compare
        // Add comments that answer:
        // 1. Which class is mutable?
        // MutableStudent is mutable 
        // 2. Which class is immutable?
        // ImmutableStudents is immutable 
        // 3. What is the biggest difference you noticed?
        // The biggest difference is that MutableStudents has setter methods,
        // while ImmutableStudents does not have them. 
        // Also Immutable has private final fields
    }
}

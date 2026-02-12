public class PersonStudentStaff {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("  Lab 2: Person, Student, and Staff Hierarchy");
        System.out.println("==============================================\n");

        // ----- Section 1: Creating Objects -----
        System.out.println("--- Section 1: Creating Objects ---");

        Person p1 = new Person("Amina Hassan", "Stonetown, Zanzibar");
        System.out.println(p1);

        Student s1 = new Student("Juma Ali", "Chwaka, Zanzibar", "BITA", 2, 1500000);
        Student s2 = new Student("Fatma Omar", "Mbweni, Zanzibar", "BCS", 1, 1800000);
        System.out.println(s1);
        System.out.println(s2);

        Staff staff1 = new Staff("Dr. Khalid Salum", "Vuga, Zanzibar", "SCCMS", 3500000);
        System.out.println(staff1);

        // ----- Section 2: Inheritance in Action -----
        System.out.println("\n--- Section 2: Inheritance in Action ---");

        System.out.println("Student name: " + s1.getName());
        System.out.println("Student address: " + s1.getAddress());
        System.out.println("Student program: " + s1.getProgram());

        System.out.println("\nStaff name: " + staff1.getName());
        System.out.println("Staff department: " + staff1.getDepartment());

        s1.setAddress("Fumba, Zanzibar");
        System.out.println("\nAfter address change: " + s1);

        // ----- Section 3: Polymorphism -----
        System.out.println("\n--- Section 3: Polymorphism ---");

        Person[] people = {
                new Person("Bakari Juma", "Mwanakwerekwe, Zanzibar"),
                new Student("Zainab Moh'd", "Kiembe Samaki, Zanzibar", "BITA", 3, 1500000),
                new Student("Hassan Said", "Amani, Zanzibar", "BCS", 1, 1800000),
                new Staff("Prof. Mwanaisha Ali", "Mazizini, Zanzibar", "SCCMS", 4500000)
        };

        System.out.println("All people at SUZA:");
        for (Person p : people) {
            System.out.println("  " + p);  // Polymorphism (dynamic binding)
        }

        // ----- Section 4: instanceof and Type Checking -----
        System.out.println("\n--- Section 4: instanceof and Type Checking ---");

        int studentCount = 0;
        int staffCount = 0;

        for (Person p : people) {
            if (p instanceof Student) {
                Student s = (Student) p;
                System.out.println(s.getName() + " is a Student in "
                        + s.getProgram() + " Year " + s.getYear());
                studentCount++;
            } else if (p instanceof Staff) {
                Staff st = (Staff) p;
                System.out.println(st.getName() + " is Staff in "
                        + st.getDepartment());
                staffCount++;
            } else {
                System.out.println(p.getName() + " is a Person (visitor/other)");
            }
        }

        System.out.println("\nSummary: " + studentCount +
                " students, " + staffCount + " staff members");

        System.out.println("\n==============================================");
        System.out.println("  End of Lab 2");
        System.out.println("==============================================");
    }
}

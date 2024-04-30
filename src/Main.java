import model.Address;
import model.School;
import model.Student;
import service.AddressService;
import service.Impl.AddressServiceImpl;
import service.Impl.SchoolServiceImpl;
import service.Impl.StudentServiceImpl;
import service.SchoolSevice;
import service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        AddressService addressService = new AddressServiceImpl();
        addressService.input(address);
        addressService.into(address);

        School school = new School();
        SchoolSevice schoolSevice = new SchoolServiceImpl();
        schoolSevice.input(school);
        schoolSevice.output(school);

        Student student = new Student();
        StudentService studentService = new StudentServiceImpl();
        studentService.inputaddStudent(student);
        studentService.intoaddStudent(student);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            studentService.inputaddStudent(student);
        }

        try {
            int maxAge = studentService.findMaxAge(student);
            System.out.println("The maximum age among the students is: " + maxAge);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }




    }
}

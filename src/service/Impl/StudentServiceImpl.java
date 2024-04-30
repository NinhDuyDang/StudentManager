//package service.Impl;
//
//import model.Student;
//import service.StudentService;
//
//import java.util.Scanner;
//
//public class StudentServiceImpl implements StudentService {
//
//
//    private int[] ages;
//    private int currentIndex = 0;
//
//    public StudentServiceImpl() {
//        int maxSize = 0;
//        ages = new int[maxSize];
//    }
//
//    @Override
//    public void inputaddStudent(Student student) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("\nEnter Student ID: ");
//        int id = sc.nextInt();
//        student.setId(id);
//        System.out.print("Enter Student Name: ");
//        String name = sc.next();
//        student.setName(name);
//        System.out.print("Enter Student Age: ");
//        int age = sc.nextInt();
//        student.setAge(age);
//        ages[currentIndex++] = age;
//
//    }
//
//    @Override
//    public void intoaddStudent(Student student) {
//        System.out.print("Student ID: "+student.getId());
//        System.out.print("Student Name: "+student.getName());
//        System.out.print("Student Age: "+student.getAge());
//    }
//
//    @Override
//    public int findMaxAge(Student student) {
//            int maxAge = ages[0];
//            for (int i = 1; i < currentIndex; i++) {
//                if (ages[i] > maxAge) {
//                    maxAge = ages[i];
//                }
//            }
//            return maxAge;
//        }
//
//    }
//
//

package service.Impl;

import model.Student;
import service.StudentService;

import java.util.Scanner;

public class StudentServiceImpl implements StudentService {

    private int[] ages;
    private int currentIndex = 0;

    // Constructor không tham số
    public StudentServiceImpl() {
        // Khởi tạo mảng với kích thước ban đầu là 100
        ages = new int[100];
    }

    @Override
    public void inputaddStudent(Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Student ID: ");
        int id = sc.nextInt();
        student.setId(id);
        System.out.print("Enter Student Name: ");
        String name = sc.next();
        student.setName(name);
        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        student.setAge(age);
        // Lưu tuổi vào mảng
        ages[currentIndex++] = age;
    }

    @Override
    public void intoaddStudent(Student student) {
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }

    // Phương thức để tìm tuổi lớn nhất
    @Override
    public int findMaxAge(Student student) {
        int maxAge = ages[0];
        for (int i = 1; i < currentIndex; i++) {
            if (ages[i] > maxAge) {
                maxAge = ages[i];
            }
        }
        return maxAge;
    }
}


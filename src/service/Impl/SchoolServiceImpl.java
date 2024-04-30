package service.Impl;

import model.School;
import service.SchoolSevice;

import java.util.Scanner;

public class SchoolServiceImpl  implements SchoolSevice {

    @Override
    public void input(School school) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Id school:");
        int id = sc.nextInt();
        school.setId(id);


        System.out.print("Enter name: ");
        String name = sc.next();
        school.setSchoolName(name);

    }

    @Override
    public void output(School school) {

        System.out.println("Id: " + school.getId());
        System.out.println("Name: " + school.getSchoolName());

    }
}

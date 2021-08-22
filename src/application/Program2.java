package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department findById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);



        System.out.println("\n === TEST 4: Department Insert ===");
        Department newDepartment = new Department(null, "RH");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted new id = " + newDepartment.getId());

        System.out.println("\n === TEST 5: Department Update ===");
        department = departmentDao.findById(1);
        departmentDao.insert(newDepartment);
        System.out.println("Update Complete");
    }
}

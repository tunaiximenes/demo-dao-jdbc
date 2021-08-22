package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n === TEST 4: Department Insert ===");
        Department newDepartment = new Department(null, "RH");
        departmentDao.insert(newDepartment);
        System.out.println("Update Complete");

    }
}

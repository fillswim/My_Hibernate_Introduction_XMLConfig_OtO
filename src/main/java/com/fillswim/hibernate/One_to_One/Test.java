package com.fillswim.hibernate.One_to_One;

import com.fillswim.hibernate.One_to_One.Entity.Detail;
import com.fillswim.hibernate.One_to_One.Entity.Employee;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        EmployeeDAO employeeDao = new EmployeeDAO();
        DetailDAO detailDAO = new DetailDAO();

        // Чтение сотрудника и детальной информации о нем из БД
//        Employee employee = employeeDao.getEmployee(1);
//        System.out.println(employee);
//        System.out.println(employee.getDetail());

        // Получение всех сотрудников из БД
        List<Employee> employees = employeeDao.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println(employee.getDetail());
        }

        // Поиск сотрудников по имени
//        List<Employee> employees = employeeDao.findByName("Mike");
//        for (Employee employee : employees) {
//            System.out.println(employee);
//            System.out.println(employee.getDetail());
//        }

        // Создание пользователя в БД
//        Employee employee = new Employee("Pete", "Smith", "HR", 800);
//        Detail detail = new Detail("Moscow", "+7-123-456-56-78", "pete@gmail.com");
//        employee.setDetail(detail);
//        detail.setEmployee(employee);
//        employeeDao.saveEmployee(employee);

        // Обновление пользователя в БД
//        Employee employee = employeeDao.getEmployee(2);
//        System.out.println(employee);
//        employee.setSalary(900);
//        System.out.println(employee);
//        employeeDao.saveEmployee(employee);

                // Обновление связанного объекта
//        Employee employee = employeeDao.getEmployee(2);
//        System.out.println(employee.getDetail());
//        employee.getDetail().setPhoneNumber("+7-123-456-98-77");
//        System.out.println(employee.getDetail());
//        employeeDao.saveEmployee(employee);

        // Удаление пользователя
//        employeeDao.deleteEmployee(4);

//======================================================================================================================

        // Чтение сотрудника и детальной информации о нем из БД
//        Detail detail = detailDAO.getDetail(1);
//        System.out.println(detail);
//        System.out.println(detail.getEmployee());

        // Получение всей информации о сотрудниках и их самих
//        List<Detail> details = detailDAO.getAllDetails();
//        for (Detail detail : details) {
//            System.out.println(detail);
//            System.out.println(detail.getEmployee());
//        }

        // Поиск деталей о сотрудниках по их городу
//        List<Detail> details = detailDAO.findByCity("Moscow");
//        for (Detail detail : details) {
//            System.out.println(detail);
//            System.out.println(detail.getEmployee());
//        }

        // Создание пользователя в БД
//        Detail detail = new Detail("London", "+7-123-456-78-89", "pete@gmail.com");
//        Employee employee = new Employee("Pete", "Smith", "HR", 600);
//        employee.setDetail(detail);
//        detail.setEmployee(employee);
//        detailDAO.saveDetail(detail);

        // Обновление пользователя в БД
//        Detail detail = detailDAO.getDetail(4);
//        System.out.println(detail);
//        detail.setEmail("peter@gmail.com");
//        System.out.println(detail);
//        detailDAO.saveDetail(detail);
                // Обновление связанного объекта
//        Detail detail = detailDAO.getDetail(4);
//        System.out.println(detail.getEmployee());
//        detail.getEmployee().setSalary(800);
//        System.out.println(detail.getEmployee());
//        detailDAO.saveDetail(detail);

        // Удаление детальной информации о пользователе
//        detailDAO.deleteDetail(3); // Работает только для CascadeType.ALL

        // Для удаления только детальной информации необходимо перед удалением разрушить связь объектов
//        Detail detail = detailDAO.getDetail(2);
//        Employee employee = detail.getEmployee();
//        employee.setDetail(null);
//        employeeDao.saveEmployee(employee);
//
//        detailDAO.deleteDetail(2);
    }
}

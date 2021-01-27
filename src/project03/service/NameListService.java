package project03.service;

import project03.domain.Employee;
import project03.domain.Programmer;

import static project03.service.Data.*;

/**
 * @author yong
 * @date 2021-01-27 오전 10:03
 * @mail yongri1115@163.com
 */
public class NameListService {
    private Employee[] employees;
    public NameListService(){
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            switch (type){
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    employees[i] = new Programmer(id, name, age, salary, );
                    break;
            }
        }
    }
    public Employee[] getAllEmployees(){
        return null;
    }

    public Employee getEmployee(int id){
        return null;
    }
}

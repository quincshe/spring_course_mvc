package ru.didenko.spring.mvc.bean;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import ru.didenko.spring.mvc.validation.CheckEmail;

public class Employee {

    @NotBlank(message = "field must not be empty")
    @Size(min = 3, max = 25, message = "name must be min 3 symbols, max 25 symbols")
    private String name;

    @NotBlank(message = "field must not be empty")
    @Size(min = 2, max = 25, message = "name must be min 2 symbols, max 25 symbols")
    private String surname;

    @Min(value = 500, message = "min value 500")
    @Max(value = 2000, message = "max value 2000")
    private int salary;

    private String department;

    private Map<String, String> departments;

    @NotEmpty(message = "carBrand is required field")
    private String carBrand;

    private Map<String, String> carBrands;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "phone number template XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail(value = "@mail.ru", message = "email mast ends with @mail.ru")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Salary", "Salary");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("AUDI", "AUDI");
        carBrands.put("LADA", "LADA");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", salary=" + salary +
            ", department='" + department + '\'' +
            '}';
    }
}

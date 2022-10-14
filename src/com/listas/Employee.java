package com.listas;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(Double percentage) {
        salary += salary * (percentage / 100);
    }

    public String toString() {
        return "Id: " + id + ", " + "nome: " + name + ", " + "salário: " + String.format("%.2f", salary);
    }

    //Employee funcionario = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
    //        if (funcionario == null) {
    //            System.out.println("O Id informado não existe!");
    //        }
    //        else {
    //            System.out.println("Insira a porcentagem: ");
    //        }
}

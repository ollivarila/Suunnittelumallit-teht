package org.example;

public class Main {
    public static void main(String[] args) {
        RaiseHandler ceo = new CEO();
        RaiseHandler departmentManager = new DepartmentManager(ceo);
        RaiseHandler manager = new Manager(departmentManager);

        manager.handleRaise(1000, 20);
        manager.handleRaise(1000, 40);
        manager.handleRaise(1000, 70);
    }
}
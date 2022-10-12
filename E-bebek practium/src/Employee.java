public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax()
    {
        if (salary >= 1000)
            return (salary*3)/100;
        return 0.0 ;
    }
    public double bonus ()
    {
        int extraHours = workHours- 40 ;//ekstra çalışma saati
        if (extraHours >0)
            return 30*extraHours;
        return 0.0 ;
    }
    public double raiseSalary()
    {
        int year = 2021-hireYear;
        if (year<10)
            return (salary)*0.05;
        else if (year >= 10 && year<19)
            return (salary)*0.10;
        else
            return (salary)*0.15;
    }
    public void toString(Employee employee)
    {
        double totalSalary = employee.salary - employee.tax()+employee.bonus();
        System.out.println("Çalışanın adı :"+employee.name+"Çalışanın maaşı :"+employee.salary+"Çalışanın çalışma saati:"
                        + employee.workHours+"Çalışanın başlangıç yılı : "+ employee.hireYear);
        System.out.println("Tax : "+ employee.tax());
        System.out.println("Bonus : "+ employee.bonus());
        System.out.println("Raise salary : " + employee.raiseSalary());
        System.out.println("Vergi ve bonuslarla birlikte maaş : " +(employee.salary + employee.raiseSalary()));
        System.out.println("Toplam maaş: çalışanın kendi maaşı+ bonus + vergi : "+ totalSalary);

    }
}


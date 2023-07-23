package Tasks.MaasHesaplama;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(double salary){
        double tax = 0;
        if(this.salary > 1000){
            tax = (this.salary*3) / 100;
            return tax;
        }
        return tax;
    }

    public int bonus(int workHours){
        int bonusPayment = 0;
        if (this.workHours > 40){
            bonusPayment = (this.workHours-40)*30;
            return bonusPayment;
        }
        return bonusPayment;
    }

    public double raiseSalary(int hireYear){
        int workYear = 2021 - this.hireYear;
        double salaryRaise = 0;

        if (workYear < 10){
            salaryRaise = (this.salary*5)/100;
        }else if (workYear < 20){
            salaryRaise = (this.salary*10)/100;
        }else {
            salaryRaise = (this.salary*15)/100;
        }

        return salaryRaise;
    }

    @Override
    public String toString() {
        return  "Adı : " + name + '\n' +
                "Maaşı : " + salary +'\n' +
                "Çalışma Saati : " + workHours +'\n' +
                "Başlangıç Yılı : " + hireYear +'\n' +
                "Vergi : " + tax(salary) +'\n' +
                "Bonus : "+ bonus(workHours)+'\n' +
                "Maaş Artışı : "+ raiseSalary(hireYear)+ '\n' +
                "Vergiler ve Bonuslar ile birlikte maaş : " + (salary+bonus(workHours)-tax(salary)) + '\n' +
                "Toplam Maaş : " + (salary+raiseSalary(hireYear));
    }
}

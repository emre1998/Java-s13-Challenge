package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData()
    {
        // employeeApp.Healthplan sınıfı örnekleri
        Healthplan healthplan1 = new Healthplan(1, "Basic Health Plan", Healthplan.PlanType.BASIC);
        Healthplan healthplan2 = new Healthplan(2, "Premium Health Plan", Healthplan.PlanType.PREMIUM);

        // employeeApp.Employee sınıfı örneği
        Employee employee = new Employee(1, "John Doe", "john@example.com", "password", 3);
        employee.addHealthplan(0, healthplan1.getName());
        employee.addHealthplan(1, healthplan2.getName());
        System.out.println(employee);

        // employeeApp.Company sınıfı örneği
        Company company = new Company(1, "ABC Corp", 100000, 5);
        company.addEmployee(0, "Alice");
        company.addEmployee(1, "Bob");
        System.out.println(company);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.
     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}

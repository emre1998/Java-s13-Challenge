package employeeApp;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private int giro;
    private String[] developerNames;

    public Company(int id, String name, int giro, int developerCount) {
        this.id = id;
        this.name = name;
        this.giro = (giro >= 0) ? giro : 0;
        this.developerNames = new String[developerCount];
    }

    // Getter ve Setter Metodları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        this.giro = (giro >= 0) ? giro : 0;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    // addEmployee Metodu
    public void addEmployee(int index, String name) {
        if (index >= 0 && index < developerNames.length) {
            if (developerNames[index] == null) {
                developerNames[index] = name;
                System.out.println("employeeApp.Employee added to index " + index);
            } else {
                System.out.println("Index " + index + " is already occupied.");
            }
        } else {
            System.out.println("Invalid index: " + index);
        }
    }

    // toString() Metodu
    @Override
    public String toString() {
        return "employeeApp.Company [id=" + id + ", name=" + name + ", giro=" + giro + ", developerNames=" + Arrays.toString(developerNames) + "]";
    }
}

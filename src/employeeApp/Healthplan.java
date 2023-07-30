package employeeApp;

public class Healthplan {
    private int id;
    private String name;
    private PlanType plan;

    public enum PlanType {
        BASIC,
        PREMIUM,
        GOLD
    }

    public Healthplan(int id, String name, PlanType plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
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

    public PlanType getPlan() {
        return plan;
    }

    public void setPlan(PlanType plan) {
        this.plan = plan;
    }

    // toString() Metodu
    @Override
    public String toString() {
        return "employeeApp.Healthplan [id=" + id + ", name=" + name + ", plan=" + plan + "]";
    }
}

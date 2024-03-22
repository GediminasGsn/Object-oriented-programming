public class Plant {
    private String name;
    private String latName;
    private boolean oneYear;
    private String continent;
    private double height;
    private boolean isEdible;

    public Plant() {
        this.name = "roze";
        this.latName = "raudonusmaximus";
        this.oneYear = true;
        this.continent = "North America";
        this.height = 2.3;
        this.isEdible = true;
    }
    public Plant(String name, String latName, boolean oneYear,
                 String continent, double height, boolean isEdible) {
        this.name = name;
        this.latName = latName;
        this.oneYear = oneYear;
        this.continent = continent;
        this.height = height;
        this.isEdible = isEdible;
    }

    @Override
    public String toString() {
        return "Auglas: " +
                 name + '-' +
                  latName + '-' +
                (oneYear ? "vienmetis":"daugiametis") + "-" +
                  continent + '-' +
                  height + "-" +
                (isEdible ? "valgomas" : "nevalgomas")+ ".";
    }



}

package lab.assignment.afterrefactoring;

public abstract class CoffeeMaker {

    public void brewCoffee() {
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    protected abstract void addIngredients();

    protected abstract void finalTouch();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    //default for addIngredients
    private void addIngredients() {
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    //default for addIngredients
    private void finalTouch() {
        System.out.println("Adding sugar");
    }

}

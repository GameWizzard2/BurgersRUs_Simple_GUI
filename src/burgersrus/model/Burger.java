package burgersrus.model;

import java.text.DecimalFormat;


/**
 * Represents a burger order item in the BurgersRUS POS system.
 * A burger has a type (single or double), optional add-ons (cheese, bacon, meal),
 * and a quantity. Provides methods to calculate item and total costs,
 * and a textual representation of the order line.
 * 
 * @author Chris
 */
public class Burger {
    // Attributes
    private String type;
    private boolean cheese;
    private boolean bacon;
    private boolean meal;
    private int quantity;

    // Fixed Prices in (USD)
    private final double SINGLE_COST = 3.50;
    private final double DOUBLE_COST = 4.75;
    private final double CHEESE_COST = 0.50;
    private final double BACON_COST = 1.25;
    private final double MEAL_COST = 4.00;

    /**
    * Creates a single burger with no add-ons and zero quantity.
    */
    public Burger() 
    {
        type = "Single";
        cheese = false;
        bacon = false;
        meal = false;
    }

    //Create behaviors here
    /**
    * Calculates the price of one burger with the selected add-ons.
    * @return item cost before multiplying by quantity
    */
    public double calculateItemCost()
    {
        double cost = 0.0;
         
        if (type.equalsIgnoreCase("single"))
            cost = SINGLE_COST;
        else if (type.equalsIgnoreCase("Double"))
            cost = DOUBLE_COST;
        if (cheese)
            cost += CHEESE_COST;

        if (bacon)
            cost += BACON_COST;

        if (meal)
            cost += MEAL_COST;

        return cost;
    }
    
    /**
    * Calculates total cost for the quantity of burgers in this order.
    */
    public double calculateTotalCost()
    {
        return quantity * calculateItemCost();
    }
    
    /**
    * Returns a formatted string describing the burger order.
    */
    @Override
    public String toString()
    {
        String output = quantity + " " + type;

        if (cheese)
            output += ", cheese";

        if (bacon)
            output += ", bacon";

        if (meal)
            output += ", meal";

        output += " at ";

        DecimalFormat fmt = new DecimalFormat("0.00");
        double cost = calculateItemCost();
        output += fmt.format(cost) + " each";

        return output;
    }

    // Getters and setters
    public String getType()
    {
        return type;
    }

    public void setType( String type)
    {
        this.type = type;
    }

    public boolean getCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean getBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean getMeal() {
        return meal;
    }

    public void setMeal(boolean meal) {
        this.meal = meal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
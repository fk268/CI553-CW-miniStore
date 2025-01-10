package catalogue;

import java.io.Serializable;

/**
 * Represents a product with details such as product number, description, price, quantity, and category.
 * Provides backward compatibility with a default category value.
 * @author 
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 20092506;

    private String theDescription;      // Description of product
    private double thePrice;            // Price of product
    private String theProductNum;       // Product number
    private int theQuantity;            // Quantity of product
    private String theCategory;         // Category of product (new field)

    /**
     * Backward-compatible constructor (no category).
     * Defaults category to "Uncategorized".
     * @param aProductNum The product number.
     * @param aDescription The description of the product.
     * @param aPrice The price of the product.
     * @param aQuantity The quantity of the product.
     */
    public Product(String aProductNum, String aDescription, double aPrice, int aQuantity) {
        this(aProductNum, aDescription, aPrice, aQuantity, "Uncategorized"); // Default category
    }

    /**
     * Constructor with category.
     * @param aProductNum The product number.
     * @param aDescription The description of the product.
     * @param aPrice The price of the product.
     * @param aQuantity The quantity of the product.
     * @param aCategory The category of the product.
     */
    public Product(String aProductNum, String aDescription, double aPrice, int aQuantity, String aCategory) {
        theProductNum = aProductNum;
        theDescription = aDescription;
        thePrice = aPrice;
        theQuantity = aQuantity;
        theCategory = aCategory;
    }

    // Getters
    public String getProductNum() { return theProductNum; }
    public String getDescription() { return theDescription; }
    public double getPrice() { return thePrice; }
    public int getQuantity() { return theQuantity; }
    public String getCategory() { return theCategory; } // New Getter

    // Setters
    public void setProductNum(String aProductNum) { theProductNum = aProductNum; }
    public void setDescription(String aDescription) { theDescription = aDescription; }
    public void setPrice(double aPrice) { thePrice = aPrice; }
    public void setQuantity(int aQuantity) { theQuantity = aQuantity; }
    public void setCategory(String aCategory) { theCategory = aCategory; } // New Setter
}

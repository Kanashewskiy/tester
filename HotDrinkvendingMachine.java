import java.util.List;

public class HotDrinkvendingMachine implements VendingMachine {

    private final List<Product> productList;
    private int money;

    public HotDrinkvendingMachine(List<Product> productList){
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product: productList){
            if(product.getName().equals(name)){
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }

    public HotDrink getProduct(String name, int volume, int temperature){
        for(Product product: productList){
            if(product instanceof HotDrink){
                if(product.getName().equals(name) && ((HotDrink) product).getVolume() == volume
                && ((HotDrink) product).getTemperature() == temperature){
                    return (HotDrink) product;
                }
            }
        }
        return null;
    }
}
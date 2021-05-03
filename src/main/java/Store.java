import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Store implements Iterator<Product>, Filter  {

    Product product;
    
    public static List<Product> showTheCategory(Group group, List<Product> goods){
        Logger logger = SalesLogger.getInstance();
        logger.log("CATEGORY " + group + " presented");
        List<Product> offer = goods.stream()
                .filter(x -> x.getGroup() == group)
                .collect(Collectors.toList());
        for (Product o : offer) {
            System.out.println(o.toString());
        }
        return offer;
    }

    public static List<Product> putProductIntoBucket(List<Product> goods) {
        List<Product> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Iterator<Product> iterator = goods.iterator();
        while (iterator.hasNext()){
            System.out.println("\nPlease enter PROUCT's ARTICLE or <end> to choose another CATEGORY");
            String input1 = scanner.nextLine();
            if (input1.equals("end")){
                break;
            }
            int article = Integer.parseInt(input1);
            System.out.println("Please enter PROUCT's AMOUNT");
            String input2 = scanner.nextLine();
            double amount = Double.parseDouble(input2);
            //int amount = Integer.parseInt(input2);
            Product item = new Product(iterator.next().getProductName(), amount, iterator.next().getPackageType(), iterator.next().getPrice());
            items.add(item);
//            Logger logger = SalesLogger.getInstance();
//            logger.log("PRODUCT " + iterator.next().getProductName() + " chosen");
        }
        // scanner.close();
        return items;
    }

    public static List<Product> switchAndPutTogether(List<Product>goods){
        List<Product> items = new ArrayList<>();
        List<Product> items1;
        System.out.println("\nDear Customer, please choose a product CATEGORY by printing the corresponding NUMBER of it" +
                "\nVEGETABLE    - 1" +
                "\nMILKY        - 2" +
                "\nGROCERY      - 3" +
                "\nBEVERAGE     - 4" +
                "\nHOUSEHOLD    - 5" +
                "\nPlease print - <end>, if you finished"
        );
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("\nPlease choose the CATEGORY or print <end> to stop buying");
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            int category = Integer.parseInt(input);
            if (category == 1){
                items1 = putProductIntoBucket(showTheCategory(Group.VEGETABLE, goods));
                items.addAll(items1);
            } else if (category == 2){
                items1 = putProductIntoBucket(showTheCategory(Group.MILKY, goods));
                items.addAll(items1);
            } else if (category == 3){
                items1 = putProductIntoBucket(showTheCategory(Group.GROCERY, goods));
                items.addAll(items1);
            } else if (category == 4){
                items1 = putProductIntoBucket(showTheCategory(Group.BEVERAGE, goods));
                items.addAll(items1);
            } else if (category == 5){
                items1 = putProductIntoBucket(showTheCategory(Group.HOUSEHOLD, goods));
                items.addAll(items1);
            }
        }
        scanner.close();
        return items;
    }

    @Override
    public boolean hasNext() {
        return product != null;
    }

    @Override
    public Product next() {
        return product;
    }

}

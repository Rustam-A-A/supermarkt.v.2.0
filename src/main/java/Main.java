import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> goods = new ArrayList<>();

        goods.add(new Product("BANANAS",1,Group.VEGETABLE,PackageType.KG,1.5));
        goods.add(new Product("APPLES",2,Group.VEGETABLE, PackageType.KG,2.5));
        goods.add(new Product("MILK",3,Group.MILKY, PackageType.LITER,1.0));
        goods.add(new Product("COCA-COLA",4,Group.BEVERAGE,PackageType.PCS,1.7));
        goods.add(new Product("RIESLING",5,Group.BEVERAGE,PackageType.PCS,7.5));
        goods.add(new Product("TOILET PAPER",6,Group.HOUSEHOLD, PackageType.PCS,0.5));
        goods.add(new Product("PASTA",7,Group.GROCERY,PackageType.PCS,4.5));
        goods.add(new Product("SUGAR",8,Group.GROCERY,PackageType.KG,3.5));
        goods.add(new Product("RICE",9,Group.GROCERY,PackageType.KG,1.3));
        goods.add(new Product("ZWEIGELT",10,Group.BEVERAGE,PackageType.PCS,12.0));
        goods.add(new Product("TOMATOS",11,Group.VEGETABLE, PackageType.KG,4.5));
        goods.add(new Product("BUTTER",12,Group.MILKY, PackageType.PCS,1.7));
        goods.add(new Product("BRIE",13,Group.MILKY, PackageType.PCS,3.7));
        goods.add(new Product("SOAP",14,Group.HOUSEHOLD, PackageType.PCS,4.5));
        goods.add(new Product("TOOTH PASTE",15,Group.HOUSEHOLD, PackageType.PCS,4.2));

        List<Product> bought = Store.switchAndPutTogether(goods);
        Check.printOutCheck(bought);
    }
}

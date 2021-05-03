public class Product {
    protected String productName;
    protected int article;
    protected Group group;
    protected PackageType packageType;
    protected double price;
    protected double amount;

    public Product (String productName, int article, Group group, PackageType packageType, double price) {
        this.productName = productName;
        this.article = article;
        this.group = group;
        this.packageType = packageType;
        this.price = price;
    }

    public Product (String productName, double amount, PackageType packageType, double price){
        this.productName = productName;
        this.packageType = packageType;
        this.price = price;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public PackageType getPackageType() {
        return packageType;
    }

    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString(){
        return "Article: " + getArticle() +
                "\n  " + getProductName() +
                ", Price: " + getPrice() + " Euro/"  + getPackageType();
    }


}

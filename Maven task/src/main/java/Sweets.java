public class  Sweets implements Dessert {
    String nameOfSweet;//The name of Sweet
    double weightOfSweet;//Weight of one sweet
    int numberOfSweets;//Total number of sweets
    Sweets(String nameOfSweet,double weightOfSweet,int numberOfSweets)
    {
        this.nameOfSweet=new String();
        this.nameOfSweet=nameOfSweet;
        this.weightOfSweet=weightOfSweet;
        this.numberOfSweets=numberOfSweets;
    }
    public String getName()
    {
        return nameOfSweet;
    }
    public double getWeight()
    {
        return (weightOfSweet*numberOfSweets);
    }
}

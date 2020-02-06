public class Chocolates implements Dessert
{
    String chocolateName;
    double chocolateWeight;
    int numberOfChocolates;
    Chocolates(String chocolateName,double chocolateWeight,int numberOfChocolates)
    {
        this.chocolateName=chocolateName;
        this.chocolateWeight=chocolateWeight;
        this.numberOfChocolates=numberOfChocolates;
    }
    public String getName()
    {
        return chocolateName;
    }
    public double getWeight()
    {
        return (chocolateWeight*numberOfChocolates);
    }
}

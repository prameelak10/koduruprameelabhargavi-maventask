public class Candies
{
    double candyWeight;
    int numberOfCandies;
    Candies(double candyWeight,int numberOfCandies)
    {
        this.candyWeight=candyWeight;
        this.numberOfCandies=numberOfCandies;
    }
    public double getWeight()
    {
        return (candyWeight*numberOfCandies);
    }
    public int getNumberOfCandies()
    {
        return numberOfCandies;
    }
}

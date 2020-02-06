public class Main
{
    public static void main(String []args)
    {
        double []gifts=new double[3];//Gifts are considered as an Array of gifts
        //First Gift
        Sweets sweet1=new Sweets("Laddu",25.0,3);//sweet1 is Laddu with weight 25.0 grams and number of sweets are 3
        Chocolates chocolate1=new Chocolates("DairyMilk",10,2);
        Candies candies1=new Candies(2.5,10);
        gifts[0]=sweet1.getWeight()+chocolate1.getWeight()+candies1.getWeight();
        //Second Gift
        Sweets sweet2=new Sweets("Kaju Sweet",30.0,2);
        Chocolates chocolate2=new Chocolates("Five Star",15,3);
        Candies candies2=new Candies(3.0,12);
        gifts[1]=sweet2.getWeight()+chocolate2.getWeight()+candies2.getWeight();
        //Third Gift
        Sweets sweet3=new Sweets("Rasmalia",15.0,4);//sweet1 is Laddu with weight 25.0 grams and number of sweets are 3
        Chocolates chocolate3=new Chocolates("Perk",12,3);
        Candies candies3=new Candies(1.0,15);
        gifts[2]=sweet3.getWeight()+chocolate3.getWeight()+candies3.getWeight();
        for(int i=0;i<gifts.length;i++)
        {
            for(int j=0;j<gifts.length;j++)
            {
                if(gifts[i]<gifts[j])
                {
                    double temp=gifts[i];
                    gifts[i]=gifts[j];
                    gifts[j]=temp;

                }
            }
        }
        System.out.println("Gifts sorted according to the ascending order of their weights");
        for(int i=0;i<gifts.length;i++)
        {
            System.out.println(gifts[i]);
        }
    }
}

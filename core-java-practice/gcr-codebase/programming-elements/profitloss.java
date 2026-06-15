public class profitloss {
    public static void main(String[] args){
        double costprice = 129;
        double sellingprice = 191;

        double profit = (sellingprice - costprice);
        double loss = (costprice - sellingprice);

        double profitpercentage = (sellingprice - costprice)/100.0;
        double losspercentage = (costprice - sellingprice )/100.0;
        System.out.println("profitpercentage is"+ profitpercentage+"%" + "and loss percentage is" + losspercentage+"%");
        System.out.println("profit"+profit+ " and loss" + loss);

    }
    
}

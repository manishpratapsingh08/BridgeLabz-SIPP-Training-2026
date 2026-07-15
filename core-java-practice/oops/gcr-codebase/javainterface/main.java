interface CouponValidator {

    void validateCoupon(String code);

    static boolean isLengthValid(String code){
        return code.length() >=5;
    }
}

    class ShoppingCart implements CouponValidator{
        
        public void validateCoupon(String code){
            if(CouponValidator.isLengthValid(code) && code.startsWith("SAVE")){
                    System.out.println(code + " VALID CODE");
            }else{
                        System.out.println(code + " INVALID CODE");
                    }
            }
        }
    public class Main{
        public static void main(String[] args) {
            
        }
            String coupons[] = {"SAVE10","SAVE20","OFF10"};

            ShoppingCart cart = new ShoppingCart();

            for(String code: coupons){
                cart.validateCoupon(code);
            }
        }
    }

 

class nestedif{
    public static void main(String[] args){

        boolean kfc = true;
        boolean chicken = false;
        boolean ipay = true;

        if (kfc){
            System.out.print("I eat ");
            
            if(chicken){
                System.out.print("Chicken ");
                
                if(ipay){
                    System.out.print("and i will pay the chicken");
                }
                
            
            }
        }
    }
}
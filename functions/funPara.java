class funPara{
    void sum(int n1,int n2){
        System.out.println(n1+n2);

    }
    void sub(int n1,int n2){
        System.out.println(n1-n2);

    }
    void mul(int n1,int n2){
        System.out.println(n1*n2);

    }
    void div(int n1,int n2){
        System.out.println(n1/n2);

    }
    public static void main(String args[]){

        funPara obj = new funPara();
        obj.sum(10,20);
        obj.sub(10,20);
        obj.mul(10,20);
         obj.div(10,20);
    
    
    }

}
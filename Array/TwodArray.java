class TwodArray{
    public static void main(String args[]){

        int [][] aaa =new int[3][3];
        int[][] aa ={
            {1,3,3},
            {5,6,7},
            {7,4,3}
        };
        for(int i = 0;i<3;i++){
            for(int j = 0; j<3;j++){
                System.out.print(aa[i][j]+ " ");

            }
            System.out.println();
        }
        
    }
}
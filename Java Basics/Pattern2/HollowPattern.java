public class HollowPattern{
    public static void hellow_Pattern(int totRows,int totCols){
         for(int i  = 1;i<=totRows;i++){
            //inner loop
            for(int j = 1;j<=totCols;j++){
                //cell-(i,j)
                if(i == 1|| i == totRows || j == 1||j == totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        hellow_Pattern(4,5);
    }
}
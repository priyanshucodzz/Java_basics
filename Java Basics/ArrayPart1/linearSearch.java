import java.util.*;
public class linearSearch {
    public static int LinearSearch(int number[],int key){
    for(int i = 0;i<number.length;i++){
        if(number[i] == key){
            return i;
        }
    }
    return -1;
} 
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16};
        int key = 20;
        int index = LinearSearch(number, key);
        if(index == -1){
            System.out.println("Key is not found");
        }else{
            System.out.println("Key is found" + key + "index" + index );
        }
    }
}

import java.util.Scanner;

class Main{

    public static int smallest(int[] array, int size){
        int min = array[0];
        for (int i = 0;i<size;i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    public static void removefirst(int[] array,int size) {
        for(int i=1;i<size;i++){
            array[i-1]=array[i];
        }
    }

    public static void rotateright(int[] array, int size){
        int temp=array[0];
        for(int i=1;i<size;i++){
            array[i-1]=array[i];
        }
        array[size-1]=temp;
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int operation = 0;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        while(size!=0){
            int smallest = smallest(array,size);
            if(array[0]==smallest){
                removefirst(array,size);
                size--;
                operation++;
            }
            else{
                rotateright(array,size);
                operation++;
            }
        }

        System.out.println("The Total Number of Operations are : "+operation);
        
    }
}
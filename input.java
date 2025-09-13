import java.util.Scanner;

public class input {
   static Scanner read= new Scanner(System.in);
   static int[] arr;
   static int nElems;
   static int j;
   static  int searchKey;
    public void in(){
        arr= new int[100];
        nElems=0;
        System.out.println("Enter 10 integer numbers: ");
        for (int j = 0; j < 10; j++) {
            arr[nElems++] =read.nextInt();
        }
        System.out.println("The set contains: ");
        for (j=0; j<nElems; j++)
            System.out.print(arr[j] + " ");
        System.out.println("");
    }

    public void getSearchKey() {
        System.out.print("Search for key: ");
        searchKey= read.nextInt();
        for ( j = 0; j < nElems; j++) {
            if (arr[j] == searchKey)
                break;
        }
            if (j==nElems)
                System.out.println("Can't find "+ searchKey);
            else
                System.out.println("Found "+ searchKey);

    }

    public void delete(){
        System.out.println("Delete key: ");
        searchKey=read.nextInt();
        boolean found =false;
        for ( j = 0; j < nElems; j++)
            if (arr[j]==searchKey){
                found=true;
                break;
            }
        if (found){
            System.out.println("Deleting "+ searchKey);
            for (int k = j; k < nElems; k++) {
                arr[k]= arr[k+1];
            }
            nElems--;
        }else
            System.out.println("Can't find "+searchKey);
    }

}

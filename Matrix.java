import java.util.Scanner;

class Matrix{

     public static void main(String []args){
        int n,i,j,choice;
        Scanner input = new Scanner(System.in);
		System.out.println("Enter n value to perform operation on n*n matrix:");
		n = input.nextInt();
		int arr1[][] = new int[n][n];
		int arr2[][] = new int[n][n];
		System.out.println("Enter matrix 1 elements:");
        for (i = 0;i < n;i++){
            for (j = 0;j < n;j++){
                arr1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter matrix 2 elements:");
        for (i = 0;i < n;i++){
            for (j = 0;j < n;j++){
                arr2[i][j] = input.nextInt();
            }
        }
        int sum[][] = new int[n][n];
        int prod[][] = new int[n][n];
        System.out.println("1.Add\n2.Product");
        System.out.println("Enter choice:");
        choice = input.nextInt();
        switch(choice){
            case 1:
                add(arr1,arr2,n);
                break;
            case 2:
                product(arr1,arr2,n);
                break;
        }
    }

    static void add(int arr1[][],int arr2[][],int n){
        int sum[][] = new int[n][n];
        int i,j;
        System.out.println("Sum:");
        for (i = 0;i < n;i++){
            for (j = 0;j < n;j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void product(int arr1[][],int arr2[][],int n){
        int prod[][] = new int[n][n];
        int i,j,k;
        System.out.println("Product:");
        for (i = 0;i < n;i++){
            for (j = 0;j < n;j++){
                prod[i][j]=0;      
                for(k = 0;k < n;k++){
                    prod[i][j]+=arr1[i][k]*arr2[k][j];      
                }
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }
    }
}

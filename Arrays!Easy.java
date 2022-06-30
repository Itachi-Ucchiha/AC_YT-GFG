public class LeaderElements {

    static void getMinMax(int a[], int n)  
    {
        int max = a[0];    
        int min = a[0];   
        for(int i = 0; i<n ;i++){   // compare the max and min with rest of the array elements
            if(a[i]>max){   // if any number found greater than max- change the max value to that number
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];     // if any number found smaller than min- change the min value to that number
            }
        }
        System.out.println("max num is: "+max +" \nand min is : "+min);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 56, 10000, 167};
        int n = arr.length;
        getMinMax(arr, n);
    }
}



//  outpu -------------------------
// max num is: 10000
// and min is : 1

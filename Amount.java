// Input an amount from the user and find out the number of notes from input amount in given array
//[1000,500,100,50,20,10,5,2,1]
//Input: 1256
//Output:
//1000 1
//100 2
//50 1
//2 3
public class Amount {
    public static int getThirdLargest(int[] a, int total){
            int t;
            for (int i = 0; i < total; i++)
            {
                for (int j = i + 1; j < total; j++)
                {
                    if (a[i] > a[j])
                    {
                        t = a[i];
                        a[i] = a[j];
                        a[j] = t;
                    }
                }
            }
            return a[total-3];
        }
        public static void main(String args[]){
            int a[]={1000,500,100,50,20,10,5,2,1};
            System.out.println("Third Largest: "+getThirdLargest(a,9));
        }}

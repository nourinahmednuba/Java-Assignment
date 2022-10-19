//Suppose, in a company , here are some employee salaries in an array
//[35000, 25000, 28000, 32500, 44000, 32800]
//Find out the 3rd highest salary

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
            int a[]={35000,25000,28000,32500,44000,32800};
            System.out.println("Third Largest: "+getThirdLargest(a,6));
        }}

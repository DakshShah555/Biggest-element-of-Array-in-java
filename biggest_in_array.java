// largest and smallest value in an array  TIME COMPLEXITY=O(n)

public class biggest_in_array {
    public static int big_number(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<number.length;i++)
        {
            if (largest<number[i]){
                largest=number[i];
            }
            if (smallest>number[i]){
                smallest=number[i];
            }

        }
        return largest;
    }

    public static void main(String[] args) {
        int number[]={1,5,6,8,9};

        System.out.println("Largest value is :"+big_number(number));

    }

}

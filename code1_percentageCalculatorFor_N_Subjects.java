import java.util.Scanner;

class code1_percentageCalculatorFor_N_Subjects{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of subjects: ");
        int nSub = sc.nextInt();

        int sum = 0;
        int subMarks = 0;
        float percentage = 0.0f;

        for(int i=0; i<nSub; i++){
            System.out.println("Enter the score of sub-" + (i+1) + ": ");
            subMarks = sc.nextInt();
            sum = sum + subMarks;
        }
        
        percentage = ((float)sum/(nSub * 100)) * 100;

        System.out.printf("Your percemtage is: %.2f", percentage);
    }
}
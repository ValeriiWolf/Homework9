public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1(){
        int[ ] arr = generateRandomArray();
        int summ=0;
        for (int i=0;i<30;i++){
            summ=summ+arr[i];
        }
        System.out.println("Сумма трат за месяц составила "+summ+" рублей");
    }

    public static void task2(){
        int[ ] arr=generateRandomArray();
        int min=arr[0];
        int max=arr[0];
        for (int i=1;i<30;i++){
            if (arr[i]<min){
                min=arr[i];
            } else if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей. Максимальная сумма трат за день составила "+max+" рублей");
    }

    public static void task3(){
        int[ ] arr = generateRandomArray();
        int summ=0;
        int intAvgSumm=0;
        double dobAvgSumm=0.;
        for (int i=0;i<30;i++){
            summ=summ+arr[i];
        }
        intAvgSumm=summ*100/30;
        dobAvgSumm=intAvgSumm/100.;
        System.out.println("Средняя сумма трат за месяц составила "+dobAvgSumm+" рублей");
        //if(summ%30==0){intAvgSumm=summ/30;
        //System.out.println("Средняя сумма трат за месяц составила "+intAvgSumm+" рублей");
        //}else{
        //    dobAvgSumm=summ/30.;
        //    System.out.println("Средняя сумма трат за месяц составила "+dobAvgSumm+" рублей");
        //}
    }

    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int lengthArray=reverseFullName.length;
        for(int i=lengthArray-1;i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }System.out.println();
    }
}
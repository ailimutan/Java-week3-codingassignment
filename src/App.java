import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        //item #1
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(3);
        ages.add(9);
        ages.add(23);
        ages.add(64);
        ages.add(2);
        ages.add(8);
        ages.add(28);
        ages.add(93);
        
        //item #1.a
        displayFirstElementMinusLast(ages);
        
        //item #1.b
        ages.add(21);
        ages.add(18);
        
        //item #1.c
        displayAverageAge(ages);
        
        
        //item #2       
        ArrayList<String> names = new ArrayList<>();
        names.add("Sam");
        names.add("Tommy");
        names.add("Tim");
        names.add("Sally");
        names.add("Buck");
        names.add("Bob");
        
        //item #2.a
        System.out.println("\n");
        calculateAverageLettersPerName(names);
        
        //item #2.b
        System.out.println("\n");
        concatenateListOfValues(names);
        
        //item #3
        displayFirstElement(names);
        
        //item #4
        displayLastElement(names);
        
        //item #5
        ArrayList<Integer> nameLengths = getNameLengthsArray(names);
        
        //item #6
        System.out.println("\n");
        sumOfNameLengths(nameLengths);
        
        
        //item #7
        System.out.println("\n");
        replicateStringValue("Hello", 3);
        
        //item #8
        displayFullName("Bob","Ong");
        
        //item #9
        isSumGreaterThanOneHundred(ages);
        
        //items #10
        ArrayList<Double> listA = new ArrayList<>();

        listA.add(10.5);
        listA.add(40.0);
        listA.add(20.3);
        listA.add(11.3);
        
        //item #11
        ArrayList<Double> listB = new ArrayList<>();
        
        listB.add(10.5);
        listB.add(30.0);
        listB.add(25.3);
        listB.add(10.1);

        compareTwoArrayList(listA,listB);
        System.out.println("\n");
        
        //item #12
        System.out.println(willBuyDrink(true,10.4));
        System.out.println(willBuyDrink(false,10.50));
        System.out.println(willBuyDrink(true,10.5));
        System.out.println(willBuyDrink(true,10.6));
        System.out.println(willBuyDrink(false,10.6));
        
        //item #13
        
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(20);
        list.add(22);
        list.add(2);
        
        System.out.println("\nCHECK IF LIST HAS ODD NUMBER");
        System.out.println(checkListIfOddNumbers(list));
        
        list.add(11);
        System.out.println(checkListIfOddNumbers(list));
    
        
    }
    
    public static void displayFirstElementMinusLast(ArrayList<Integer> list) {
        Integer result = list.get(0) - list.get(list.size()-1);
        System.out.println("First Element: " + list.get(0));
        System.out.println("Last Element: " + list.get(list.size()-1));
        System.out.println("First Element minus the last element is equal to "+result);
    }
    
    public static void displayAverageAge(ArrayList<Integer> list) {
        Double average = 0.0;
        Double sum = 0.0;
        System.out.print("The average of ages { ");
        for(int i = 0 ; i < list.size() ; i ++ ) {
            sum = sum + list.get(i);
            System.out.print(list.get(i)+" ");
        }
        
        average = sum / list.size();
        System.out.print("} is "+ average);
    }
    
    public static void calculateAverageLettersPerName(ArrayList<String> list) {
        Double average = 0.0;
        Double sum = 0.0;
        System.out.print("The average number of letter of names { ");
        for(int i = 0 ; i < list.size() ; i ++ ) {
            sum = sum + list.get(i).length();
            System.out.print(list.get(i)+" ");
        }
        
        average = sum / list.size();
        System.out.print("} is "+ average);
        
    }
    
    public static void concatenateListOfValues(ArrayList<String> list) {
        String result = "";
        for(int i = 0 ; i < list.size() ; i ++ ) {
            result = result + list.get(i)+" ";
        }
        
        System.out.println(result);
    }
    
    public static void displayFirstElement(ArrayList<String> list){
        String firstElement = list.get(0);
        System.out.println("First Element:"+ firstElement);
    }
    
    public static void displayLastElement(ArrayList<String> list){
        String lastElement = list.get(list.size()-1); // given that list != 0 {you can have a null checker here
        System.out.println("Last Element:"+ lastElement);
    }
    
    public static ArrayList<Integer> getNameLengthsArray(ArrayList<String> list) {

        ArrayList<Integer> nameLengths = new ArrayList<>();
        System.out.print("The length of letters of names { ");
        for(int i = 0 ; i < list.size() ; i ++ ) {
            nameLengths.add(list.get(i).length());
            System.out.print(list.get(i).length()+" ");
        }
        
        System.out.print("}");
        
        return nameLengths;
        
    }
    
    public static void sumOfNameLengths(ArrayList<Integer> list) {
        int sum = 0;
        System.out.print("The sum of letter's length of names { ");
        for(int i = 0 ; i < list.size() ; i ++ ) {
            sum = sum + list.get(i);
            System.out.print(list.get(i)+" ");
        }
        
        System.out.print("} is "+ sum);
    }
    
    public static void replicateStringValue(String word, int n) {
        String result = "";
        for(int i = 0 ; i < n ; i ++ ) {
            result = result + word;
        }
        
        System.out.println(result);
    }
    
    public static void displayFullName(String firstName, String lastName) {
        String result = "";
        result = firstName +" "+ lastName;
        System.out.println("The full name is "+ result);
    }
    
    
    public static void isSumGreaterThanOneHundred(ArrayList<Integer> list) {
        int sum = 0;
        System.out.print("The sum of letter's length of names { ");
        for(int i = 0 ; i < list.size() ; i ++ ) {
            sum = sum + list.get(i);
            System.out.print(list.get(i)+" ");
        }
        System.out.print("} is "+ sum + "\n");
        
        if(sum > 100) {
            System.out.println("true"); // can be changed to boolean type
        }
    
    }
    
    public static Double getAverage(ArrayList<Double> list) {
        Double sum = 0.0;
        Double average = 0.0;
        
        System.out.print("The average of double numbers { ");
        for(int i = 0 ; i < list.size() ; i ++ ) {
            sum = sum + list.get(i);
            System.out.print(list.get(i)+" ");
        }
        average = sum / list.size();
        System.out.print("} is "+ average);
        
        return average;
    
    }
    
    
    
    public static void compareTwoArrayList(ArrayList<Double> listA, ArrayList<Double> listB ) {
        Double firstListAverage = getAverage(listA);
        System.out.println("\n");
        Double secondListAverage = getAverage(listB);
        
        System.out.println("\n");
        if(firstListAverage> secondListAverage) {
            System.out.println("true");  // can be changed to boolean type
        }
    }
    
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        if(isHotOutside == true && moneyInPocket > 10.50) {
            return true;
        }
    
        return false;
    }
    
    public static boolean checkListIfOddNumbers(ArrayList<Integer> list) {
        boolean hasOddNumber = false;
        for(int i = 0 ; i < list.size() ; i ++ ) {
            if(list.get(i) % 2 != 0) {
                hasOddNumber = true;
            }
        }
        return hasOddNumber;
    }

}

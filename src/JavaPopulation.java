public class JavaPopulation {
    public static void main(String[] args){
        //Convert days to seconds
        int seconds = (365 * 24 * 60 * 60);
        int pop = 312032486;
        int birth = (seconds / 7);
        int death = (seconds / 13);
        int immigrant = (seconds / 45);
        int birthDeathRate = (birth + immigrant - death);
        int yearOne = pop + birthDeathRate;
        int yearTwo = yearOne + birthDeathRate;
        int yearThree = yearTwo + birthDeathRate;
        int yearFour = yearThree + birthDeathRate;
        int yearFive = yearFour + birthDeathRate;

        System.out.println("Year 1 population = " + yearOne);
        System.out.println("Year 2 population = " + yearTwo);
        System.out.println("Year 3 population = " + yearThree);
        System.out.println("Year 4 population = " + yearFour);
        System.out.println("Year 5 population = " + yearFive);
    }
}

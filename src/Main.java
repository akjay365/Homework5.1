import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int age = 17;
        if (age > 18) {
        System.out.println("Ты можешь водить ");}
        else { System.out.println("Ты не можешь водить");

        }


        int age1 = 16;
        if (age1 >= 18) {
            System.out.println("Поздравляем с совершеннолетием");}
        if (age1 < 18) {
            System.out.println("возраст совершеннолетия ещё не наступил, нужно немного подождать!");
        }




        int age2 = 2;
        if (age2 > 7&&age2 < 18)  {
            System.out.println("ребенок ходит в школу");
        }
        if (age2 >=18&&age2 <24) {
            System.out.println("человек уже закончил школу и может отправляться в университет!");
        }
        if (age2 >=24){
            System.out.println("человек окончил университет и ему пора искать первую работу!");
        }

        int capacity = 32;
         if (capacity <60) {
             System.out.println("В вагоне есть сидячие места!");}
         if (capacity > 60&&capacity<102){
                 System.out.println("В вагоне остались только стоячие места!");
             }
         if (capacity >102){
                 System.out.println("В вагоне нет мест");
             }



         boolean skyIsClear = true;
        if (skyIsClear) {
             System.out.println("Небо чистое");

         }


        int age6 = 19;
        boolean canNotGoToSchool = age6 < 7 || age6 > 18;
                if (age6 >= 18 && age6 < 21) {
                    System.out.println("Ты достаточно взрослый, чтобы водить, но недостаточно, чтобы пить алкоголь");
                }
                if (canNotGoToSchool) {
                    System.out.println("Я думаю ты не ходишь в школу");
                }



                int age777 = 26;
                if (age777 >=2&&age777<=6) {
                    System.out.println("Если возраст человека равен " + age777 + " то ему нужно ходить в детский сад!");
                }
                if (age777 >=7&&age777<=18){
                    System.out.println("Если возраст человека равен " + age777 + " то ему нужно ходить в школу!");
                }
                if (age777 > 18&&age777<24){
                    System.out.println("Если возраст человека равен " + age777 + " то ему нужно ходить в университет!");
                }
                if (age777>24) {
                    System.out.println("Если возраст человека равен " + age777 + " то ему нужно ходить на работу!");
                }



                int age123=10;
                if (age123>5&&age123<14){
                    System.out.println("Если ребенку " + age123 + " лет,то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
                } else if (age123<5){
                    System.out.println("Если ребенку " + age123+ " года,то он не может кататься на аттракционе.");
                } else if (age123>14){
                    System.out.println("Если ребенку "+age123+ " лет,то он может кататься без сопровождения взрослого.");
                }



        int one = 1;
        int two = 2;
        int free = 3;
        if (two > one)
        {
            if (free > two){
                System.out.println(free);
            } else {
                System.out.println(two);
            }

        }























    }


}
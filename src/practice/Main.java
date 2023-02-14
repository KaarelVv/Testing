package practice;

public class Main {
    public static void main(String[]args){
        acceptValueAndPrint(10);




    }


    private static void acceptValueAndPrint(Object o) {
        System.out.println(o.toString());

    }

//    method for datatype
//    one method for one job

    private static void detectDataTyoe(Object o){
        String output = "";

        try {
            Integer o1 = Integer.parseInt((o.toString()));
            output = "inr -> " + o1;


            acceptValueAndPrint("str -> " + o1);
        }catch (Exception ew){
            System.out.println(ew.getMessage());
        }
    }
}



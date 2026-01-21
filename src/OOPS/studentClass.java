package OOPS;

public class studentClass {
    //creating a new data type
    public static class Student{
        String name ;
        int rno;
        double percent;
    }

    public static class Car {
        String name;
        String type;
        int price;
    }
    public static void main(String[] args) {


        //x and y --> object
        Student x = new Student();
        x.name = "Priya";
        x.rno = 47;
        x.percent = 71.8;
        System.out.println(x.percent + 8);

        Student y = new Student();
        y.name = "Tanya";
        y.rno = 63;
        y.percent = 73.8;
        System.out.println(y.percent + 8);

//        Car  c1 =  new Car();
//        c1.name = "Alto";
//        c1.price = 400000;
//        c1.type = "hatchback";

    }
}



import Exceptions.Checked.FileWorking;
import Exceptions.Unchecked.AccessArray;
import Exceptions.Unchecked.ArithmaticNumeric;
import Exceptions.Unchecked.NullPointer;
import Exceptions.UserDefined.SizeDifferenteException;
import Exceptions.UserDefined.WordGame;
import Exceptions.UserDefined.WrongNameException;
import Generics.*;
import Generics.Frutes.Apple;
import Generics.Frutes.IFruite;
import Generics.Frutes.Orange;
import Generics.Goods.Clock;
import Generics.Goods.Shirt;
import Generics.Goods.TV;
import Interfaces.RobotsFlyingObject.IRobot;
import Interfaces.RobotsFlyingObject.RobotChicken;
import Interfaces.SalesTax.TaxCalculator;
import Interfaces.Shape.*;
import Interfaces.ShapeLab.ShapeFactory;

import java.io.IOException;
import java.text.MessageFormat;
import Collections.Maps.Transcript;
import ProjectPresentation.PlanPresentation;
import Collections.StackExample;


import java.util.*;

public class HelloWorld {


    public static void main(String[] args)  {

        Fibo fibo = new Fibo();
        System.out.println(fibo.createFibo(5));


//        Transcript tr = new Transcript();
//        tr.createPrintTranscript("./src/transcripts.txt");

//        StackExample qe = new StackExample();
//        qe.creatStack();

//        PlanPresentation pp = new PlanPresentation();
//        pp.planPresentation();

    }





    public static int add(int a ,int b){
        int result = -1;
        try{
            result = a/b;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            return result;
        }
    }




    public static void trySortingPeopleByNatualComparison(){

        Transcript test = new Transcript() ;
      //  test.ReadingFile("./src/transcripts.txt");

//
//        List<Person> people= new ArrayList<>();
//        people.add(new Person("faya", 39));
//        people.add(new Person("Lucas", 18));
//        people.add(new Person("Abad", 18));
//        people.add(new Person("Yav", 18));
//
//        System.out.println("before sort \n" + people);
//
//        //System.out.println("****************\n\n\n"+people.get(2));
//
//        Collections.sort(people);
//
//        System.out.println("after sort \n" + people);
//
//
//        Collections.sort(people, new PersonComaparator());
//
//        System.out.println("after sort with Comparartor: \n" + people);


    }




    public static void tryInvoice(){

        Invoice<TV> invoice = new Invoice<TV>();
        TV tv = new TV(600);
        invoice.setItem(tv);

        System.out.print("What province did you purchase it from?");

        Scanner scanner = new Scanner(System.in);
        String province = scanner.nextLine();

        try {
            System.out.println("the tax calculated for the item is : "+ invoice.calculateTax(province));
        } catch (WrongNameException e) {
            //e.printStackTrace();
            System.out.print("You entered a wrong province, do you want to try it again?");
            scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("y")){
                tryInvoice();
            }
        }


    }





//    ArrayList<String> GiveQuestioList(){
//        ArrayList<String> questions = new ArrayList<>();
//        questions.add("What was the name of the second US president?");
//        questions.add("What ");
//    }









    public static void tryGenerateHashmap()throws SizeDifferenteException {
        List<Integer> keys  = new ArrayList<>();
        keys.add(1);
        keys.add(2);

        List<Shirt> shirts = new ArrayList<>();
        Shirt firstItem = new Shirt(40);
        firstItem.setName("blueSirt");
        shirts.add(firstItem);

        Shirt secItem = new Shirt(90);
        secItem.setName("redSirt");
        shirts.add(secItem);


       Toolbox.generateHashmap(keys, shirts);
    }




    public static void tryChangeName(){
        Clock cl = new Clock(500);
        cl.setName("my_clock");
        Toolbox.changeName(cl);
        System.out.println(cl.getName());


        Shirt sh = new Shirt(30);
        sh.setName("my_pretty_shirt");
        Toolbox.changeName(sh);
        System.out.println(sh.getName());
    }




    static void tryObjectStore(){
        ObjectStore<IFruite> os = new ObjectStore();
        Apple apple = new Apple();
        os.setObj(apple);
        os.print();
        Apple apple2 = (Apple)os.getObj();
        System.out.println( apple2.getType());


        Orange orange = new Orange();
        os.setObj(orange);
        Apple apple3 = (Apple)os.getObj();
        System.out.println( apple3.getType());
    }





    static void tryStore(){
//        Store<Clock> st = new Store<>();
//        Clock cl1 = new Clock(100);
//        st.FillInventory(cl1);
//        st.FillInventory(new Clock(5000));
//
//        Clock cl2 = st.getOneItemFromInventory();
//        cl2.PrintEpecifications();

        Store<Shirt> shirts = new Store<>();

        shirts.FillInventory(new Shirt(20));
        shirts.FillInventory(new Shirt(78));
        shirts.FillInventory(new Shirt(90));

       shirts.printReport();

       shirts.getOneItemFromInventory();

       System.out.println("After taking one shirt out ************************");

       shirts.printReport();
    }




    static void tryGenericMethod(){
        GenericMethod gm = new GenericMethod();

        String str = "fatemeh";
        gm.genericDisplay(str);

        gm.genericDisplay(new WordGame());

        gm.genericDisplay(new WrongNameException("test generics"));

        gm.genericDisplay(new ArrayList<Integer>());

        gm.genericDisplay("fatemeh");
    }









    static void tryAccessArray(){
        AccessArray aa = new AccessArray();
        String[] ary = new String[]{"spring", "summer", "fall", "winter"};
        String found =  aa.getString(null, 1);
        System.out.println("The value found is "+found);
    }


    static void tryWordGame() throws IOException {
        WordGame game = new WordGame();
        game.startGame();
    }










    static void tryNullPointer(){
        NullPointer np = new NullPointer();
        try {
            np.ShapeNull();
        } catch (WrongNameException e) {
            e.printStackTrace();
        }
    }


    static void tryFileWorking(){
        FileWorking fw = new FileWorking();
        fw.ReadingFile();
    }


  static void tryDivideByZero(){
      ArithmaticNumeric an = new ArithmaticNumeric();
      int y = an.divideByZero(9, 0);
      System.out.println("The result of the division is:"+y );
  }









    static void TryRobotChicken(){
        IRobot ichick = new RobotChicken(3,"chickChic");
        RobotChicken chick = (RobotChicken)ichick;
        System.out.println("My name is :" + chick.getName());
        chick.speak();
       // System.out.println(chick.getName());


        System.out.println("my charging time is: " + chick.calculateChargingTime());
        System.out.println("I can fly: " + chick.getFlyingDistance() + "meters");
        // self destruct
        chick.selfDestruct();
        System.out.println("After self destruct my layingegg is: " + chick.getEggLayingRate());
    }

    static void TryCalculator(){

        TaxCalculator calculator = new TaxCalculator();
        double price = 40;
        double tax = 0;
        try {
            tax = calculator.CalculateTax(price, "gggg");
            System.out.println("the tax on the item purchased as "+price+ "$ is: " + tax + "$" );
        } catch (WrongNameException e) {
            e.printStackTrace();
        }
    }


    static void TryFactory(ShapeFactory factory){
//        IShape2 sq = factory.GetShape("SQuare");
//        if(sq != null){
//            sq.Introduce();
//        }else{
//            System.out.println("the created object is null");
//        }
//
//        IShape2 faya = factory.GetShape("faya");
//        faya.Introduce();
//        if(faya != null){
//            faya.Introduce();
//        }else{
//            System.out.println("the created object is null");
//        }




    }




    static void TryShape(){
        ArrayList<IShape> shapes = new ArrayList<IShape>();
        ArrayList<IAngle> angles = new ArrayList<IAngle>();



        IShape square = new Square(6);

        IAngle square_1 = new Square(8);


        shapes.add(square);
        angles.add(square_1);

        IShape circle = new Circle(5);
        shapes.add(circle);
        IShape rectangle = new Rectangle(7, 8);
        shapes.add(rectangle);

        Display display = new Display();

//        for(int i=0; i< shapes.size()-1; i+=2){
//            display.printAreaEnvironment(shapes.get(i));
//        }

        for(IShape shape : shapes){
            display.printAreaEnvironment(shape);
        }
    }




    static void TryTaxCalcultor() throws WrongNameException {
        TaxCalculator calculator = new TaxCalculator();
        double price = 20;

        double ontarioTax = calculator.CalculateTax(price, "Ontario");
        double quebecTax = calculator.CalculateTax(price, "Quebec");
        double albertaTax = calculator.CalculateTax(price, "Alberta");


        System.out.println(MessageFormat.format("Ontario Tax on something with price {0}$: {1}", price, ontarioTax));
        System.out.println(MessageFormat.format("Quebec Taxon something with price {0}$: {1}", price, quebecTax));
        System.out.println(MessageFormat.format("Alberta Taxon something with price {0}$: {1}", price, albertaTax));
    }

}

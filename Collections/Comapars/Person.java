package Collections.Comapars;

public class Person implements Comparable<Person> {

    // we compare people based on their age


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int age;

   @Override
    public int compareTo(Person o) {

       if(o == null){
           return  -1;
       }

        if(this.age == o.age){
            return 0;
        }else if(this.age > o.age){
            return 1;
        }
        return -1;
    }

    @Override
    public String toString(){
       return "Person name: " +this.name+"  age:" + this.age;
    }
}

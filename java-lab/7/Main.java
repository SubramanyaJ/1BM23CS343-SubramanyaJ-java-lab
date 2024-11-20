/*  Write a program that demonstrates handling of
    exceptions in inheritance tree. Create a base class called
    “Father” and derived class called “Son” which extends the
    base class. In Father class, implement a constructor which
    takes the age and throws the exception WrongAge( ) when
    the input age<0. In Son class, implement a constructor
    that uses both father and son’s age and throws an
    exception if son’s age is >=father’s age.
*/

class WrongAge extends Exception{
    WrongAge(){
        ;
    }

    public String toString(){
        return "Age cannot be less than zero!";
    }
}

class WrongSonAge extends Exception{
    WrongSonAge(){
        ;
    }

    public String toString(){
        return "Son's age cannot be more than father's age!";
    }
} 

class Father{
    int father_age;

    Father(int age) throws WrongAge{
        if(age < 0){
            throw new WrongAge();
        }
        this.father_age = age;
    }
    void show(){
        System.out.println("Father's age is " + father_age);
    }

}

class Son extends Father{

    int son_age;

    Son(int fage, int sage) throws WrongSonAge{
        super(fage);
        if(fage < sage){
            throw new WrongSonAge();
        }
        this.son_age = sage;
    }
    void show(){
        super.show();
        System.out.println("Son's age is " + son_age);
    }

}

class Main{

    public static void main(String argv[]){

        Father f = new Father(-1);

    }

}
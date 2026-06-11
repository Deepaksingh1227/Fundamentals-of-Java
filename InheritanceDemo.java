public class InheritanceDemo {
//     class Animal{
//         void run(){
//             System.out.println("Running speed of animals are to good");
//         }
//         void power(){
//             System.out.println("Animals are very powerful");
//         }
//     }
//     class Dog extends Animal{
//         void live(){
//             System.out.println("Dog  lives with humans");
//         }
//         void loyal(){
//             System.out.println("Dogs are very loyal to his owner");
//         }

//     }
//     public static void main(String args[]){
//         InheritanceDemo obj= new InheritanceDemo();
//         Animal A1= obj.new Animal();
//         A1.power();

//         Dog D1= obj.new Dog();
//         D1.loyal();
//         D1.run();



//     }
// }


    // interface Lion{
    //     void eat();
        
    // }
    // interface Elephant{
    //     void largest();
    // }

    // class Animal implements Lion, Elephant{
    //     public void eat(){
    //         System.out.println("He is non-Veg");
    //     }
    //     public void largest(){
    //         System.out.println("He is one of the largest animal");

    //     }
    // }
    // public static void main(String args[]){
    //     InheritanceDemo obj= new InheritanceDemo();
    //     Animal A= obj.new Animal();

    //     A.eat();
    //     A.largest();
    //}


    class Parent{
        Parent(){
            System.out.println("its Parent class");

        }
    }
    class Child extends Parent{
        Child(){
            System.out.println("its Child class");
        }
    }

    public static void main (String args[]){
        InheritanceDemo obj= new InheritanceDemo();

        Child c= obj.new Child();
        
    }
}
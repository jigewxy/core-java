package learnjava;


public class Dog extends Animal {

    String type;
    String name;
    public Dog(String type, String name ){
        super("quanke", "land", "meat");
        this.type= type;
        this.name = name;
    }

    public void speak(){

        System.out.println("Dog speaks 'Woo Woo'");
    }

    public void showDetails(){

        System.out.println("category:"+this.category+"; Eat: "+this.food + "; His name is "+ this.name);

    }

}


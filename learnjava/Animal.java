package corejava.learnjava;

public class Animal{

    String category;
    String area;
    String food;

    public Animal(String category, String area, String food){

        this.category = category;
        this.area = area;
        this.food = food;
    }

    public void lives(){

        System.out.print("This animal lives in"+this.area);
    }

    public void eat(){

        System.out.println("This animal eat in" + this.food);

    }

}

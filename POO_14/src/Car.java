
public class Car {
    String color;
    String brand;
    String model;

    int actualSpeed;

    public Car(String  color,String  brand,String  model ){

        // This atribui para esse parâmetro

        this.color = color;

        this.brand = brand;

        this.model = model;

        this.actualSpeed = 0;
    }

    public void Light(){
        System.out.println("The car" + this.model + "is light");
    }

    public void Acelerate(int increment){
        this.actualSpeed += increment;
        System.out.println("Acelerating... actual speed: " + this.actualSpeed + "Km/h");
    }

    public void Brake(int decrement){
        if (actualSpeed - decrement >= 0){
            this.actualSpeed -= decrement;
            System.out.println("Braking");
            this.actualSpeed -= decrement;
            System.out.println("Braking... actual speed: " + this.actualSpeed + "Km/h");
        }else {
            System.out.println("The car stops");
        }

    }

    public void Turnoff(){
        System.out.println("The car" + this.model+ "Turned off" );
    }

    public void ShowInformation(){
        System.out.println("--------Informations--------");
        System.out.println("Brand:" + this.brand);
        System.out.println("Brand:" + this.model);
        System.out.println("Color:" + this.color);
        System.out.println("Speed:" + this.actualSpeed + "Km/h");
        System.out.println("----------------");
    }
}

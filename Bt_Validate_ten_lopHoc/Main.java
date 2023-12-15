package Bt_Validate_ten_lopHoc;

public class Main {
    public static void main(String[] args) {
        String[] className = new String[]{"C0223G","A0323K","M0318G","P0323A"};
        ExampleClassName example = new ExampleClassName();

        for (String name : className){
            System.out.println("Class name " + name + " : " + example.validate(name));
        }
    }
}

package dxc;

class DataTypesDemo{

    public static void main(String[] args) {
        int price = 100; //primitive data type
        double discount = 25.5;
        String size = "Medium"; //non-primitive data type
        
        System.out.println("Prize after discount: "+price*(1-discount/100));
        
        //Variable declared using var keyword
        String customerName = "Rob Jones"; // infers String
        System.out.println( customerName +" ordered a "+size+" pizza");
        
    }
}

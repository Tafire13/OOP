public class Family {
    public static void main(String[] args) {
        People beckham = new People("Beckham", 'M' ,"Home");
        People Victoria = new People("Victoria", 'F', "Home");
        Children brooklyn = new Children("Brooklyn", 'M',"MSU", beckham, Victoria);
        Children harper = new Children("Harper", 'F',"MSU" , beckham, Victoria);
        System.out.println(harper.respecTo(new People("King", 'M', "Anywhere")));
    }
}

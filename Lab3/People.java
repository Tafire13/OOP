public class People{
    public String name;
    public char gender;
    private String workplace;

    
    People(String name, char gender){
        this.name = name;
        this.gender = gender;
    }
    People(String name, char gender, String workplace){
        this(name, gender);
        this.workplace = workplace;
    }
    public String getWorkplace(){
        return this.workplace;
    }

}
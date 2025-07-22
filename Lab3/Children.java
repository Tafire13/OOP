public class Children extends People  implements GoodChildren{
    private People father;
    private People mother;
    private String school;

    Children(String name, char gender ,People father, People mother) {
        super(name, gender);
        this.father = father;
        this.mother = mother;
    }

    public Children (String name, char gender, String school, People father, People mother) {
        this(name, gender, father, mother);
        this.school = school;
    }
    @Override
    public String toString(){
        if (super.gender == 'M') {
            return this.name + "\tBoy";
        }
        else{
            return this.name + "\tGirl";
        }
    }

    public People getNameFather(){
        return this.father;
    }
    public People getNameMother(){
        return this.mother;
    }
    @Override
    public String getWorkplace() {
        return "I'm studying right now.\t"+this.school;
    }

    @Override
    public boolean equals(Object parent) {
        People Person = (People)parent;
        if (parent.equals(this.mother)) {
            System.out.println("I love my mom the most. Happy Mother's Day.");
            return true;
        }
        else{
            System.out.println("Not my mother.");
            return false;
        }
    }
    @Override
    public String respecTo(People people){
        String twang = "Kub";
        if (this.gender == 'F') {
            twang = "Ka";
        }
        if(people.equals(this.father)){
            return "Hello "+twang + " Father";
        }else if(people.equals(this.mother)){
            return "Hello "+twang + " Mother";
        }else{
            return "Hello " + twang;
        }
    }
}

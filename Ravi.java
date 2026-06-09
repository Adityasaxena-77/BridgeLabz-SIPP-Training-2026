class Ravi
{
    String name;
    int age;
    String rank;
    double salary;
    float fees;

    public Ravi(String name, int age, String rank, double salary, float fees){
        this.name=name;
        this.age=age;
        this.rank=rank;
        this.salary=salary;
        this.fees=fees;

    }

    public static void main(String[] args){
        Ravi r=new Ravi("sahil",18,"intermidiate",18000.00,12345f);
        System.out.println(r);
    }


}

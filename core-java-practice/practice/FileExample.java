// import java.io.FileNotFoundException;
// import java.io.FileReader;

// public class FileExample{
//     public static void main(String[] args) {
//         try{
//             FileReader r = new FileReader("abc.txt");
//         }
//         catch (FileNotFoundException e){
//             System.out.println(e.getMessage());
//         }
//         int a=10/0;
//     }
// }


public class FileExample{
    int id;
    public FileExample(int id){
        this.id=id;
    }
    @Override
    public String toString(){
        return  "id :"+ id;
    }
    public static void main(String[] args){
        FileExample file=new FileExample(10);
        System.out.println(file);

    }
}
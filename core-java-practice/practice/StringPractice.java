public class StringPractice {
    public static void main(String[] args){
        // String str="Sachin";
        // String str1="Sachin";
        String str= new String("Sachin");
        String str1=new String("Sachin");
        // if(str==str1){
        if(str.equals(str1)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
       
    }
}

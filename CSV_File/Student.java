import java.io.BufferedReader;
import java.io.FileReader;

 public class Student {
    int id;
    String name;
    int age ;
    public Student(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return id+" " +name+" "+ age+ " ";
    }
}

     class ParseCSV{
        public static void main(String[] args) {
            try(
                BufferedReader br= new BufferedReader(new FileReader("student.csv"))
            ){
                br.readLine();
                String line;
                while((line=br.readLine())!=null){
                    String[] data=line.split(",");
                    

                    int id= Integer.parseInt(data[0].trim());

                    String name=data[1].trim();

                    int age= Integer.parseInt(data[2].trim());

                    Student s= new Student(id, name, age);

                    System.out.println(s);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    


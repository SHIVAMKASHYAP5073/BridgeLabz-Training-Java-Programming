import java.io.BufferedReader;
import java.io.FileReader;
class ValidateCSV{
    public static boolean validate(int id, String name, int age ){
        if(id<0){
            return false;
        }
        if(name==null || name.trim().isEmpty()){
            return false;
        }
        if(age<=0 || age>100){
            return false;
        }

        return true;
    }
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

                    if(validate(id, name, age)){
                        System.out.println("valid: "+ name);
                    }
                    else{
                        System.out.println("Inavlid: "+name);
                    }

                    System.out.println(s);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

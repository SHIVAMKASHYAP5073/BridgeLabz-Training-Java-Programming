import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteCSV {
    public static void main(String[] args) {
        try(
            BufferedWriter wr= new BufferedWriter(new FileWriter("student.csv"))
        ){
            wr.write("id, name, age");
            wr.newLine();

            wr.write("1,tiger, 21");
            wr.newLine();

            wr.write("2, tiger zinda h, 22");
            wr.newLine();

            wr.write("3, tiger ab mar gya, 89");

            System.out.println("csv file created");
            
        }

        catch(Exception e){
            e.printStackTrace();


        }
    }
    
}

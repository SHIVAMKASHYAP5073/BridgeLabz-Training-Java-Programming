import java.io.BufferedReader;
import java.io.FileReader;

public class ReadCSV{
    public static void main(String[] args) {
        try(
            BufferedReader br= new BufferedReader(new FileReader("abc.ob"))
        ){
            String line;
            while((line=br.readLine())!=null){
                String[] data= line.split(",");
                for(String value: data){
                    System.out.println(value+ " ");
                }

                System.out.println();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
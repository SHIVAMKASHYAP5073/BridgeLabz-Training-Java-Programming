import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;



 public class AddressBook extends ContactManager
        implements ContactOperations {
            private ArrayList<Address> contacts= new ArrayList<>();
            
            @Override
            public void addContact(Address address)
            throws InvalidContactException{
                if(address.getPhone().length() != 10) {

            throw new InvalidContactException("Phone no must be ten digits");
                    
        }
        contacts.add(address);
        System.out.println("contact added");


            }

            @Override
            public void viewContacts(){
                for(Address a : contacts){
                    System.out.println(a);

                }
            }
            @Override
            public void searchContact(int id){
                for(Address a:contacts){
                 if (a.getId() == id) {

                   System.out.println("Found: " + a);
                    return;
                }
                
            }
            System.out.println("Contact not Found");

            }
            @Override
             public void updateContact(int id, String newName, String newPhone){
                              

                for (Address a : contacts) {

                   if (a.getId() == id) {

                     a.setName(newName);
                     a.setPhone(newPhone);

                       System.out.println("Contact Updated");
                         return;
            }
        }

        System.out.println("Contact Not Found");
    }

            @Override
            public void deleteContact(int id) {

             Iterator<Address> iterator = contacts.iterator();

               while (iterator.hasNext()) {

                  Address a = iterator.next();

                    if (a.getId() == id) {

                     iterator.remove();

                    System.out.println("Contact Deleted");

                return;
            }
        }

        System.out.println("Contact Not Found");
    }

          

@Override
public void saveToFile() {

    try {

        BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter("contact.txt"));

        for (Address a : contacts) {

            writer.write(
                    a.getId() + "," +
                    a.getName() + "," +
                    a.getPhone());

            writer.newLine();
        }

        writer.close();

        System.out.println("Data Saved");

    } catch (IOException e) {

        System.out.println("File Error");
    }
}

@Override
public void readFromFile() {

    try {

        BufferedReader reader =
                new BufferedReader(
                        new FileReader("contact.txt"));

        String line;

        contacts.clear();

        while ((line = reader.readLine()) != null) {

            String[] data = line.split(",");

            int id = Integer.parseInt(data[0]);
            String name = data[1];
            String phone = data[2];

            contacts.add(
                    new Address(id, name, phone));
        }

        reader.close();

        System.out.println("Data Loaded");

        viewContacts();

    } catch (IOException e) {

        System.out.println("Read Error");
    }
}
}

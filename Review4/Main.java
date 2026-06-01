public class Main {
    public static void main(String[] args) {
        AddressBook book= new AddressBook();
        try{
            book.addContact( new Address(1,
                            "Shivam",
                            "9876543210"));

            book.addContact(new Address(2,
                            "Rahul",
                            "9999999999"));

            


            book.viewContacts();

            book.searchContact(1);
             
            book.updateContact(
                    1,
                    "Shivam Kumar",
                    "8888888888");

            book.deleteContact(2);

            book.saveToFile();
             
            book.readFromFile();


        } 
        catch(InvalidContactException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program finished");
        }

        
    }
    
}


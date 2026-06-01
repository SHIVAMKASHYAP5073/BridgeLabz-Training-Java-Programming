public interface ContactOperations {

    void addContact(Address address) throws InvalidContactException;

    void viewContacts();

    void searchContact(int id);

    void updateContact(int id, String newName, String newPhone);

    void deleteContact(int id);
}

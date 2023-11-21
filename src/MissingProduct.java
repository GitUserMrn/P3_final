public class MissingProduct extends Exception { //booknotfoundexception
    public MissingProduct(String p_name) {
        super("Product "+ p_name + " was not found.");
    }
}

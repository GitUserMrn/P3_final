import java.util.ArrayList;
import java.io.*;

interface Storable {
    void storeData(ArrayList<Product> products) throws IOException;
}
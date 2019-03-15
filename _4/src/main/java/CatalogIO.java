import java.io.*;
import java.util.Objects;

public class CatalogIO {

    private Catalog catalog;

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public void save(String fileName){
        FileOutputStream fout;
        ObjectOutputStream oos = null;
        try {
            fout = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fout);
            Objects.requireNonNull(oos).writeObject(this);
        } catch (FileNotFoundException e) {
            System.out.println("Failed to create file named " + fileName);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Failed to serialize the catalog.");
            e.printStackTrace();
        }
    }

    public void load(String fileName){
        FileInputStream fin;
        ObjectInputStream ois = null;
        try {
            fin= new FileInputStream(fileName);
            ois = new ObjectInputStream(fin);
            this.catalog=  (Catalog) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }



}

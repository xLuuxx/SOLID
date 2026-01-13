import java.io.FileWriter;
import java.io.IOException;

public class DocumentSave {
    public void sauvegardeDocument(Document doc) {
        try(FileWriter writer = new FileWriter("documents.txt", true)) {
            writer.write(doc.getType() + " | " + doc.getDate()
                    + " | HT=" + doc.getMontantHT()
                    + " | TVA=" + doc.getTva()
                    + " | TTC=" + doc.getTotalTTC()
                    + " | " + doc.getInfosSupplementaires() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

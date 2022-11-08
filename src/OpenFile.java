import java.io.IOException;

public class OpenFile {

    public void abrirArquivo() {
        System.out.println("Abrindo arquivo...");
        try {
            this.errorException();
        } catch (IOException exception) {
            System.out.println("Error...");
        }
    }

    private void errorException() throws IOException {
        System.out.println("error...");
    }
}

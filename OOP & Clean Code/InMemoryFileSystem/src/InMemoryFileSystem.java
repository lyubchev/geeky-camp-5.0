public class InMemoryFileSystem {
    public static void main(String[] args) {

        FileSystem fs = new FileSystem();
        fs.createDir("home", Permission.READ_WRITE);
        fs.createDir("pesho", Permission.READ_WRITE);
        fs.deleteDir("pesho");
    }
}

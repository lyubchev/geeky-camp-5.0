public class InMemoryFileSystem {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        fs.createDir("100yo", Permission.READ_WRITE);
        fs.changeDir("100yo");
        fs.createDir("pesho", Permission.READ_WRITE);
        fs.changeDir("pesho");
        fs.createFile("100sho", Permission.READ_WRITE, FileType.TEXT, "Pesho e priqtel na 100yo");
        fs.createFile("100sho", Permission.READ_WRITE, FileType.TEXT, "Pesho e priqtel na 100yo");
    }
}

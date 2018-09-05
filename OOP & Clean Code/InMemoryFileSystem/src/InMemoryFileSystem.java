public class InMemoryFileSystem {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        fs.createDir("home", Permission.READ_WRITE);

        fs.createDir("etc", Permission.READ_WRITE);
        fs.changeDir("home");

        fs.createDir("ddos", Permission.READ_WRITE);
        fs.changeDir("ddos");

        fs.changeDir("../");

        fs.changeDir("/etc/");

        fs.createDir("100yoMOLQMAXTOCHKI", Permission.READ_WRITE);
        fs.changeDir("100yoMOLQMAXTOCHKI");

        fs.createDir("smile", Permission.READ_WRITE);
        fs.changeDir("smile");

        fs.changeDir("../../../home/ddos/100yoMOLQMAXTOCHKI");

        fs.changeDir("../");

        fs.deleteDir("100yoMOLQMAXTOCHKI");

        fs.createFile("reddit", Permission.READ_WRITE, FileType.TEXT, "reddithere");

        fs.openFile("reddit");
        fs.editFile("reddit", "redditv2");
        fs.openFile("reddit");
        fs.deleteFile("reddit");
    }
}

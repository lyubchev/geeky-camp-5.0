import java.awt.image.DirectColorModel;

public class FileSystem {
    private Directory root;
    private Directory currentDir;

    public FileSystem() {
        this.root = new Directory("/", Permission.READ_WRITE);
        this.currentDir = this.root;
    }

    public void createDir(String path, Permission permission) {
        FileSystemObject fso;
        // creates folder in root
        if (path.startsWith("/")) {
            fso = new Directory(path, permission);
            this.root.create(fso);
        } else { // creates folder in the specified path
            fso = new Directory(path, permission);
        }
        this.currentDir.create(fso);
    }

    public void createFile(String path, Permission permission, FileType type, String content) {
        FileSystemObject fso = new File(path, type, permission, content);
        this.currentDir.create(fso);
    }

    public void deleteDir(String path) {
        this.currentDir.delete(path);
    }

    public void changeDir(String path) {
        // goes to roof dir
        if (path.equals("..") || path.equals("../")) {
            String parent = this.currentDir.getPath().substring(0, this.currentDir.getPath().length() - 1);
            parent = parent.substring(parent.lastIndexOf('/'));
            this.currentDir = this.currentDir.changeDir(parent);
        }

        if (path.equals("/")) {
            this.currentDir = this.root;
            return;
        }
        // goes to this folder insite root dir
        if (path.startsWith("/")) {
            this.currentDir = this.root;
            path = path.substring(1);
        }
        // goes to the specified folder
        if (path.contains("/")) {
            String[] directories = path.split("/");
            for (String dir : directories) {
                this.currentDir = this.currentDir.changeDir(dir);
            }
        } else {
            this.currentDir = this.currentDir.changeDir(path);
        }
    }
}
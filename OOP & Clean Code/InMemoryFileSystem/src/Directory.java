import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory extends FileSystemObject {


    private Map<String, FileSystemObject> children;

    public Directory(String path, Permission permission) {
        this.path = path;
        this.permission = permission;
        this.children = new HashMap();
    }

    public Directory(Directory dir) {
        this.path = dir.getPath();
        this.permission = dir.getPermission();
        this.children = this.getChildren();
    }

    public Directory changeDir(String path) {
        if (this.children.containsKey(this.path + path + "/")) {
            return (Directory) this.children.get(this.path + path + "/");
        } else {
            System.out.println("Directory doesn't exist");
            return new Directory(this);
        }
    }

    public Map<String, FileSystemObject> getChildren() {
        return children;
    }

    @Override
    public void create(FileSystemObject fso) {
        String path = this.path + fso.getPath() + "/";
        fso.setPath(path);
        this.children.put(fso.getPath(), fso);
    }

    @Override
    public void open() {

    }

    @Override
    public void rename(String newName) {

    }

    @Override
    public void delete(String path) {
        if (this.children.containsKey(this.path + path + "/")) {
            this.children.remove(this.path + path + "/");
        } else {
            System.out.println("Object doesn't exist!");
        }
    }
}
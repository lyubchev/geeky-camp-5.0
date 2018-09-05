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
        if (this.isObjInside(path)) {
            return (Directory) this.children.get(this.path + path + "/");
        } else {
            System.out.println("Directory doesn't exist");
            return new Directory(this);
        }
    }

    public Map<String, FileSystemObject> getChildren() {
        return children;
    }

    public void create(FileSystemObject fso) {
        String path = this.path + fso.getPath() + "/";
        fso.setPath(path);
        this.children.put(fso.getPath(), fso);
    }

    public void open(String path) {
        if(this.isObjInside(path)) {
            System.out.println(((File) this.children.get(this.path + path + "/")).getContent());
        }
        else {
            System.out.printf("Object not found!");
        }
    }

    public void edit(String path, String newContent) {
        if(this.isObjInside(path)) {
            File file = (File)this.children.get(this.path + path + "/");
            file.setContent(newContent);
            this.children.put(path, file);
        }
    }

    public void rename(String newName) {

    }

    public void delete(String path) {
        if (this.isObjInside(path)) {
            this.children.remove(this.path + path + "/");
        } else {
            System.out.println("Object doesn't exist!");
        }
    }

    public boolean isObjInside(String path) {
        return this.children.containsKey(this.path + path+"/");
    }
}
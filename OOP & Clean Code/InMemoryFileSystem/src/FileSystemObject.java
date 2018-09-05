public abstract class FileSystemObject {

    protected Permission permission = Permission.READ_ONLY;
//    protected FileSystemObject parent;
    protected String lastModified = "";

    protected String path = "";
    protected boolean isOpen = false;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Permission getPermission() {
        return permission;
    }
}

public class File extends FileSystemObject{

    private FileType fileType;



    private String content = "";

    public File(String path, FileType type, Permission permission, String content) {
        this.path = path;
        this.content = content;
        this.permission = permission;
        this.fileType = type;
        this.isOpen = false;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

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

    @Override
    protected void create(FileSystemObject fso) {

    }

    @Override
    protected void open() {

    }

    @Override
    protected void rename(String newName) {

    }

    @Override
    protected void delete(String path) {

    }


}

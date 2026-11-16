package File_Handling;

import java.io.FilePermission;

public class FilePermissionEx {
    public static void main(String[] args) {

        FilePermission fp = new FilePermission("C:\\Users\\jinay\\IdeaProjects\\mastring-java\\dummy.txt","read");

        System.out.println(fp.getName());
        System.out.println(fp.getActions());

    }
}

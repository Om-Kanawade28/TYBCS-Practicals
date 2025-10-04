import java.io.File;
import java.util.Scanner;

public class FileDirectoryDemo {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java FileDirectoryDemo <path>");
            return;
        }

        String path = args[0];
        File f = new File(path);

        if (!f.exists()) {
            System.out.println("The given path does not exist.");
            return;
        }

        if (f.isDirectory()) {
            System.out.println(path + " is a Directory.");
            File[] files = f.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

            if (files != null && files.length > 0) {
                System.out.println("Number of text files found: " + files.length);
                Scanner sc = new Scanner(System.in);
                System.out.print("Do you want to delete all text files? (yes/no): ");
                String confirm = sc.nextLine();

                int deletedCount = 0;
                if (confirm.equalsIgnoreCase("yes")) {
                    for (File file : files) {
                        if (file.delete()) {
                            deletedCount++;
                            System.out.println("Deleted: " + file.getName());
                        }
                    }
                }
                System.out.println("Total files deleted: " + deletedCount);
            } else {
                System.out.println("No text files found in the directory.");
            }
        } else if (f.isFile()) {
            System.out.println(path + " is a File.");
            System.out.println("File Name      : " + f.getName());
            System.out.println("Absolute Path  : " + f.getAbsolutePath());
            System.out.println("Readable       : " + f.canRead());
            System.out.println("Writable       : " + f.canWrite());
            System.out.println("File Size      : " + f.length() + " bytes");
            System.out.println("Last Modified  : " + f.lastModified());
        } else {
            System.out.println("The given path is neither a regular file nor a directory.");
        }
    }
}

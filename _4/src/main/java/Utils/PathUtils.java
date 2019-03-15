package Utils;

public class PathUtils {

    static boolean isAbsolute(String path){
        if (path.contains(":"))
            return true;
        return false;
    }

    static boolean isRelative(String path){
        return !PathUtils.isAbsolute(path);
    }
}

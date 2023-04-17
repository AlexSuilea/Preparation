package strings;

import java.util.ArrayList;
import java.util.List;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        List<String> dirs = new ArrayList<>();

        for(String dir: paths) {
            if(dir.isEmpty() || dir.equals(".")){
                continue;
            }

            if(dir.equals("..")){
                if(!dirs.isEmpty()){
                    dirs.remove(dirs.size()-1);
                }
            } else {
                dirs.add(dir);
            }
        }

        return "/" + String.join("/", dirs);

    }
}

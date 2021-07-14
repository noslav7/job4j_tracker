package ru.job4j.list;
import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        boolean check = false;
        int firstElementTrue = list.indexOf(str);
        int lastElementTrue = list.lastIndexOf(str);
        if (firstElementTrue == lastElementTrue) {
            check = true;
        }
        if (firstElementTrue == -1 && lastElementTrue == -1) {
            check = false;
        }
        return check;
    }
}

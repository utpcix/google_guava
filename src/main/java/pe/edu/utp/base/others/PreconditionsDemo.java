package pe.edu.utp.base.others;

import static com.google.common.base.Preconditions.*;

public class PreconditionsDemo {

    public static String getName(String[] names, int idx){
        checkNotNull(names,"names cannot be null");
        checkArgument(idx >= 0, "idx %s cannot be negative",idx);
        checkPositionIndex(idx,names.length,"invalid index value");
        return names[idx];
    }

    public static void main(String[] args) {

        String[] names = {"Linux","Windows","FreeBSD","linux"};
        //String[] names = null;

        try {
            System.out.println("getName(names,10) = " + getName(names, 10));
        } catch (IllegalArgumentException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

    }
}

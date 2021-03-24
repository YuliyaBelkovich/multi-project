package core;

import utils.StringUtils;

public class Utils {
    public static  boolean isAllPositiveNumbers(String... str) {
        StringUtils stringUtils = new StringUtils();
        for (String i : str) {
            if (!stringUtils.isPositiveNumber(i)) {
                return false;
            }
        }
        return true;
    }

}

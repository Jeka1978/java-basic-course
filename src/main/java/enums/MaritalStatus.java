package enums;

import java.io.Serializable;

/**
 * @author Evgeny Borisov
 */
public enum MaritalStatus implements Serializable {
    SINGLE(1, "רווק"), MARRIED(2, "נשוי"), DIVORCED(5, "גרוש"), UNKNOWN(10,"בבירור");

    private final int dbCode;
    private final String hebrewDesc;

   private MaritalStatus(int dbCode, String hebrewDesc) {
        System.out.println("enum was created " + hebrewDesc);
        this.hebrewDesc = hebrewDesc;
        this.dbCode = dbCode;
    }

    public void printHebrewDesc() {
        System.out.println(hebrewDesc);
    }




    public static MaritalStatus findByDbCode(int dbCode) throws IllegalStateException {
        MaritalStatus[] statuses = values();
        for (MaritalStatus status : statuses) {
            if (status.dbCode == dbCode) {
                return status;
            }
        }
//        return UNKNOWN;
        throw new IllegalStateException(dbCode + " not supported");
    }


    @Override
    public String toString() {

        return hebrewDesc;
    }
}




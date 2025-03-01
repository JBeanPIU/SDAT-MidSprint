/*
    By: Cameron Beanland
    Date: Feb. 28th, 2025
*/

package doc.example.domain;

// basic airport class to obtain name and string code of plane num, meant to be used alongside server side
public class Airport {
    private String name;
    private String code;

    public Airport(String name, String code) {
        this.name = name;
        this.code = code;
    }

    /* ================== */
    // Mutators/Accessors, separated by g and s (classic get/set)
    public String gName() {
        return name;
    }
    public void sName(String name) {
        this.name = name;
    }

    /* ================== */
    public String gCode() {
        return code;
    }
    public void sCode(String code) {
        this.code = code;
    }

    /* ================== */
    @Override
    public String toString() {
        return "Airport{name='" + name + "', code='" + code + "'}";
    }
}

public class Week8Task2 {
    /** Ngoai le. */
    public void methodA() throws java.lang.NullPointerException {
        throw new java.lang.NullPointerException();
    }

    /** Ngoai le. */
    public String catchA() {
        try {
            throw new java.lang.NullPointerException();
        } catch (java.lang.NullPointerException n) {
//            System.out.println("Lỗi Null Pointer");
            return "Lỗi Null Pointer";
        }
    }

    /** Ngoai le. */
    public void methodB() throws java.lang.ArrayIndexOutOfBoundsException {
        throw new java.lang.ArrayIndexOutOfBoundsException();
    }

    /** Ngoai le. */
    public String catchB() {
        try {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        } catch (java.lang.ArrayIndexOutOfBoundsException a) {
//            System.out.println("Lỗi Array Index Out of Bounds");
            return "Lỗi Array Index Out of Bounds";
        }
    }

    /** Ngoai le. */
    public void methodC() throws java.lang.ArithmeticException {
        throw new java.lang.ArithmeticException();
    }

    /** Ngoai le. */
    public String catchC() {
        try {
            throw new java.lang.ArithmeticException();
        } catch (java.lang.ArithmeticException ar) {
//            System.out.println("Lỗi Arithmetic");
            return "Lỗi Arithmetic";
        }
    }

    /** Ngoai le. */
    public void methodD() throws java.io.FileNotFoundException {
        throw new java.io.FileNotFoundException();
    }

    /** Ngoai le. */
    public String catchD() {
        try {
            throw new java.io.FileNotFoundException();
        } catch (java.io.FileNotFoundException f) {
//            System.out.println("Lỗi File Not Found");
            return "Lỗi File Not Found";
        }
    }

    /** Ngoai le. */
    public void methodE() throws java.io.IOException {
        throw new java.io.IOException();
    }

    /** Ngoai le. */
    public String catchE() {
        try {
            throw new java.io.IOException();
        } catch (java.io.IOException io) {
            System.out.println("Lỗi IO");
            return "Lỗi IO";
        }
    }
}

public class Week4 {

    /** So lon nhat. */
    public static int max2Int(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /** So be nhat. */
    public static int minArray(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    /** Chi so BMI. */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        bmi = Math.round(bmi * 10) / 10.0;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            return "Bình thường";
        } else if (bmi >= 23 && bmi <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}

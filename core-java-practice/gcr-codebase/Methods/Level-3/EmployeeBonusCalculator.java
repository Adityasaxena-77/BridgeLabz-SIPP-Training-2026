public class EmployeeBonusCalculator {
    public static double[][] generateEmployeeData(int size) {
        double[][] data = new double[size][2];
        for (int i = 0; i < size; i++) {
            data[i][0] = 10000 + (int) (Math.random() * 90000);
            data[i][1] = 1 + (int) (Math.random() * 10);
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] updated = new double[data.length][3];
        for (int i = 0; i < data.length; i++) {
            updated[i][0] = data[i][0];
            updated[i][1] = data[i][1];
            double bonusRate = data[i][1] > 5 ? 0.05 : 0.02;
            updated[i][2] = data[i][0] * bonusRate;
        }
        return updated;
    }

    public static void main(String[] args) {
        double[][] data = generateEmployeeData(10);
        double[][] result = calculateBonus(data);

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < result.length; i++) {
            totalOldSalary += result[i][0];
            totalBonus += result[i][2];
            totalNewSalary += result[i][0] + result[i][2];
        }

        System.out.println("Employee Salary, Years, Bonus, New Salary");
        for (int i = 0; i < result.length; i++) {
            System.out.println("E" + (i + 1) + "\t" + result[i][0] + "\t" + result[i][1] + "\t" + result[i][2] + "\t" + (result[i][0] + result[i][2]));
        }

        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total bonus: " + totalBonus);
        System.out.println("Total new salary: " + totalNewSalary);
    }
}

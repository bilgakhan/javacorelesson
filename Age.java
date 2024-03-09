public class Age {
    public static void main(String[] args) {
        int birthDay = 12;
        int birthMonth = 12;
        int birthYear = 2000;

        int currentDay = 9;
        int currentMonth = 3;
        int currentYear = 2024;

        int[] age = calculateAge(birthDay, birthMonth, birthYear, currentDay, currentMonth, currentYear);

        System.out.println("Age: " + age[0] + " years, " + age[1] + " months, " + age[2] + " days");
    }

    public static int[] calculateAge(int birthDay, int birthMonth, int birthYear, int currentDay, int currentMonth,
            int currentYear) {
        int years = currentYear - birthYear;
        int months = currentMonth - birthMonth;
        int days = currentDay - birthDay;

        if (months < 0 || (months == 0 && days < 0)) {
            years--;
            if (months < 0) {
                months += 12;
            }
        }

        if (days < 0) {
            int previousMonthDays = getMonthDays(currentMonth - 1, currentYear);
            days += previousMonthDays;
            months--;
        }

        return new int[] { years, months, days };
    }

    public static int getMonthDays(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
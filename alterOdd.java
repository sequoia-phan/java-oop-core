class AlternateOddSeries {
    public static void main(String[] args) {
        int num = 9;
        
        for (int i = 1, sign = 1; i <= num; i += 2, sign *= -1) {
            System.out.print(i * sign + " ");
        }
    }
}


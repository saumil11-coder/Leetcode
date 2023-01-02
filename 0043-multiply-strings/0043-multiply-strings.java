class Solution {

    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
     final    char[] array1 = num1.toCharArray();
      final  char[] array2 = num2.toCharArray();

        char[] product = new char[array1.length + array2.length];
        Arrays.fill(product, '0');

        for (int i = array1.length - 1, current = 0; i >= 0; i--) {
            for (int j = array2.length - 1, idx = i + j + 1; j >= 0; j--,idx--) {
                current = (array1[i] - '0') * (array2[j] - '0') + product[idx] - '0';
                product[idx] = (char) (current % 10 + '0');
                product[idx - 1] = (char) (product[idx - 1] + current / 10);
            }
        }
     final    int start = product[0] != '0' ? 0 : 1;
        return String.copyValueOf(product, start, array1.length + array2.length - start);
    }
}

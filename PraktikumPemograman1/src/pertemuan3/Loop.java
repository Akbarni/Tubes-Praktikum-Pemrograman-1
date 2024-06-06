package pertemuan3;

public class Loop {
    public static void main(String[] args) {
        int[] data = {4, 7, 6, 2, 8, 3};

        No2 sorter = new No2();
        sorter.bubble(data);

        // Tampilkan hasil pengurutan
        System.out.print("Deret Nilai setelah diurutkan: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }

    public static class No2 {
        public void bubble(int[] data) {
            int temp;
            int i, j;

            for (i = 0; i < data.length - 1; i++) {
                System.out.println("Pernyataan-1");

                for (j = 0; j < (data.length - 1) - i; j++) {
                    if (data[j] > data[j + 1]) {
                        System.out.println("Pernyataan-2");

                        temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                }
            }
        }
    }
}
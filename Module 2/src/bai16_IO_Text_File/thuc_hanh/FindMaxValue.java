package bai16_IO_Text_File.thuc_hanh;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\codegym\\A0721I1-NguyenTran-Minh-Tri\\Module 2\\src\\bai16_IO_Text_File\\thuc_hanh\\number");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\codegym\\A0721I1-NguyenTran-Minh-Tri\\Module 2\\src\\bai16_IO_Text_File\\thuc_hanh\\result", maxValue);
    }
}

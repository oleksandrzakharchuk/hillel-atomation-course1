package readData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExelSheet {

    @Test
    public void dataReadTest() throws IOException {
        File src=new File("C:\\Users\\zahir\\OneDrive\\Робочий стіл\\test_input.xlsx");
        FileInputStream fis=new FileInputStream(src);
        XSSFWorkbook xsf= new XSSFWorkbook(fis);
        //for .xls files
        //HSSFWorkbook xsf= new HSSFWorkbook(fis);
        XSSFSheet sheet= xsf.getSheetAt(0);

        String entry1 = sheet.getRow(1).getCell(1).getStringCellValue();

        System.out.println("The data in the box is"+entry1);

        //xsf.close();
    }

}

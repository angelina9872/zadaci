package utility;

public class GlavniProgram {

	public static void main(String[] args) {
		ExcelUtils.setExcell("Data (DOM).xls");
		ExcelUtils.setWorkSheet(0);
		ExcelUtils.setDataAt(0,15,"10");
		Integer result = Integer.valueOf(10);		
		System.out.println(result);
		ExcelUtils.closeExcell();
		//System.out.println(ExcelUtils.getDataAt(0, 15));
	}

}

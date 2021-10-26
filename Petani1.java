package semester3_sesi5_pbo;
import java.util.Arrays;
/**
 *
 * @author AD7
 * NIM   : 20200040093
 * NAMA  : ADI SEPRIYADI
 * KELAS : TI20E
 * 
 */
public class Petani1 {

    /**
     * @param args the command line arguments
     */
    public static String[] sortItems(String[] items) {
    for (int i = 0; i < items.length; i++) {
      String temp = items[i];
      int position = i;
      while( position >= 1 && items[position - 1].charAt(0) > temp.charAt(0) ) {
        items[position] = items[position - 1];
        position--;
      }
      items[position] = temp;
    }

    return items;
    }
    public static void main(String[] args) {
    String[] boxOfUnorganizedFruits = 
      {"Apel","Pisang","Anggur","Jambu",
      "Pepaya","Duku","Durian","Jeruk",
      "Mangga","Manggis",};
   
    int boxIndex = 0;
    int containerBoxIndex = 0;
    int boxSize = boxOfUnorganizedFruits.length;
    String[] boxOfOrganizedFruits = sortItems(boxOfUnorganizedFruits);
    String[][] boxesOfOrganizedFruits = new String[5][2];
    String pointer = boxOfOrganizedFruits[0];

    for (int i = 0; i < boxOfOrganizedFruits.length; i++) {
      if (pointer.charAt(0) != boxOfOrganizedFruits[i].charAt(0)) {
        pointer = boxOfOrganizedFruits[i];
        containerBoxIndex++;
        boxIndex = 0;
      }
      if (pointer.charAt(0) == boxOfOrganizedFruits[i].charAt(0)) {
        boxesOfOrganizedFruits[containerBoxIndex][boxIndex] = boxOfOrganizedFruits[i];
        boxIndex += 1;
      } 
    }
    System.out.println(Arrays.deepToString(boxesOfOrganizedFruits));
    }
}

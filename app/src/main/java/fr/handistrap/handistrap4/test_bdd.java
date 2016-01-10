package fr.handistrap.handistrap4;

/**
 * Created by Ozerioss on 26/11/2015.
 */
public class test_bdd {

    String next[] = {};
    List<string[]> list = new ArrayList<string[]>();
    try {
        CSVReader reader = new CSVReader(new InputStreamReader(getAssets().open("test.csv")));//Specify asset file name
//in open();
        for(;;) {
            next = reader.readNext();
            if(next != null) {
                list.add(next);
            } else {
                break;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        - See more at: http://www.theappguruz.com/blog/parse-csv-file-in-android-example-sample-code#sthash.XeI1GjoA.dpuf
}

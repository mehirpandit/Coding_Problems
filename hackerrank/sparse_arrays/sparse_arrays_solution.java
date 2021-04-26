import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
Map<String, Integer> map = new HashMap();
        for(String s: strings){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int[] res = new int[queries.length];
        for(int i = 0; i<queries.length; i++){
            if(map.containsKey(queries[i])){
                res[i] = map.get(queries[i]);
            } else {
                res[i] = 0;
            }
        }
        return res;

        
    }//end func
  
  
  
//       static int[] matchingStrings(String[] strings, String[] queries) {
//         int n_q = queries.length;
//         int n_s = strings.length;
//         int[] result = new int[n_q];
        
//         for(int i=0; i<n_q;i++){
//             for(int j=0; j<n_s; j++){
//              if(queries[i].equals(strings[j]))
//                 result[i]++;
//             }
//         }
//         return result;
        
//     }//end func


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

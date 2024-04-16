package org.example.Utils;

/**
 * This utility function is to help auto generate and format test cases after you press the submission button. Note
 * that the description of a LeetCode problem has the base test cases before doing an actual submission which you can
 * just copy. This is for after you press submit and it runs a lot more tests but doesn't give you the test cases,
 * only the input, output, and expected results.
 *
 * @param testCase
 */
public class FormatLCTestCase {
    /**
     *
     * @param testCase This will be the test case inputs. Format it all as a single String with the following layout
     *                 Line 1: The problem input arguments
     *                 Line 2: The problem return output arguments (not the expected outputs, the return data from
     *                 each method call
     *                 Line 3: The expected outputs. Elements that contain null will be ignored for generating test
     *                 case assertions.
     * @return The string representation of the generated code
     */
    public static String formatLCTestCase(String testCase){
        String[] splitTestCase = testCase.split(System.lineSeparator());
        // Sanitize input
        for(int i = 0; i < splitTestCase.length; i++){
            String line = splitTestCase[i].substring(1, splitTestCase[i].length() -1);
            line = line.replace("\"", "");
            line = line.replace("[", "|");
            line = line.replace("]", "");
            splitTestCase[i] = line;
        }

        int iterator = 0;

        String[] methods = splitTestCase[0].split(",");
        // Insert vomit emoji
        String[] methodArguments =
                splitTestCase[1].substring(1,splitTestCase[1].length()).replace(",|","|").split("\\|");
        String[] expectedOutput = splitTestCase[2].split(",");
        String className = splitTestCase[0].split(",")[0];
        String classVariableName = Character.toLowerCase(className.charAt(0)) + className.substring(1);

        StringBuilder result = new StringBuilder();
        result.append(String.format("%s %s = new %s();\n", className, classVariableName, className));

        for (String s : methods){
            // Generate constructor
            if (iterator > 0){
                String method = methods[iterator];
                String methodArg = methodArguments[iterator];
                String expected = expectedOutput[iterator];
                if (expected.equals("null")){
                    result.append(String.format("%s.%s(%s);\n",classVariableName, method, methodArg));
                } else {
                    result.append(String.format("assertEquals(%s,%s.%s(%s));\n",expected, classVariableName,
                            method, methodArg));
                }
            }
            iterator++;
        }

        return result.toString();
    }
}

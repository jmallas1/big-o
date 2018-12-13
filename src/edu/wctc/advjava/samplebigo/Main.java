package edu.wctc.advjava.samplebigo;

public class Main
{
    public static void main(String[] args)
    {
        String[] strArray;
        String someString;

        // O(1)
        strArray = new String[5];
        if (IsFirstElementNull(strArray))
        {
            System.out.println("Frist element null");
        }

        // O(N)
        strArray = new String[5];
        strArray[0] = "Hello";
        strArray[1] = "GOODBYE";
        strArray[2] = "SEE YA";
        strArray[3] = "Hello";
        strArray[4] = "Junk";
        someString = "Advanced Java";
        if(!ContainsValue(strArray, someString))
        {
            System.out.println("String array does not contain the value");
        }

        // O(N2)
        strArray = new String[5];
        strArray[0] = "Hello";
        strArray[1] = "GOODBYE";
        strArray[2] = "SEE YA";
        strArray[3] = "Hello";
        strArray[4] = "Junk";
        if (ContainsDuplicates(strArray))
        {
            System.out.println("Array has duplicates");
        }
        // O(2N)
        Integer seed = 8;
        String theSequence = "";

        for (int x = 0; x <= 20; x++)
        {
            seed = Fibonacci(x);
            theSequence += seed.toString() + ", ";
        }
        System.out.println(theSequence);
    }

    /**
     * // O(1)
     * @param elements
     * @return
     */
    private static Boolean IsFirstElementNull(String[] elements)
    {
        return elements[0] == null;
    }

    /**
     * // O(N)
     * @param elements
     * @param value
     * @return
     */
    private static Boolean ContainsValue(String[] elements, String value)
    {
        for (String element : elements)
        {
            if (element.equals(value)) return true;
        }

        return false;
    }

    /**
     * // O(N2)
     * @param elements
     * @return
     */
    private static Boolean ContainsDuplicates(String[] elements)
    {
        for (int outer = 0; outer < elements.length; outer++)
        {
            for (int inner = 0; inner < elements.length; inner++)
            {
                // Don't compare with self
                if (outer == inner) continue;

                if (elements[outer] == elements[inner]) return true;
            }
        }

        return false;
    }

    /**
     * // O(2N)
     * @param num
     * @return
     */
    private static Integer Fibonacci(Integer num)
    {
        if (num <= 1) {return num;}

        return Fibonacci(num - 2) + Fibonacci(num - 1);
    }
}

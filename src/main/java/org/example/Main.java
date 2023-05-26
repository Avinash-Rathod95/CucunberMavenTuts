package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        String str = "Avinash7595";
        String [] sep = str.split("(?<=\\D)(?=\\d)");
        System.out.println(sep[0]+"           "+ sep[1]);
        */
        /*
        String str = "avinash";
        char [] cArray = str.toCharArray();
        System.out.println("Original String :"+str);
        for(int i=0; i < str.length(); i++){
            for (int j=i+1; j<str.length(); j++){
                if (cArray[i]==cArray[j])
                {
                    System.out.println("Duplicate Character is: "+cArray[j]+" ");
                    break;
                }
            }
        }
         */
        /*
        int[] array = {3, 6, 9, 5};
        List<Integer> arrayList = new ArrayList<Integer>(); {
            arrayList.add(array[0]);
            arrayList.add(array[2]);
            arrayList.set(1,array[0]);
            arrayList.set(1,array[1]);
            arrayList.remove(0);
            arrayList.add(array[0]);
            System.out.println(arrayList);
        }
         */
        String str = "Java Online Compiler";
        String[] arr = str.split(" ");
        for(int i=0; i< arr.length; i++)
        {
            for (int j=arr[i].length()-1; j>=0; j--)
            {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
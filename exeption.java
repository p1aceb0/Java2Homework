package com.julie_meme.lesson2;

import java.util.Arrays;

public class exeption {



    public static void main(String[] args) {

        String s = "1 3 1 2 \n 2 3 2 2 \n 5 6 7 1 \n 3 3 1 0";

        try {
            getTogether(s);
        } catch (WrongSignException e) {
            e.printStackTrace();
        } catch (WrongSizeException e) {
            e.printStackTrace();
        }


    }

    public static String[][] convertToMassive(String s){
        String[] str = s.split("\n");
        String[][] matrix = new String[str.length][];
        for(int i = 0; i<str.length; i++){
             matrix[i] = str[i].split(" ");
            }
        //System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }


    public static int[][] turnToInt(String[][] array) throws WrongSizeException, WrongSignException {
        int[][]n = new int[array.length][array[0].length];
        for(int i = 0; i < array.length; i++){
              for(int j = 0; j < array[i].length; j++){
                if (!(array[i][j].matches(("[0-9]+")))) {
                    throw new WrongSignException();
                }
                n[i][j] = Integer.parseInt(array[i][j]);

                }
                    }
        if((!(n.length == 4 )) && (!(n[0].length == 4))){
            throw new WrongSizeException();
        }
        return n;
    }


    public static int getHalfSum(int[][] array){
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j <array[i].length; j++){
                sum += array[i][j];
            }
        }
        return sum/2;

    }

    public static void getTogether(String str) throws WrongSignException, WrongSizeException {
       String[][] line  = convertToMassive(str);
       int[][] n =  turnToInt(line);
        System.out.println(getHalfSum(n));

    }
}






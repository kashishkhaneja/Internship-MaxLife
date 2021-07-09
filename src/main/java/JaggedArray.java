class JaggedArray {
    public static void main(String args[]) {
        int arr[][] = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];
        int i, j;
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 3;
        arr[2][0] = 6;
        for (i = 0; i < arr.length; i++)    //arr.length gives me the number of rows in the array
        {
            for (j = 0; j < arr[i].length; j++)    // arr[i].length returns the number of elements in i-th index row
            {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }
    }

}
package Tasks.MayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    Scanner input = new Scanner(System.in);
    Random random = new Random();
    String[][] board;
    String[][] selectedArea;
    int row, col, mines;

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void run(){
        board = new String[row][col];
        selectedArea= new String[row][col];

        mines = (row*col) / 4;

        for (int i=0;i< board.length;i++){
            for (int j=0;j< board.length;j++){

                board[i][j]="-";
                selectedArea[i][j]="-";
            }
        }

        while (mines > 0){

            int i = random.nextInt(row);
            int j = random.nextInt(col);

            if (board[i][j].equals("-")){
                board[i][j] = "*";
                mines--;
            }
        }

        printSelectedArea();

        play();

    }

    public void play(){
        boolean end = false;
        while (!end){
            System.out.print("Satır Giriniz : ");
            int selectRow = input.nextInt();
            System.out.print("Sütun Giriniz : ");
            int selectCol = input.nextInt();

            int number = 0;

            if (selectRow < row && selectCol < col){
                if (board[selectRow][selectCol].equals("-") && selectedArea[selectRow][selectCol].equals("-")){
                    for (int i=selectRow- 1; i< selectRow+2; i++){
                        for (int j =selectCol-1;j < selectCol+2;j++){
                            if (i >= 0 && j >= 0 && i<row && j < col && board[i][j].equals("*")){
                                number++;
                                selectedArea[selectRow][selectCol] = Integer.toString(number);
                            }else {
                                selectedArea[selectRow][selectCol] = Integer.toString(number);
                            }
                        }
                    }
                    printSelectedArea();

                    if (!isWin()){
                        System.out.println("Kazandınız!");
                        printBoard();
                        end = true;
                    }

                }else if (board[selectRow][selectCol].equals("*")){
                    System.out.println("Mayın patladı. Kaybettiniz...");
                    printBoard();
                    end = true;

                }else if (!selectedArea[selectRow][selectCol].equals("-")){
                    System.out.println("Bu alan daha önce seçildi.");
                }
            }else {
                System.out.println("Alan dışında bir seçim yaptınız.");
            }
        }
    }

    public void printSelectedArea(){

        for (int i=0;i< selectedArea.length;i++){
            for (int j=0;j<selectedArea[i].length;j++){

                System.out.print(selectedArea[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void printBoard(){
        for (int i=0;i< board.length;i++){
            for (int j=0;j< board[i].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public boolean isWin(){
        int counter = 0;
        int mines = 0;

        for (int i=0;i<selectedArea.length;i++){
            for (int j=0; j<selectedArea[i].length;j++){

                if (selectedArea[i][j].equals("-")){
                    counter++;
                }if (board[i][j].equals("*")){
                    mines++;
                }
            }
        }

        if (mines == counter){
            return false;
        }
        return true;
    }

}

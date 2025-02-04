package com.method.LevelThree;

import java.util.Random;
import java.util.Scanner;

public class MatrixManipulation {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = generateRandomMatrix(rows, cols);
        int[][] matrix2 = generateRandomMatrix(rows, cols);

        System.out.println("\nMatrix 1:");
        printMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);

        System.out.println("\nMatrix Addition:");
        printMatrix(addMatrices(matrix1, matrix2));

        System.out.println("\nMatrix Subtraction:");
        printMatrix(subtractMatrices(matrix1, matrix2));

        if (rows == cols) {
            System.out.println("\nTranspose of Matrix 1:");
            printMatrix(transposeMatrix(matrix1));
        } else {
            System.out.println("\nTranspose can only be found for square matrices.");
        }

        System.out.print("\nEnter columns for Matrix 2 for multiplication: ");
        int cols2 = scanner.nextInt();
        int[][] matrix3 = generateRandomMatrix(cols, cols2);
        System.out.println("\nMatrix 3:");
        printMatrix(matrix3);

        System.out.println("\nMatrix Multiplication:");
        printMatrix(multiplyMatrices(matrix1, matrix3));

        scanner.close();
    }

            public static int[][] generateRandomMatrix(int rows, int cols) {
                Random random = new Random();
                int[][] matrix = new int[rows][cols];

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        matrix[i][j] = random.nextInt(10);
                    }
                }
                return matrix;
            }

            public static void printMatrix(int[][] matrix) {
                for (int[] row : matrix) {
                    for (int value : row) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                }
            }

            public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
                int rows = matrix1.length;
                int cols = matrix1[0].length;
                int[][] result = new int[rows][cols];

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                return result;
            }

            public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
                int rows = matrix1.length;
                int cols = matrix1[0].length;
                int[][] result = new int[rows][cols];

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        result[i][j] = matrix1[i][j] - matrix2[i][j];
                    }
                }
                return result;
            }
            public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
                int rows1 = matrix1.length;
                int cols1 = matrix1[0].length;
                int cols2 = matrix2[0].length;
                int[][] result = new int[rows1][cols2];

                for (int i = 0; i < rows1; i++) {
                    for (int j = 0; j < cols2; j++) {
                        for (int k = 0; k < cols1; k++) {
                            result[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }
                return result;
            }

            public static int[][] transposeMatrix(int[][] matrix) {
                int rows = matrix.length;
                int cols = matrix[0].length;
                int[][] transpose = new int[cols][rows];

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        transpose[j][i] = matrix[i][j];
                    }
                }
                return transpose;
            }


        }




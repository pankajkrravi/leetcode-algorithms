package com.demo.project.arrayCode;

/**
 * @Author pankaj
 * @create 4/29/21 8:05 PM
 */
// 1232. Check If It Is a Straight Line
public class IsaStraightLine {
    /*Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
    Output: true
    Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
    Output: false
    Constraints:
    2 <= coordinates.length <= 1000
    coordinates[i].length == 2
    -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
    coordinates contains no duplicate point.

    */
    public static void main(String[] args) {
        int[][] coordinates = {
                {1,1},{2,2},{3,4},{4,5},{5,6},{7,7}
        };
        System.out.println(checkStraightLine(coordinates));
    }
    public static boolean checkStraightLine(int[][] coordinates) {

        for (int i=2;i<coordinates.length;i++){
            if ((coordinates[1][1]-coordinates[0][1])*(coordinates[i][0] - coordinates[0][0]) !=
                    (coordinates[1][0] - coordinates[0][0])*(coordinates[i][1]-coordinates[0][1])){
                return false;
            }
        }
        return true;
    }
}

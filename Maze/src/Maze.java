import java.util.ArrayList;
import java.util.List;

class Maze {

    public boolean dfs(int[][] maze, int row, int col, boolean[][] visited, List<int[]> path){
        // Check if we are out of bounds of the maze
        if(row < 0 || col < 0 || row >= maze.length || col >= maze[0].length)
            return false;
        // Check if we are going into the wall or into a visited part
        if(maze[row][col] == 0 || visited[row][col])
            return false;

        path.add(new int[]{row, col});
        visited[row][col] = true;
        // Check if we are at the finish
        if(maze[row][col] == 3)
            return true;
        // Recursion where we are sending and checking next coordinates
        if(dfs(maze, row + 1, col, visited, path) ||
            dfs(maze, row - 1, col, visited, path) ||
            dfs(maze, row, col + 1, visited, path) ||
            dfs(maze, row, col - 1, visited, path)){
            return true;
        }

        path.remove(path.size() - 1);

        return false;
    }

    public void solveMaze(int[][] maze, int startRow, int startCol) {

        boolean[][] visited = new boolean[maze.length][maze[0].length];
        List<int[]> path = new ArrayList<>();

        dfs(maze, startRow, startCol, visited, path);

        for (int[] p : path) {
            System.out.print("(" + p[0] + ", " + p[1] + ") ");
        }
    }

}
